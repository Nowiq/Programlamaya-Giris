package javaapplication3;
import java.text.SimpleDateFormat;
import java.util.Date;



public class JavaApplication3 {

  
    public static void main(String[] args) {
    
        SimpleDateFormat sekli = new SimpleDateFormat("dd/m/yyyy");       
        Date tarih = new Date();
        System.out.print(sekli.format(tarih));
        
        //Nowiq
    }   
    
}
