/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hotel;

/**
 *
 * @author M S I
 */
public class HotelMain {
    public static void main(String[] args) {
        try {
            Kamar kamarStandar = new KamarStandar("101", 1500000);
            Kamar kamarSuite = new KamarSuite("201", 3000000, true);

            pesanDanTampilkan(kamarStandar, 3);
            pesanDanTampilkan(kamarSuite, 4);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void pesanDanTampilkan(Kamar kamar, int malam) {
        kamar.pesanKamar();
        System.out.println("Biaya untuk " + malam + " malam: Rp" + kamar.hitungBiaya(malam));
        kamar.tampilkanInfo();
        ((KamarHotel) kamar).bersihkanKamar();
        System.out.println();
    }
}



