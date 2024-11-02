/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasUts;

/**
 *
 * @author KHAIRUL
 */
public class BmiBeraksi {
    public static void main(String[] args) {
{
 Bmi BmiKu = new Bmi();
    BmiKu.setBmi(75, 1.60);
    System.out.println("Saya         ");
    System.out.println("berat badan  : 75");
    System.out.println("tinggi badan : 160 ");
    System.out.println("BMI          : "+ Math.round(BmiKu.getBmi()));
    System.out.println();
}

{
 Bmi BmiAgus = new Bmi();
    BmiAgus.setBmi(60, 1.75);
    System.out.println("nama         : Agus");
    System.out.println("berat badan  : 60");
    System.out.println("tinggi badan : 175");
    System.out.println("BMI          : "+ Math.round(BmiAgus.getBmi()));
    System.out.println();
}

{
Bmi BmiPutri = new Bmi();
   BmiPutri.setBmi(50, 1.80);
   System.out.println("nama          : Putri");
    System.out.println("berat badan  : 50");
    System.out.println("tinggi badan : 180");
    System.out.println("BMI          : "+ Math.round(BmiPutri.getBmi()));
    System.out.println();
}

    }
}