package org.example;

import java.util.*;

public class CollectionUtilities {


    // ritorna una mappa con chiave pari o dispari

    public Map<String, List<Integer>> getEvenAndOddMapFromIntsCOllection(Collection<Integer> numbers){
        Map<String, List<Integer>> result = new HashMap<>();
        List<Integer> oddNums = new ArrayList<>();
        List<Integer> evenNums = new ArrayList<>();
        numbers.forEach(
                (num)-> {
                    if (num % 2 == 0) {
                        evenNums.add(num);
                    } else {
                        oddNums.add(num);
                    }
                }
        );
        result.put("Even", evenNums);
        result.put("Odd", oddNums);
        return result;
    }

    // ritorna una mappa nome valore e valore e li stampa
    public Map<String,Integer> printMaxMinAverageFromNumsCollection(Collection<Integer> numbers) throws ArithmeticException{


        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        int totalNumbers = 0;
        int averageNumber = 0;
        int totalValue = 0;

        for (Integer num : numbers) {
            totalValue += num;
            if (num >= maxNum){
            maxNum = num;
            }
            if (num < minNum){
            minNum = num;
            }
            totalNumbers++;
        }
        averageNumber = totalValue / totalNumbers;
        Map<String, Integer> results = Map.of("numeroPiùGrande",minNum,"numeroPiùPiccolo",maxNum, "media",averageNumber, "sommaNumeri", totalValue);
       System.out.println("min number: " + minNum + "\nmax number: " + maxNum + "\naverage num: " + averageNumber);
       return results;
    }

}
