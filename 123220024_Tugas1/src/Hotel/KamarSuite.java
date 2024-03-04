/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author M S I
 */
public class KamarSuite extends KamarHotel {
    private double tarifMalam;
    private boolean punyaHotTub;

    public KamarSuite(String nomorKamar, double tarifMalam, boolean punyaHotTub) {
        super(nomorKamar);
        this.tarifMalam = tarifMalam;
        this.punyaHotTub = punyaHotTub;
    }

    @Override
    public double hitungBiaya(int malam) {
        return tarifMalam * malam + (punyaHotTub ? 20 : 0);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Kamar Suite " + getNomorKamar() + " - Tarif per Malam: Rp" + tarifMalam + (punyaHotTub ? " (dengan Hot Tub)" : ""));
    }

    @Override
    public void bersihkanKamar() {
        System.out.println("Kamar Suite " + getNomorKamar() + " sudah dibersihkan.");
    }
}

