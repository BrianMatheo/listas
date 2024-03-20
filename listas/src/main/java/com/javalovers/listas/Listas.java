package com.javalovers.listas;
import java.util.ArrayList;
public class Listas {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        
        arrayList.add("Hola");
        arrayList.add("Mundo");
        arrayList.add("Cruel");
        
        ArrayList<String> total = new ArrayList<>();
        total.add("nuevo");
        total.add("viejo");
        
        total.addAll(arrayList);
        
        System.out.println(total);
        
        arrayList.set(2,"bonito");
        
        arrayList.remove(0);
        
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
    }
}
