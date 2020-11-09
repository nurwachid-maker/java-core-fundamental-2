/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materi.Jcf_2.Sesi2;

/**
 *
 * @author WH
 */
public class Gajian extends Karyawan{

    private double gaji;
    @Override
    public double hitungGaji() {
       double cash;
       
       cash= gaji/52;
       return cash;
    }
    
}
