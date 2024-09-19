/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pertemuan.pkg2.pbo.pkg1;

/**
 *
 * @author akriz
 */
public class konversisuhu {
    private int suhuCelcius;

    public void setSuhuCelcius(int suhu) {
        this.suhuCelcius = suhu;
    }
    public int getSuhuCelcius() {
        return this.suhuCelcius;
    }
  
    public int celciusToFahrenheit() {
        return (suhuCelcius * 9/5) + 32;
    }
    public int celciusToReamur() {
        return suhuCelcius * 4/5;
    }

}
