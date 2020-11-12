/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.JcF_2.Sesi3;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author WH
 */
public class FutureRestoInteraktif {
    
    String folderSound= "D:/java/exercise/src/exercise/jcf_2/Sesi3/wav";
    
    public static void main(String[] args) {
        FutureRestoInteraktif latihan2= new FutureRestoInteraktif();
        
        System.out.println("=======================================");
        latihan2.play("selamat datang");
        latihan2.play("login");
        
    }
    
    private void play(String wordIn) {
        File audioFile= new File(folderSound);
        try {
            AudioInputStream audioStream=AudioSystem.getAudioInputStream(audioFile);
            AudioFormat format= audioStream.getFormat();
            DataLine.Info info= new DataLine.Info(Clip.class,format);
            
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(FutureRestoInteraktif.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FutureRestoInteraktif.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
}
