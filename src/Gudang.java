import java.text.DecimalFormat;
import java.util.Scanner;

public class Gudang {
    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner key = new Scanner(System.in);

        System.out.print("\nMasukkan nama anda: ");
        String nama = key.nextLine();
        System.out.println("\nStok Gudang Input Barang");
        System.out.println("########################");
        System.out.println("\nSelamat Datang " + nama);

        System.out.print("\nMasukkan nama barang yang mau ditambah\t: ");
        String namabarang = key.nextLine();

        System.out.print("Masukkan jumlah barang yang mau ditambah: ");
        int jumlahbarang = key.nextInt();

        System.out.print("Masukkan harga beli barang tersebut\t: Rp.");
        double hargabeli = key.nextDouble();

        System.out.print("Masukkan harga jual barang tersebut\t: Rp.");
        double hargajual = key.nextDouble();

        System.out.println("\nStok Gudang Rincian Barang");
        System.out.println("##########################\n");
        System.out.println("Nama Barang\t: " + namabarang);
        System.out.println("Jumlah Barang\t: " + jumlahbarang);
        System.out.println("Nama Beli\t: Rp." + decimalFormat.format(hargabeli));
        System.out.println("Nama Jual\t: Rp." + decimalFormat.format(hargajual));
        key.close();

    }

}
