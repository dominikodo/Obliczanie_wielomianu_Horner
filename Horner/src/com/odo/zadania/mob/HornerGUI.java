package com.odo.zadania.mob;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HornerGUI extends JFrame implements ActionListener {

    private JButton bOtworz= new JButton();
    private JButton dodaj = new JButton();
    private JButton oblicz = new JButton();

    private JLabel xTekst = new JLabel();
    private JLabel tOtworz = new JLabel();
    private JTextField xWpisz= new JTextField();


    HornerGUI(){
        setSize(500,500);  //wymiary okna
        setTitle("Horner");//tytul okna
        setLayout(null);



        xTekst.setText("Podaj x:");
        tOtworz.setText("Kliknij aby otworzyć plik z liczbami a:");


        xWpisz.setToolTipText("Wpisz wartość x:");//wyświtla tekst po najechaniu

        dodaj.setText("Dodaj");
        bOtworz.setText("Otwórz");


        xTekst.setBounds(40,10,100,70); // ustawi wymiary
        xWpisz.setBounds(130, 30, 100 ,30 );
        dodaj.setBounds(270, 30, 100, 30 );


        tOtworz.setBounds(40,110,230,30);
        bOtworz.setBounds(270, 110 , 100 , 30 );

        //oblicz.setBounds();

        add(xTekst);//dodaj obiekt do jframe przec co staje się wydoczny
        add(xWpisz);
        add(tOtworz);

        add(bOtworz);
        add(dodaj);
        add(oblicz);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
