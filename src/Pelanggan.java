// Representasi objek Pelanggan dengan atribut namaPelanggan, noHp, dan alamat.
// Menyediakan metode untuk mengakses informasi dan representasi string.
public class Pelanggan {
    private String namaPelanggan;
    private String noHp;
    private String alamat;

    // Konstruktor untuk inisialisasi objek Pelanggan.
    public Pelanggan(String namaPelanggan, String noHp, String alamat) {
        this.namaPelanggan = namaPelanggan;
        this.noHp = noHp;
        this.alamat = alamat;
    }

    // Metode getter untuk mendapatkan namaPelanggan.
    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    // Metode getter untuk mendapatkan noHp.
    public String getNoHp() {
        return noHp;
    }

    // Metode getter untuk mendapatkan alamat.
    public String getAlamat() {
        return alamat;
    }

    // Metode toString untuk representasi string objek Pelanggan.
    @Override
    public String toString() {
        return String.format("| %-20s | %-15s | %-15s |", namaPelanggan, noHp, alamat);
    }
}
