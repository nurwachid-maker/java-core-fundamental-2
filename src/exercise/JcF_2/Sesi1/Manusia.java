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
public class Manusia {

    private String kelamin, nama, alamat;
    private int tglLahir, blnLahir, thnLahir, Ttl;
    private boolean keadaanMenganggur, sudahMenikah;

    public String getKelamin() {
        return kelamin;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(int tglLahir) {
        this.tglLahir = tglLahir;
    }

    public int getBlnLahir() {
        return blnLahir;
    }

    public void setBlnLahir(int blnLahir) {
        this.blnLahir = blnLahir;
    }

    public int getThnLahir() {
        return thnLahir;
    }

    public void setThnLahir(int thnLahir) {
        this.thnLahir = thnLahir;
    }

    public boolean isKeadaanMenganggur() {
        return keadaanMenganggur;
    }

    public void setKeadaanMenganggur(boolean keadaanMenganggur) {
        this.keadaanMenganggur = keadaanMenganggur;
    }

    public boolean isSudahMenikah() {
        return sudahMenikah;
    }

    public void setSudahMenikah(boolean sudahMenikah) {
        this.sudahMenikah = sudahMenikah;
    }

    public int getTtl() {
        return Ttl;
    }

    public void setTtl(int tglNa, int blnNa, int thnNa) {
        this.tglLahir = tglNa;
        this.blnLahir = blnNa;
        this.thnLahir = thnNa;
    }
}
