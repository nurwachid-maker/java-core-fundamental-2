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
public class Latihan1 {

    public static void main(String[] args) {

        System.out.println("========================");
        System.out.println("Persiapan 2 orang siap");

        Manusia orang1 = new Manusia();
        orang1.setKelamin("Pria");
        orang1.setNama("Udin");
        orang1.setAlamat("Jakarta");
        orang1.setTglLahir(1);
        orang1.setBlnLahir(11);
        orang1.setThnLahir(1988);
        orang1.setKeadaanMenganggur(false);
        orang1.setSudahMenikah(true);

        Manusia orang2 = new Manusia();
        orang2.setKelamin("Wanita");
        orang2.setNama("Mirna");
        orang2.setAlamat("Tangerang");
        orang2.setTtl(20, 10, 1987);
        orang2.setKeadaanMenganggur(false);
        orang2.setSudahMenikah(false);

        Masakan menu1 = new Masakan();
        menu1.setData("Ikan bakar", 15000, "pedas");
        menu1.setBisaTahan1Hari(true);

        Masakan menu2 = new Masakan();
        menu2.setData("bala bala", 6000, "asin");
        menu2.setBisaTahan1Hari(true);

        System.out.println("Dan 2 menu makanan siap");
        System.out.println("========================");

        Latihan1 eksekusi = new Latihan1();
        eksekusi.bertemu(orang1, orang2);

        System.out.println("========================");
        eksekusi.memasak(menu1, orang1);
        System.out.println("========================");
        eksekusi.memasak(menu2, orang2);
        System.out.println("===== System done =====");

    }

    private void bertemu(Manusia orang1, Manusia orang2) {
        System.out.println("Setelah bertemu ...");
        System.out.println("Antara " + orang1.getNama() + " dan " + orang2.getNama());
        System.out.println("Apakah akan membuka bisnis catering bersama ...");
        System.out.println("Sedang dicek ...");
        if (orang1.getKelamin().equals(orang2.getKelamin())) {
            System.out.println("Terlalu sibuk bisnis masing masing");
        } else {
            if (orang1.getThnLahir() >= orang2.getThnLahir()) {
                System.out.println("Mungkin bisa dikomunikasikan ...");
            } else {
                System.out.println("Tidak mungkin bisnis berjalan");
            }
        }
    }

    private void memasak(Masakan menu, Manusia chef) {
        String peringatan = "";
        System.out.println(chef.getNama() + " mulai akan memasak ...");
        System.out.println("checking dulu ...");
        if (menu.budget < 10000) {
            System.out.println("Tarif dibawah 10.000 aman !");
            peringatan = "dengan ... aman";
        } else {
            System.out.println("Tarif melebihi budget 10.000 bahaya !");
            peringatan = "dengan ... bahaya";
        }
        System.out.println(chef.getNama() + " akan memulai memasak " + menu.nama);
        System.out.println(peringatan);
    }
}
