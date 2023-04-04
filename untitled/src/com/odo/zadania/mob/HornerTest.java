package com.odo.zadania.mob;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*

    Program pobiera z pliku współczynniki najpierw od x^0 do x^n

 */
class HornerTest {

    public static void main(String[] args) {

        boolean wylacz = false;
        while (wylacz==false) {


            Horner horner = new Horner();
            Scanner scanner1 = new Scanner(System.in);


            ArrayList<Double> a = new ArrayList<>();

            String nazwaPliku = new String();

            System.out.println("Podaj nazwe ścieżkę pliku: ");

            nazwaPliku = scanner1.nextLine();


            horner.odczytZPliku(nazwaPliku);


            System.out.println("Podaj x: ");

            try{

                horner.setX(scanner1.nextDouble());

            }catch (InputMismatchException e){
                System.out.println("wpisałeś złe dane");
                System.exit(0);
            }



            a = horner.getA();

            String wielomian = new String();

            for(int i = a.size(); i>0; i-- ) {

                if(a.get(i-1)==0){

                }
                else{
                    if(i==0){

                        wielomian= wielomian  + a.get(i-1);
                    }
                    else{

                        wielomian = wielomian + a.get(i-1) + "x^" + (i-1) + " + ";
                    }
                }

            }

            System.out.println("Wielommian: W("+ horner.getX() + ") = " + wielomian);


            System.out.println("Wynik W(" + horner.getX() + ") = " + horner.obliczWielomin());

            //System.out.println("Jeśli chcesz zakończyć wpisz 0");


            //if(scanner2.nextInt()==0){

               // wylacz=true;

           //}
        }

    }
}