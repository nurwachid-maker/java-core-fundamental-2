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
interface Setoran {
    
    public void printoutSummary();

    public void prepare(int jumlahKaryawan, int gajiKaryawan, int jumlahHariBuka);
 
    final static int BONUS = 100;
    
    // tidak diperkenankan
    // public int siapkanKaryawan;
    // public int setGajiKaryawan;
    // public int siapkanHariBuka;
       
}
