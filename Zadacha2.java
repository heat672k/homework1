package com.company;
import java.util.Scanner;
public class Zadacha2 {
    public static void main(String[] args) {
        DniVMeseca();
    }
    public static void DniVMeseca() {
        System.out.println("Napishi mesec: ");
        Scanner skanner = new Scanner(System.in);
        String Mesec = skanner.nextLine();

        if(Mesec.equals("Qnuari") || Mesec.equals("Mart") || Mesec.equals("Mai") || Mesec.equals("Iuli") || Mesec.equals("Avgust") || Mesec.equals("Oktomvri") || Mesec.equals("Dekemvri")) System.out.println(Mesec + "-> 31");
        else if  (Mesec.equals("April") || Mesec.equals("Iuni") || Mesec.equals("Septemvri") || Mesec.equals("Noemvri")) System.out.println(Mesec + "-> 30");
        else if  (Mesec.equals("Fevruari")) System.out.println(Mesec + "-> 28");

    }

}