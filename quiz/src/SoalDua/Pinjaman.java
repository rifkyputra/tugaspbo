package SoalDua;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

abstract class Produk {

    abstract double nilaiBungaPinjam();

    abstract double cicilanPerbulan();

    abstract double totalUangPinjam();

    private String nama;
    private String noKtp;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    int lamaPinjam;

    String namaUkuran;

    public String getNamaUkuran() {
        return namaUkuran;
    }

    public void setNamaUkuran(String namaUkuran) {
        this.namaUkuran = namaUkuran;
    }

    public int getLamaPinjam() {
        return lamaPinjam;
    }

    public void setLamaPinjam(int lamaPinjam) {
        this.lamaPinjam = lamaPinjam;
    }


    abstract double getNilaiPinjam();
}

class Karung extends Produk {
    final double bungaPinjam = 0.025;

    public double getNilaiPinjam() {
        double harga;

        switch (namaUkuran) {

            case "XL":
                harga = 100000000;
                break;
            case "L":
                harga = 75000000;
                break;
            default:
                harga = 50000000;
                break;
        }
        return harga;
    }


    double nilaiBungaPinjam() {
        return getNilaiPinjam() * bungaPinjam;
    }

    double cicilanPerbulan() {
        return totalUangPinjam() / lamaPinjam;
    }

    double totalUangPinjam() {


        return getNilaiPinjam() + nilaiBungaPinjam();
    }
}

class PaperBag extends Produk {
    final double bungaPinjam = 0.025;


    public double getNilaiPinjam() {
        double harga;

        switch (namaUkuran) {
            case "XL":
                harga = 30000000;
                break;
            case "L":
                harga = 20000000;
                break;
            default:
                harga = 10000000;
                break;
        }
        return harga;
    }

    double nilaiBungaPinjam() {
        return round(getNilaiPinjam() * bungaPinjam, 2);
    }

    double cicilanPerbulan() {
        return round(totalUangPinjam() / lamaPinjam, 2);
    }

    double totalUangPinjam() {
        return round(getNilaiPinjam() + nilaiBungaPinjam(), 2);
    }


}

class Pinjaman {
    static Produk produk;
    static private String nama;
    static private String noKtp;
    static private String ukuran;

    static private int pilihanUkuranInt;


    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("pilih produk :");
        pilihProduk(scanner.nextInt());


        System.out.println("Masukan Nama : ");
        produk.setNamaUkuran(scanner.nextLine());

        System.out.println("Masukan KTP :");
        produk.setNoKtp(scanner.nextLine());

        System.out.println("Masukan Ukuran :");
        produk.setNamaUkuran(scanner.nextLine());

        System.out.println("Masukan Lama Pinjaman :");
        produk.lamaPinjam = scanner.nextInt();

        System.out.println("cicilan per bulan : " + produk.namaUkuran);
        System.out.println("cicilan per bulan : " + produk.lamaPinjam);


        System.out.println("Harga Barang : " + produk.getNilaiPinjam());
        System.out.println("cicilan per bulan : " + produk.cicilanPerbulan());
        System.out.println("bunga pinjam : " + produk.nilaiBungaPinjam());
        System.out.println("total uang pinjam : " + produk.totalUangPinjam());


    }

    static void pilihProduk(int pilihan) {

        if (pilihan == 1) {
            produk = new Karung();
        } else if (pilihan == 2) {
            produk = new PaperBag();
        }


    }
}


    double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    String convertToRupiah(double amount) {
        // Create a NumberFormat instance for Indonesian Locale
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        // Format the amount and return as a String
        return currencyFormatter.format(amount);
    }