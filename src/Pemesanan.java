import java.text.SimpleDateFormat;
import java.util.Date;

// Representasi objek Pemesanan yang mewarisi dari Barang dan mengimplementasikan HitungTotal.
// Menyediakan metode untuk menghitung total bayar, menampilkan informasi pemesanan, dan representasi string.
public class Pemesanan extends Barang implements HitungTotal {
    private String noFaktur;
    private Pelanggan pelanggan;
    private int jumlahBeli;
    private double totalBayar;
    private String kasir;
    private String tanggal;

    // Konstruktor untuk inisialisasi objek Pemesanan.
    // Melempar JumlahBeliException jika jumlahBeli kurang dari atau sama dengan 0.
    public Pemesanan(String noFaktur, Pelanggan pelanggan, Barang barang, int jumlahBeli, String kasir) throws JumlahBeliException {
        super(barang.getKodeBarang(), barang.getNamaBarang(), barang.getHargaBarang());
        this.noFaktur = noFaktur;
        this.pelanggan = pelanggan;

        if (jumlahBeli <= 0) {
            throw new JumlahBeliException("Jumlah beli harus lebih dari 0.");
        }

        this.jumlahBeli = jumlahBeli;
        this.kasir = kasir;
        this.tanggal = new SimpleDateFormat("EEEE, dd/MM/yyyy HH:mm:ss zzz").format(new Date());

        hitungTotalBayar();
    }

    // Metode untuk menghitung total bayar.
    @Override
    public double hitungTotalBayar() {
        totalBayar = hargaBarang * jumlahBeli;
        return totalBayar;
    }

    // Metode getter untuk mendapatkan totalBayar.
    public double getTotalBayar() {
        return totalBayar;
    }

    // Metode toString untuk representasi string objek Pemesanan.
    @Override
    public String toString() {
        return String.format("No. Faktur        : %-20s", noFaktur);
    }

    // Metode untuk menampilkan informasi pemesanan ke konsol.
    public void tampilkanInformasi() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd/MM/yyyy");

        System.out.println("=====================================");
        System.out.println("          STRUK PEMBELIAN               ");
        System.out.println("             Diva Mart                 ");
        System.out.println(" Tanggal : " + dateFormat.format(new Date())); // Format to display only day, dd/MM/yyyy
        System.out.println(" Waktu   : " + new SimpleDateFormat("HH:mm:ss a zzz").format(new Date()));
        System.out.println("=====================================");

        System.out.println("-------------------------------------");
        System.out.println("DATA PELANGGAN");
        System.out.println("-------------------------------------");
        System.out.println("Nama Pelanggan   : " + pelanggan.getNamaPelanggan());
        System.out.println("No. HP Pelanggan : " + pelanggan.getNoHp());
        System.out.println("Alamat Pelanggan : " + pelanggan.getAlamat());
        System.out.println("+++++++++++++++++++++++++++++++++++++");

        System.out.println("-------------------------------------");
        System.out.println("DATA PEMBELIAN BARANG");
        System.out.println("-------------------------------------");
        System.out.println(this);
        System.out.println("Kode Barang       : " + getKodeBarang());
        System.out.println("Nama Barang       : " + namaBarang);
        System.out.println("Harga Barang      : " + hargaBarang);
        System.out.println("Jumlah Beli       : " + jumlahBeli);
        System.out.println("TOTAL BAYAR       : " + totalBayar);
        System.out.println("+++++++++++++++++++++++++++++++++++++");

        System.out.println("Kasir             : " + kasir);
        System.out.println("=====================================");
    }
}
