/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.JcF_2.Sesi3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author WH
 */
public class FutureRestoInteraktif {

    String folderSound = "D:/java/exercise/src/exercise/jcf_2/Sesi3/wav/";

    public static void main(String[] args) {
        FutureRestoInteraktif latihan2 = new FutureRestoInteraktif();

        System.out.println("=======================================");
        System.out.println("Selamat Datang ke Sistem Informasi Future Resto");
        latihan2.play("selamat datang");
        latihan2.play("login");

        boolean akses = latihan2.terimaInput();
        if (akses) {
            System.out.println("Login berhasil");
            latihan2.play("sukses");
            System.out.println("Menu Utama");
            latihan2.play("menuutama");
        } else {
            System.out.println("Maaf user name & password anda salah!");
            latihan2.play("salah");
            System.out.println("System exit");
            latihan2.play("exit");
        }
        System.out.println("=======================================");

    }

    private void play(String wordIn) {
        String fileSound = "";
        if (wordIn.equals("selamat datang")) {
            fileSound = "selamat-datang.wav";
        } else if (wordIn.equals("login")) {
            fileSound = "silahkan-login.wav";
        } else if (wordIn.equals("sukses")) {
            fileSound = "login-berhasil.wav";
        } else if (wordIn.equals("menuutama")) {
            fileSound = "menu-utama.wav";
        } else if (wordIn.equals("salah")) {
            fileSound = "maaf-username-password-anda-salah.wav";
        } else if (wordIn.equals("exit")) {
            fileSound = "system-exit.wav";
        }

        File audioFile = new File(folderSound + fileSound);
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);

            try {
                Clip audioClip = (Clip) AudioSystem.getLine(info);
                audioClip.open(audioStream);
                audioClip.start();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(FutureRestoInteraktif.class.getName()).log(Level.SEVERE, null, ex);
                }
                audioClip.close();

            } catch (LineUnavailableException ex) {
                Logger.getLogger(FutureRestoInteraktif.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(FutureRestoInteraktif.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FutureRestoInteraktif.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean terimaInput() {
        Scanner bacaan = new Scanner(System.in);
        System.out.println(" - username : ");
        String userId = bacaan.nextLine();
        System.out.println(" - password : ");
        String passw = bacaan.nextLine();

        if (userId.equals("admin")) {
            if (passw.equals("admin")) {
                return (true);
            } else {
                return (false);
            }
        }
        return (false);
    }

}
