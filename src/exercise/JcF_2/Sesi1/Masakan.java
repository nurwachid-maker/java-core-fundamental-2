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
public class Masakan {

    String nama, rasa;
    int budget;
    boolean bisaTahan1Hari;

    public void setData(String namaNa, int budgetNa, String rasaNa) {
        nama = namaNa;
        budget = budgetNa;
        rasa = rasaNa;
    }

    public void setBisaTahan1Hari(boolean bisaTahan1HariNa) {
        bisaTahan1Hari = bisaTahan1HariNa;
    }
}
