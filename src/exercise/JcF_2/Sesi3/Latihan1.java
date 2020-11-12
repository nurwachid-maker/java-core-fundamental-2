/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.JcF_2.Sesi3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author WH
 */
public class Latihan1 {

    private static final String folderData = "D:/java/exercise/src/exercise/jcf_2/Sesi3/";
    private static final String namaFile = "resep-masakan.log";

    public static void buatFolder(String namaFolderIn) {
        File fileBaru = new File(folderData + namaFolderIn);
        fileBaru.mkdir();

        try {
        } catch (Exception ex) {
            System.out.println("Tidak berhasil buat folder : " + folderData + namaFolderIn);
        }
    }

    public static void tulisData(String folderIn, String isiDataIn) {
        String folderBaru=folderData+folderIn+"/";
        //cekFileCreate(folderBaru);
        File fileAwal = new File(folderBaru+namaFile);
        try {
            FileWriter penulis = new FileWriter(fileAwal, true);
            BufferedWriter buff = new BufferedWriter(penulis);
            buff.write(isiDataIn);
            buff.newLine();
            buff.close();
        } catch (IOException ex) {
            Logger.getLogger(Latihan1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void cekFileCreate(String folderIn) {
        File target = new File(folderIn);

        System.out.println("folder in : "+folderIn+" x "+namaFile);
        try {
            String satuan[] = target.list();
            for (String isi : satuan) {
                if (isi.equals(namaFile)) {
                } else {
                    File fileBaru = new File(folderIn, namaFile);
                    fileBaru.createNewFile();
                }
            }
        } catch (Exception ex) {
            System.out.println("folder tidak ditemukan");
        }
    }

}
