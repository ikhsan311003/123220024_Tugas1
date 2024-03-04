/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author M S I
 */
public abstract class KamarHotel implements Kamar {
    private String nomorKamar;
    private boolean sudahDipesan;

    public KamarHotel(String nomorKamar) {
        this.nomorKamar = nomorKamar;
        this.sudahDipesan = false;
    }

    @Override
    public void pesanKamar() {
        if (!sudahDipesan) {
            System.out.println("Kamar " + nomorKamar + " berhasil dipesan.");
            sudahDipesan = true;
        } else {
            System.out.println("Kamar " + nomorKamar + " sudah dipesan.");
        }
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public boolean sudahDipesan() {
        return sudahDipesan;
    }

    public abstract void bersihkanKamar();
}


