/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.JcF_1.Sesi7;

/**
 *
 * @author WH
 */
public class KasusBlender {

    int level = 0;
    String kondisiMesin = "Baru";
    String merk = "Yamaha";
    int harga = 500000;

    public static void main(String[] args) {
        KasusBlender mesin = new KasusBlender();
        mesin.siap();
        mesin.startLevel(2);
        mesin.naikkanLevel();
        mesin.naikkanLevel();
        mesin.rendahkanLevel();
        mesin.stop();
    }

    public void startLevel(int angkaIn) {
        level= angkaIn;
        System.out.println("Mesin mulai hidup di level " + level);
    }

    public void stop() {
        level = 0;
        System.out.println("Mesin kini berhenti level " + level);
    }

    public void rendahkanLevel() {
        level--;
        System.out.println("Mesin turun ke level " + level);
    }

    public void naikkanLevel() {
        level++;
        System.out.println("Mesin naik ke level " + level);
    }

    public void siap() {
        System.out.println("========================");
        System.out.println("Kondisi : " + kondisiMesin);
        System.out.println("Merk    : " + merk);
        System.out.println("Harga   : " + harga);
        System.out.println("========================");
    }
}
