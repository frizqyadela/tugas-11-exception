public class TransaksiPenjualan extends Barang implements Transaksi {
    private String noFaktur;
    private String namaPelanggan;
    private double totalBayar;

    // Constructor
    public TransaksiPenjualan(String noFaktur, String namaPelanggan, String namaBarang, double hargaBarang, int jumlahBarang) {
        super(namaBarang, hargaBarang, jumlahBarang);
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
    }

    // Override interface methods
    @Override
    public void hitungTotalBayar() {
        totalBayar = getTotalHarga();
    }

    @Override
    public void tampilDetail() {
        System.out.println("No. Faktur: " + noFaktur);
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Nama Barang: " + getNamaBarang());
        System.out.println("Harga Barang: " + getHargaBarang());
        System.out.println("Jumlah Barang: " + getJumlahBarang());
        System.out.println("Total Bayar: " + totalBayar);
    }
}
