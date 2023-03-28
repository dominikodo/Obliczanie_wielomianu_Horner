package com.odo.zadania.mob;


import javax.swing.*;

class HornerTest {

    public static void main(String[] args) {

        Horner horner = new Horner();
        HornerGUI hornerGUI = new HornerGUI(horner);



        hornerGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hornerGUI.setVisible(true);




        //horner.odczytZPliku();
        System.out.println("wynik test: "+ horner.obliczWielomin());

    }
}