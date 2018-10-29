/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb02.pkg10117061.latihan61.bangunruang;
/**
 *Nama      : Fachrian Harits P
 *Kelas     : IF-2
 *NIM       : 10117061
 *Deskripsi : Program untuk menghitung bangun datar
 * 
 */
public class Kerucut extends BangunRuang{
    private double volume;
    private double t;
    private double r;

    public double getTinggi() {
        return t;
    }

    public void setTinggi(double t) {
        this.t = t;
    }

    public double getJariJari() {
        return r;
    }

    public void setJariJari(double r) {
        this.r = r;
    }


    
    @Override
    public double hitungVolume() {
       this.volume = 0.3333*Math.PI*r*r*r;
        return this.volume;
    }
    
    
    
    
}
