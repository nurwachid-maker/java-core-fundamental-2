/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.JcF_2.Sesi1;

/**
 *
 * @author WH
 */
public class latihan2 {
    public static void main(String[] args) {
        System.out.println("============= system dapur ==============");
        System.out.println("Mencoba untuk logging ...");
        
        User orang1= new User();
        orang1.setData("admin", "", "akhi@gmail.com");
        orang1.setPayment(65000);
        
        latihan2 mesin= new latihan2();
        mesin.logging(orang1);
        
        User orang2= new User();
        orang2.setData("general", "", "ikhwan@gmail.com");
        mesin.logging(orang2);
        
        Member orangLama= new Member();
        orangLama.setData("berry", "b2912", "berry@hotmail.com");
        orangLama.setMembership("3bulan");
        orangLama.setKolsultasiLangsung(true);
        
        mesin.logging(orangLama);
    }
    
    private void logging(User orangNa) {
        
    }
            
}
