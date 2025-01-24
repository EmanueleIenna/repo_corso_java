package org.example;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        InputManager inputManager = new InputManager();
        CollectionUtilities utils = new CollectionUtilities();

        Collection<Integer> inputs = inputManager.getInputsFromUser();

        JsonDto jsonDto = new JsonDto(inputs,
                utils.printMaxMinAverageFromNumsCollection(inputs),
                utils.getEvenAndOddMapFromIntsCOllection(inputs));

        jsonFileWriter(jsonDto);
        List<Number> testNum = fileReaderNumbers();
        System.out.println(testNum);
    }
   // scrive un json da un oggetto, nel caso di questo esercizio ho concepito un oggetto che riportasse
   // i dati da noi trovati nei suoi parametri

    public static void jsonFileWriter (Object jsonDto) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
        FileWriter fileWriter = new FileWriter("file json creato");
        objectMapper.writeValue(fileWriter, jsonDto);
        fileWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("File json salvato con successo");

    }

    private final static String fileName = "numbersList.txt";

    // legge il file e ritorna una lista di nunmeri primi
    public static  List<Number> fileReaderNumbers(){
        InputManager inputManager = new InputManager();
        List<Number> results = new ArrayList<>();
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                char[] a = data.toCharArray();
                for (Character element : a){
                    if (inputManager.isInputANumber(element.toString())){
                        Integer number = Integer.parseInt(element.toString());
                        if (!isNumberPrime(number)){
                            results.add(number);
                        }
                    }
                }
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return results;

    }

    private static boolean isNumberPrime(Integer num){
        boolean flag = false;

        // 0 and 1 are not prime numbers
        if (num == 0 || num == 1) {
            flag = true;
        }

        for (int i = 2; i <= num / 2; ++i) {

            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }

}