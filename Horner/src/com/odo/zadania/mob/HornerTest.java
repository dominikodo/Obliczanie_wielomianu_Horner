package com.odo.zadania.mob;


import javax.swing.*;

class HornerTest {

    public static void main(String[] args) {

        HornerGUI hornerGUI = new HornerGUI();

        Horner horner = new Horner();

        hornerGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hornerGUI.setVisible(true);




        horner.odczytZPliku();
        System.out.println("wynik test: "+ horner.obliczWielomin());

    }
}