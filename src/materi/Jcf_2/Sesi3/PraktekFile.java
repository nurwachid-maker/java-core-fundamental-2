/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materi.Jcf_2.Sesi3;

import java.io.File;
import materi.Jcf_2.Sesi2.KebunBinatang;

/**
 *
 * @author WH
 */
public class PraktekFile {
    public static void main(String[] args) {
        File target= new File("config.log");
        
           // new KebunBinatang ->construtor
        KebunBinatang eksekusi= new KebunBinatang("Bandung", 1000);
        KebunBinatang eksekusiLain= new KebunBinatang("Bogor");
    }
}
