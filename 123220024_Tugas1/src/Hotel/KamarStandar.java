/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author M S I
 */
public class KamarStandar extends KamarHotel {
    private double tarifMalam;

    public KamarStandar(String nomorKamar, double tarifMalam) {
        super(nomorKamar);
        this.tarifMalam = tarifMalam;
    }

    @Override
    public double hitungBiaya(int malam) {
        return tarifMalam * malam;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Kamar Standar " + getNomorKamar() + " - Tarif per Malam: Rp" + tarifMalam);
    }

    @Override
    public void bersihkanKamar() {
        System.out.println("Kamar Standar " + getNomorKamar() + " sudah dibersihkan.");
    }
}


