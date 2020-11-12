/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materi.Jcf_2.Sesi2;

import java.util.Scanner;

/**
 *
 * @author WH
 */
public class LatihanInput {
    public static void main(String[] args) {
        // System.out.println("Nama mu : ");  --> get kursor dbawah
        // System.out.print("Nama mu : ");  --> get kursor disamping
        
        Scanner in = new Scanner(System.in);
        System.out.print("Nama mu? : ");
        String nama= in.nextLine();
        
        System.out.print("Kode ? :");
        int nilaiAnda= in.nextInt();
        
        System.out.println("=======================");
        System.out.println("Selamat datang "+nama);
        System.out.println("Kode anda : "+ nilaiAnda);
        in.close();
    }
}
