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
public class KebunBinatang {
    public static void main(String[] args) {
        Mamalia hewan= new Mamalia();
        hewan.bergerak();
        hewan.makan();
        
        System.out.println(hewan.JENIS);
    }
}
