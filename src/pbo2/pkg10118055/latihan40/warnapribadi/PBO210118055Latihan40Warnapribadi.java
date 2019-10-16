/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan40.warnapribadi;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO210118055Latihan40Warnapribadi {


    /**
     * @param args the command line arguments
     */
  
      
            
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        warna warna1 = new warna();
        warna1.tampil();
       
        
        System.out.println("pilih warna favoritmu: ");
        Scanner userInput = new Scanner(System.in);
        warna1.setFav(userInput.nextLine());
        
         Scanner input = new Scanner(System.in);
          System.out.println("NAMA KAMU:");
   
        warna1.nama =  input.nextLine();
        
         System.out.println("=======HASIL TEST KE PERIBADIAN RIZKI=======");
       
         warna1.cekpribadian(warna1.getFav());
         
         
         
         
         
         
         
         
        
             
         }
    
    }
    

