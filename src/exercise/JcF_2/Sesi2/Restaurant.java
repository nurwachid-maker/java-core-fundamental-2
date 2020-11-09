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
public class Restaurant implements Setoran {

    private static String lokasi;
    int jumlahKaryawanRestauran;
    int gajiKaryawanRestauran;
    int totalGajiKaryawan;
    int jumlahHariBukaRestoran;
    

    @Override
    public void printoutSummary() {
        System.out.println("========================================");
        System.out.println("Ringkasan");
        System.out.println("Saat ini restauran berlokasi di : "+getLokasi());
        System.out.println("Buka "+jumlahHariBukaRestoran+" hari dalam sepekan : Senin, Selasa, Rabu, Kamis, Jumat");
        System.out.println("========================================");
        System.out.println("Jumlah karyawan : "+jumlahKaryawanRestauran);
        System.out.println("Gaji karyawan   : "+gajiKaryawanRestauran);
        System.out.println("Bonus           : "+ Setoran.BONUS);
        System.out.println("========================================");
        totalGajiKaryawan=(jumlahKaryawanRestauran*gajiKaryawanRestauran)+
                (jumlahKaryawanRestauran*Setoran.BONUS);
        System.out.println("Total gaji Karyawan : "+ totalGajiKaryawan);
        
      
    }

    @Override
    public void prepare(int jumlahKaryawan, int gajiKaryawan, int jumlahHariBuka) {
        jumlahKaryawanRestauran= jumlahKaryawan;
        gajiKaryawanRestauran= gajiKaryawan;
        jumlahHariBukaRestoran= jumlahHariBuka;
        System.out.println("");
        System.out.println("");
        System.out.println("Persiapan .... Restoran");
        System.out.println("Data Karyawan   : " + jumlahKaryawan);
        System.out.println("Gaji Karyawan   : " + gajiKaryawan);

    }

    public static String getLokasi() {
        return lokasi;
    }

    public static void setLokasi(String aLokasi) {
        lokasi = aLokasi;
    }

}
