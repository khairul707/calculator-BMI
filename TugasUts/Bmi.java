/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasUts;

/**
 *
 * @author KHAIRUL
 */
public class Bmi {
    double bmi;
    
             
    
    void setBmi (double berat, double tinggi)
    {
        bmi= berat/(tinggi*tinggi);   
    }
    
    double getBmi ()
    {
        if (bmi < 18)
    {        
        System.out.println("kategori     : UnderWeight");
    }
        
        else if (bmi > 18 && bmi <=24)
    {
        System.out.println("kategori     : Normal");
    }    
        
        else if (bmi >24 && bmi <= 29)
    {
        System.out.println("kategori    : OverWeight");  
    }  
        
        else if (bmi >29)
    {       
        System.out.println("kategori     : Obesity");
    } 
      
     return bmi;   
    }        
}
