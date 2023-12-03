import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

// Program utama untuk mendemonstrasikan penggunaan kelas-kelas di atas.
// Menggunakan Scanner untuk menerima input dari pengguna, menangani pengecualian,
// dan membuat objek Pemesanan untuk menampilkan informasi pemesanan.
public class VirtualDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean inputValid = false;

        while (!inputValid) {
            try {
                // Menampilkan informasi waktu saat ini menggunakan fungsi getCurrentDate dan getCurrentTime
                System.out.println("          Data            ");
                System.out.println("Tanggal: " + getCurrentDate());
                System.out.println("Waktu  : " + getCurrentTime());

                // Input data pelanggan
                System.out.println("DATA PELANGGAN");
                System.out.println("-------------------------------------");
                System.out.print("Input Nama Pelanggan   : ");
                String namaPelanggan = scanner.nextLine();

                System.out.print("Input No. HP Pelanggan : ");
                String noHpPelanggan = scanner.nextLine();

                System.out.print("Input Alamat Pelanggan : ");
                String alamatPelanggan = scanner.nextLine();

                // Input data pembelian barang
                System.out.println("Input DATA PEMBELIAN BARANG");
                System.out.println("-------------------------------------");
                System.out.print("No. Faktur              : ");
                String noFaktur = scanner.nextLine();

                System.out.print("Input Kode Barang       : ");
                String kodeBarang = scanner.nextLine();

                System.out.print("Input Nama Barang       : ");
                String namaBarang = scanner.nextLine();

                System.out.print("Input Harga Barang      : ");
                double hargaBarang = Double.parseDouble(scanner.nextLine());

                System.out.print("Input Jumlah Beli       : ");
                int jumlahBeli = Integer.parseInt(scanner.nextLine());

                System.out.print("Input Nama Kasir        : ");
                String kasir = scanner.nextLine();

                // Membuat objek Pemesanan dengan data yang telah diinput
                Pemesanan pesanan = new Pemesanan(noFaktur, new Pelanggan(namaPelanggan, noHpPelanggan, alamatPelanggan), new Barang(kodeBarang, namaBarang, hargaBarang), jumlahBeli, kasir);
                
                // Menampilkan informasi pemesanan
                pesanan.tampilkanInformasi();

                System.out.println("=====================================");

                inputValid = true;

            } catch (InputMismatchException e) {
                System.out.println("Error: Pastikan input sesuai dengan format yang benar.");
                System.out.println("Silahkan ulangi pengisian sesuai dengan ketentuan.");
                scanner.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Error: Harga Barang dan Jumlah Beli harus berupa angka.");
                System.out.println("Silahkan ulangi pengisian sesuai dengan ketentuan.");
                scanner.nextLine();
            } catch (JumlahBeliException e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    // Fungsi bantuan untuk mendapatkan tanggal saat ini.
    private static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, dd/MM/yyyy");
        return dateFormat.format(Calendar.getInstance().getTime());
    }

    // Fungsi bantuan untuk mendapatkan waktu saat ini.
    private static String getCurrentTime() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a zzz");
        return timeFormat.format(Calendar.getInstance().getTime());
    }
}
