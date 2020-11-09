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
public abstract class KonsepToko {

    private Staff daftarKaryawan[];
    private String hariBuka[];
    private int saldoKeseluruhan;
    private int gajiKaryawan;
    private int totalPengeluaran;
    private int hariKe = 0;

    public int siapkenKaryawan;
    public int setGajiKaryawan;
    public int siapkanHariBuka; 
    
    public abstract void prepare(int jumlahKaryawan, int gajiKaryawan, int jumlahHariBuka);

    public abstract void printoutSummary();
    
    

  

}
