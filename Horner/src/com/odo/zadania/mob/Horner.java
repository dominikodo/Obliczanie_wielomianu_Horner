package com.odo.zadania.mob;


import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Horner {

    private double x;//deklara

    private ArrayList <Double> a;

    Horner(){
    a = new ArrayList<>();

    x=-7;

    /*
    a.add(0.0);
    a.add(-10.0);
    a.add(-8.0);
    a.add(-50.0);
    a.add(0.0);
    a.add(-6.0);
    a.add(-1.0);
    */

    }

    void odczytZPliku (File file){

        //File file = new File("plik.txt");//tworzenie obiektu file

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                a.add(Double.parseDouble(scanner.nextLine()));
                System.out.println(a);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku lub nie da się otworzyć");
        }

    }


    double obliczWielomin(){

        double wynik=a.get(a.size()-1);

        for(int i = a.size(); i>1; i-- ){

            System.out.println("i: "+ i);
            wynik= (wynik * x ) + a.get(i-2);
            //System.out.println("wynik: "+ wynik);

        }

        return wynik;

    }
    void setX(double x){
    
        this.x= x; 

    }
    double getX(){
    
        return x;
        
    }
    void addA(double newA){
    
        a.add(newA);
        
    }
    
    ArrayList getA(){
    
        return a;
        
    }
    
}
