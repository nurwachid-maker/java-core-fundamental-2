/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materi.Jcf_2.Sesi3;

import java.io.File;

/**
 *
 * @author WH
 */
public class PraktekFile1 {

    public static void main(String[] args) {
        String fileSourceData = "d:/java/praktek/src/";
        File target = new File(fileSourceData);
        
        try {
            String satuan[] = target.list();
            //System.out.println(fileSourceData + "todolist");

            for (String isi : satuan) {
                System.out.println("ditemukan " + isi);
            }
        } catch(Exception ex) {
            System.out.println("folder tidak ditemukan");
        }
    }
}
