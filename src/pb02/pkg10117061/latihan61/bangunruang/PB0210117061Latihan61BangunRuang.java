/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb02.pkg10117061.latihan61.bangunruang;

import java.util.jar.Pack200;

/**
 *Nama      : Fachrian Harits P
 *Kelas     : IF-2
 *NIM       : 10117061
 *Deskripsi : Program untuk menghitung bangun datar
 * 
 */
public class PB0210117061Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Bola bola = new Bola();
        bola.setJariJari(7);
        System.out.println("Hasil  V Bola : " + bola.hitungVolume());
        Tabung tabung = new Tabung();
        tabung.setJariJari(10);
        tabung.setTinggi(21);
        System.out.println("\nHasil V Tabung : " + tabung.hitungVolume());
        Kerucut kerucut = new Kerucut();
        kerucut.setJariJari(14);
        kerucut.setTinggi(9);
        System.out.println("\nHasil  V Kerucut : " +kerucut.hitungVolume() );
    
    }

}
