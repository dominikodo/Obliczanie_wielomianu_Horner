package com.odo.zadania.mob;


import java.util.ArrayList;

public class Horner {

    private int x;//deklara

    private ArrayList <Integer> a;

    Horner(){
    a = new ArrayList<>();

    x=-7;

    a.add(0);
    a.add(-10);
    a.add(-8);
    a.add(-50);
    a.add(0);
    a.add(-6);
    a.add(-1);


    }

    void odczytZPliku (String nazwa){


    }

    int obliczWielomin(){

        int wynik=a.get(a.size()-1);

        for(int i = a.size(); i>1; i-- ){

            //double awiel = a.get(i-1);
            //double awielstopniamnijeszego = a.get(i-2);


            wynik= (wynik * x ) + a.get(i-2);
            System.out.println("i: "+ i);
            System.out.println("wynik: "+ wynik);


        }

        return wynik;

    }
}
