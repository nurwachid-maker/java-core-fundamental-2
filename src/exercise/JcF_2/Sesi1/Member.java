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
public class Member extends User {

    public void setMembership(String jenisNa) {        
        if (jenisNa.isEmpty()) {
            super.setPayment(0);
        } else {
            super.setPayment(50000);
        }        
    }
    
    public void setKolsultasiLangsung(boolean konsulNa) {
        
    }
    
}
