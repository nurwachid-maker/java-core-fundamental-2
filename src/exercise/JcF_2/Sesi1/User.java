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
public class User {

    public void setData(String userNa, String passNa, String emailNa) {
        System.out.println("---------------------------");
        System.out.println("Mencoba logging untuk " + userNa);
        System.out.println("loading ...");
    }

    public void setPayment(int nilaiNa) {
        if (nilaiNa > 0) {
            System.out.println("Payment berhasil ... boleh logging in!");
        } else {
            System.out.println("Payment tidak ditemukan ... logging in batal!");
        }
    }
}
