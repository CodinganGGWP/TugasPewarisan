package ContohSoalUKL;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi {

    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idMember = new ArrayList<Integer>();

    Transaksi() {
        this.idMember.add(0);
        this.idBarang.add(0);
        this.banyak.add(2);

        this.idMember.add(0);
        this.idBarang.add(1);
        this.banyak.add(3);

        this.idMember.add(1);
        this.idBarang.add(0);
        this.banyak.add(1);

        this.idMember.add(1);
        this.idBarang.add(2);
        this.banyak.add(2);
    }

    public void prosesTransaksi(Member member, Transaksi transaksi, Barang barang) {
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan Belanja");
        System.out.print("Masukkan Id member: ");
        int idMember = input.nextInt();
        System.out.println("Selamat datang " + member.getNama(idMember));
        ArrayList<Integer> idbarang = new ArrayList<Integer>();
        ArrayList<Integer> sum = new ArrayList<Integer>();
        int i = 0;
        int temp = 0;
        do {
            System.out.print("Masukkan kode Barang: ");
            temp = input.nextInt();
            if (temp!=99){
                idbarang.add(temp);
                System.out.println(barang.getNamaBarang(idbarang.get(i))+ " sebanyak: ");
                banyak.add(input.nextInt());
                i++;
            }
        }while(temp !=99);
        System.out.println("Transaksi belanja "+member.getNama(idMember)+ " sebagai berikut: ");
        System.out.println("Nama barang \tQty \tHarga \tJumlah \t");
        int total =0;
        int x = idbarang.size();
        for (int j = 0; j < x; j++) {
            int jumlah = sum.get(j) * barang.getHarga(idbarang.get(j));
            total += jumlah;
            System.out.println(barang.getNamaBarang(idbarang.get(j))+ "\t" + idbarang.get(j)+"\t"+barang.getHarga(idbarang.get(j))+"\t"+jumlah);
            transaksi.setTransaksi(barang, idMember, idbarang.get(j),sum.get(j));
        }
        System.out.println("total belanja: "+total);
        member.editSaldo(idMember, member.getSaldo(idMember)-total);
    }

    private void setTransaksi(Barang barang, int idbarang, int idMember, Integer sum) {
        this.idMember.add(idMember);
        this.idBarang.add(idbarang);
        this.banyak.add(sum);
        barang.editStok(idbarang, barang.getStok(idbarang) - sum);
    }

	public int getJmlTransaksi() {
		return 0;
	}

    public int getBanyaknya(int i) {
        return 0;
    }

    public int getIdBarang(int i) {
        return 0;
    }
}