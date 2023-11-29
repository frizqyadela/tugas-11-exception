import java.util.InputMismatchException;
import java.util.Scanner;

public class MinimarketDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //exception
        try {
            System.out.print("No. Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.print("Nama Pelanggan: ");
            String namaPelanggan = scanner.nextLine();

            System.out.print("Nama Barang: ");
            String namaBarang = scanner.nextLine();

            double hargaBarang;
            while (true) {
                try {
                    System.out.print("Harga Barang: ");
                    hargaBarang = scanner.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Input harga tidak valid. Mohon masukkan angka.");
                    scanner.next(); 
                }
            }

            int jumlahBarang;
            while (true) {
                try {
                    System.out.print("Jumlah Barang: ");
                    jumlahBarang = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Input jumlah tidak valid. Mohon masukkan angka.");
                    scanner.next(); 
                }
            }

            // Buat objek transaksi
            TransaksiPenjualan transaksi = new TransaksiPenjualan(noFaktur, namaPelanggan, namaBarang, hargaBarang, jumlahBarang);

            // Hitung total bayar
            transaksi.hitungTotalBayar();

            // Tampilkan detail transaksi
            transaksi.tampilDetail();
        } finally {
            scanner.close();
        }
    }
}
