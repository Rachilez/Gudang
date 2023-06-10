import java.util.Scanner;
import java.text.DecimalFormat;

public class ramalan {
    public static void main(String[] args) {
        Scanner Inputs = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("\nSelamat datang Di Program Ramalan Cupu");
        System.out.println("++++++++++++++++++++++++++++++++++++++\n");

        System.out.println("Data Anda");
        System.out.println("*********");
        System.out.print("Masukkan nama Anda: ");
        String nama = Inputs.nextLine();
        System.out.print("Masukkan umur Anda: ");
        int umur = Inputs.nextInt();

        System.out.println("\nData Pasangan Anda");
        System.out.println("******************");
        System.out.print("Masukkan nama pasangan Anda: ");
        Inputs.nextLine();
        String namaPasangan = Inputs.nextLine();
        System.out.print("Masukkan umur pasangan Anda: ");
        int umurPasangan = Inputs.nextInt();
        System.out.print("\n");

        System.out.println(nama + " [" + umur + "] " + "Tahun\n");
        String[] luv = {

              "\n ***     ***   ",
                "****** ******  ",
                "*************  ",
                "  *********    ",
                "   *******     ",
                "     ***       ",
                "      *      \n",

        };
        for (String line : luv)
            System.out.println(line);
        System.out.println(namaPasangan + " [" + umurPasangan + "] " + "Tahun\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Tekan ENTER untuk melihat hasil ramalan..");
        input.nextLine();

        double hasilKecocokan = Math.random() * 50 + 50;
        hasilKecocokan /= 1.1;

        System.out
                .println("Kecocokan anda dengan pasangan anda adalah: " + decimalFormat.format(hasilKecocokan) + "%\n");
        System.out.println("Terimakasih Karena anda telah menggunakan jasa Ramalan kami..^^\n");
        input.close();
        Inputs.close();
    }
}
