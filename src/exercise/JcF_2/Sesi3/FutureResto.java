/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.JcF_2.Sesi3;

import java.util.Scanner;

/**
 *
 * @author WH
 */
public class FutureResto {

    public static void main(String[] args) {
        System.out.println("========================= Start =========================");
        FutureResto latihan1 = new FutureResto();
        latihan1.inputNamaMasakan();
    }

    private void inputNamaMasakan() {
        Scanner bacaan = new Scanner(System.in);
        System.out.println("Nama Masakan : ");
        String masukan = bacaan.nextLine();

        Latihan1.buatFolder(masukan);
        boolean tetapBaca = true;
        System.out.println("Input Resep Masakan : ");
        while (tetapBaca) {
            String ResepLine = bacaan.nextLine();
            if (ResepLine.contains("q")) {
                break;
            } else {
                Latihan1.tulisData(masukan, ResepLine);
            }
        }
        System.out.println("\nWriting Data Usai");
        System.out.println("========================= End ==========================");

    }

}
