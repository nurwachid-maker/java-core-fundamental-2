/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.JcF_2.Sesi2;

/**
 *
 * @author WH
 */
public class StandPameran extends KonsepToko {

    int totalGajiKaryawan;
    private static String lokasi;

    @Override
    public void prepare(int jumlahKaryawan, int gajiKaryawan, int jumlahHariBuka) {
        System.out.println("");
        System.out.println("");
        System.out.println("Persiapan .... Stand Pameran");
        System.out.println("Data Karyawan   : " + jumlahKaryawan);
        System.out.println("Gaji Karyawan   : " + gajiKaryawan);      
        super.siapkenKaryawan = jumlahKaryawan;
        super.setGajiKaryawan = gajiKaryawan;
        super.siapkanHariBuka = jumlahHariBuka;
        
    }

    @Override
    public void printoutSummary() {
        System.out.println("========================================");
        System.out.println("Ringkasan");
        System.out.println("Saat ini restauran berlokasi di : " + getLokasi());
        System.out.println("Buka "+super.siapkanHariBuka+" hari dalam sepekan :  Sabtu dan Ahad");
        System.out.println("========================================");
        System.out.println("Jumlah karyawan : " + super.siapkenKaryawan);
        System.out.println("Gaji karyawan   : " + super.setGajiKaryawan);
        System.out.println("========================================");
        totalGajiKaryawan = (super.siapkenKaryawan * super.setGajiKaryawan);
        System.out.println("Total gaji Karyawan : " + totalGajiKaryawan);
    }

    public static String getLokasi() {
        return lokasi;
    }

    public static void setLokasi(String aLokasi) {
        lokasi = aLokasi;
    }

}
