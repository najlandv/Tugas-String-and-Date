// Representasi objek Barang dengan atribut kodeBarang, namaBarang, dan hargaBarang.
// Menyediakan metode untuk mengakses informasi dan representasi string.
public class Barang {
    protected String kodeBarang;
    protected String namaBarang;
    protected double hargaBarang;

    // Konstruktor untuk inisialisasi objek Barang.
    public Barang(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    // Metode getter untuk mendapatkan kodeBarang.
    public String getKodeBarang() {
        return kodeBarang;
    }

    // Metode getter untuk mendapatkan namaBarang.
    public String getNamaBarang() {
        return namaBarang;
    }

    // Metode getter untuk mendapatkan hargaBarang.
    public double getHargaBarang() {
        return hargaBarang;
    }

    // Metode toString untuk representasi string objek Barang.
    @Override
    public String toString() {
        return String.format("| %-6s | %-20s | %-15s |", kodeBarang, namaBarang, hargaBarang);
    }
}
