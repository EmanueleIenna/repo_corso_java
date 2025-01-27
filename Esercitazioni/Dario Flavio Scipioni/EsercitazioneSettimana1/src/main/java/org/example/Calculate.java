package org.example;

public class Calculate {

    public static boolean isPari(int inserito){
        boolean isParo = false;
        if(inserito %2 == 0){
            return true;
        }
        return isParo;
    }

    public static boolean isDispari(int inserito){
        if(inserito %2 != 0){
            return true;
        }
        return false;
    }
}
