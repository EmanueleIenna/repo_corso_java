package org.example;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class JsonModel {

    private String numeriOriginali = "Numeri originali: ";
    private String classificazione = "Classificazione: ";
    private String statistiche = "Statistiche: ";

    public JsonModel(Collection<Integer> originNums, Map<String, Integer> values, Map<String, List<Integer>> evenOrOddValues){
        setNumeriOriginali(originNums);
        setStatistiche(values);
        setClassificazione(evenOrOddValues);

    }

    public void setNumeriOriginali(Collection<Integer> numeriùriginali) {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (Integer num : numeriùriginali) {
            stringBuilder.append(String.valueOf(num) + ",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        stringBuilder.append("]");
        this.numeriOriginali = this.numeriOriginali.concat(String.valueOf(stringBuilder));
    }

    public void setClassificazione(Map<String, List<Integer>> values){
        StringBuilder stringBuilder = new StringBuilder();
        for(Map.Entry<String, List<Integer>> entry : values.entrySet()){
            stringBuilder.append(entry.getKey() + " " + entry.getValue().toString() + " ");
        }
        this.classificazione = this.classificazione.concat(String.valueOf(stringBuilder));
    }

    public void setStatistiche(Map<String, Integer> values){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(" min: " + values.get("numeroPiùPiccolo") + ",");
        stringBuilder.append(" max: " + values.get("numeroPiùGrande") + ",");
        stringBuilder.append(" average: " + values.get("media")+ ",");
        this.statistiche = this.statistiche.concat(String.valueOf(stringBuilder));
    }

    @Override
    public String toString() {
        return "\"\n " +numeriOriginali + "\n " + statistiche + "\n " + classificazione + "\n\" " ;
    }
}
