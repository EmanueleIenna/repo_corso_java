package org.example;

import java.util.*;

public class Student { public static void Studenti(){
  String[]nomi = {"Rambo","Vedova Nera"};
    int[]eta = {17,18};
    int[]voto={8,7};
    int[]id={1,2};
    HashMap<String, Integer> Id = new HashMap<String, Integer>();
    Id.put("Rambo",1);
    Id.put("Vedova Nera",20);
    System.out.println(Id.get("Rambo"));
System.out.println(Id.get("Vedova Nera"));
}
public static void libreria(){
HashSet<String> Libreria = new HashSet<>();
Libreria.add("il trono di spade");
  Libreria.add("paperino");
  Libreria.add("il signore degli anelli");
  Libreria.add("topolino");
  Libreria.add("paperino");

System.out.println("i libri sono;"+ Libreria.size());
System.out.print("i libri sono:");
  Iterator<String> it = Libreria.iterator();
while(it.hasNext()) {
System.out.print(it.next() + ",");}}
}