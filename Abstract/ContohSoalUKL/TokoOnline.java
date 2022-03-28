package ContohSoalUKL;

public class TokoOnline {
    public static void main(String[] args) {
        Member member = new Member ();
        Laporan laporan = new Laporan ();
        Transaksi transaksi = new Transaksi ();
        Barang barang = new Barang ();
        laporan.laporan(barang);
        laporan.laporan(transaksi, barang);
        transaksi.prosesTransaksi(member, transaksi, barang);
        laporan.laporan(transaksi, barang);
        laporan.laporan(barang);
        laporan.laporan(member);
    }
}
