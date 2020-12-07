/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materi.Jcf_2.Sesi6;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author WH
 */
public class PraktekThread extends Thread {

    JProgressBar jprog;
    JLabel jtext;
    int n;
    int tahap;
    int time;

    public PraktekThread(int no, JLabel jl, JProgressBar jbar) {
        jtext = jl;
        jprog = jbar;
        n = no;
    }

    public void setJeda(int nilai) {
        time = nilai * 1000;
    }
}
