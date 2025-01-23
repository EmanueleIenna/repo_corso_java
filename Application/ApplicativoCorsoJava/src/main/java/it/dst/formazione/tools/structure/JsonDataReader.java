package it.dst.formazione.tools.structure;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonDataReader {
    public static void leggiJson() {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            CollectionType listType =
                    objectMapper.getTypeFactory()
                            .constructCollectionType(List.class, DataEntry.class);

            List<DataEntry> entries = objectMapper.readValue(
                    new File("C:\\Users\\peps2\\Downloads\\data.json"),
                    listType
            );

            System.out.println("Totale voci JSON: " + entries.size());
            for (DataEntry entry : entries) {
                System.out.println(entry);
            }

        } catch (IOException e) {
            System.err.println("Errore nella lettura del file JSON: " + e.getMessage());
        }
    }

    // Classe interna per rappresentare i dati JSON
    static class DataEntry {
        private long value;
        private String call;
        private String put;

        // Getter e setter necessari per Jackson
        public long getValue() { return value; }
        public void setValue(long value) { this.value = value; }
        public String getCall() { return call; }
        public void setCall(String call) { this.call = call; }
        public String getPut() { return put; }
        public void setPut(String put) { this.put = put; }

        @Override
        public String toString() {
            return "Value: " + value + ", Call: " + call + ", Put: " + put;
        }
    }
}