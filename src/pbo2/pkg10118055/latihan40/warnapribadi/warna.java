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
public class warna {
    
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m";


public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";




    public  String warna,nama,fav ;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    

     public String getFav() {
        return fav;
    }

    public void setFav(String fav) {
        this.fav = fav;
    }
        
    
    
    public static void tampil(){
    System.out.println(ANSI_RED+"YUK"+ANSI_GREEN+"CEK"+ANSI_YELLOW+"KEPRTIBADIANMU" +ANSI_BLUE+"DARI" +ANSI_PURPLE+"WARNA" +ANSI_CYAN+"FAVORITEMU");
        Scanner userInput = new Scanner(System.in);
       
        
        System.out.println(ANSI_RED_BACKGROUND+"   MERAH  "+ANSI_RESET);
        System.out.println(ANSI_GREEN_BACKGROUND+"   HIJAU  "+ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND+"  KUNING  "+ANSI_RESET);
        System.out.println(ANSI_BLUE_BACKGROUND+"   BIRU   "+ANSI_RESET);
        System.out.println(ANSI_PURPLE_BACKGROUND+"   UNGU   "+ANSI_RESET);
        
    }
    
    
   
    public static void cekpribadian(String warna){
      if("biru".equals(warna)){
             System.out.println("warna favorite mu adalah "+ANSI_BLUE+"BIRU");
             System.out.println("1.menyenangkan");
             System.out.println("2.bijaksana");
             System.out.println("3.pembawaan diri tenang");
             System.out.println("4.dinamis");
             System.out.println("5.senang berbahagia");   
         }
         else if("kuning".equals(warna)){   
           System.out.println("warna favorite mu adalah "+ANSI_YELLOW+"KUNING");
            System.out.println("1.OPTIMIS");
             System.out.println("2.SUKA BERGAUL");
             System.out.println("3.PERIANG");
             System.out.println("4.SENANG MENOLONG");
             System.out.println("5.LINCAH DAN AKTIF");  
             
         }
         
        else if("merah".equals(warna)){   
           System.out.println("warna favorite mu adalah "+ANSI_RED+"MERAH");
            System.out.println("1.PERIANG");
             System.out.println("2.BERANI");
             System.out.println("3.MENYUKAI TANTANGAN");
             System.out.println("4.KURANG SABAR");
             System.out.println("5.BERANI MENGAMBIL RESIKSO");  
             
         }
         
        else if("hijau".equals(warna)){   
           System.out.println("warna favorite mu adalah"+ANSI_GREEN+"HIJAU");
            System.out.println("1.ROMANTIS");
             System.out.println("2.MENYUKAI YANG BERBAU ALAM");
             System.out.println("3.TEGUH PADA PRINSIP");
             System.out.println("4.MENGINGINKAN KESEMPURNAAN");
             System.out.println("5.MUDAH CEMBURU");  
             
         }
         else if("ungu".equals(warna)){   
           System.out.println("warna favorite mu adalah s"+ANSI_PURPLE+"UNGU");
            System.out.println("1.OPTIMIS");
             System.out.println("2.TIDAK PERNAH RAGU");
             System.out.println("3.MEMILIKI AMBISI YANG BESAR");
             System.out.println("4.MEMILIKI EMPATI YANG BESAR");
             System.out.println("TERKADANG BERSIKAP KERAS KEPALA DAN ANGKUH");  
         }
             else{
                   System.out.println("oops belum teridentifikasi");  
                     }
             
    
    
    
    }
}
