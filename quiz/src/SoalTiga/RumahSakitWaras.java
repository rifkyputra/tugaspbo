package SoalTiga;

import java.util.Scanner;

class Pemesanan {
    String nama, telpon, alamat, keterangan;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelpon() {
        return telpon;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}

class Transaksi {
    int poli;
    int doktear;
    String ket;

    void viewpoli() {
        System.out.println("NAMA POLI");
        System.out.println("1. GIGI");
        System.out.println("2. ANAK");
        System.out.println("3. UMUM");
    }

    public String getPoli() {
        String hasil = null;

        if (this.poli == 1) {
            hasil = "GIGI";
        } else if (this.poli == 2) {
            hasil = "ANAK";
        } else if (this.poli == 3) {
            hasil = "UMUM";
        }

        return hasil;
    }

    public void setPoli(int poli) {
        this.poli = poli;
    }
    public void setDokter(int dokter) {
        this.doktear = dokter;
    }
    public void setKeterangan(String ket){
        this.ket = ket;
    }
    public String getKet() {
        return ket;
    }
    void viewdoktear() {
        System.out.println("Nama Dokter");
        System.out.println("1. drg. Ahmad Afandi");
        System.out.println("2. dr. Aris Wicaksono, Sp.A.");
        System.out.println("3. dr. Alfis Putri");
    }

    public String getDoktear() {
        String hasil = "";

        if (this.doktear == 1) {
            hasil = "drg. Ahmad Afandi";
        } else if (this.doktear == 2) {
            hasil = "dr. Aris Wicaksono, Sp.A.";
        } else if (this.doktear == 3) {
            hasil = "dr. Alfis Putri";
        }

        return hasil;
    }

}


class RumahSakitWaras {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int jsDaftar, jsObat, jsVitamin, jsDok;
        Pemesanan pesan = new Pemesanan();
        Transaksi order = new Transaksi();
        System.out.println(" ----- SELAMAT DATANG DI RUMAH SAKIT WARAS ----- ");
        System.out.println(" ================================================= ");
        System.out.println();
        System.out.println("  ----------------------o0o----------------------  ");
        System.out.println("*Masukan Data Pasien*");

        System.out.print("Masukan Nama      : ");
        pesan.setNama(sc.nextLine());

        System.out.print("Masukan Alamat    : ");
        pesan.setAlamat(sc.nextLine());

        System.out.print("Masukan No. Telp  : ");
        pesan.setTelpon(sc.nextLine());

        System.out.println();

        order.viewpoli();
        System.out.println();
        System.out.print("Pilih Poli        : ");
        order.setPoli(sc.nextInt());
        sc.nextLine();
        System.out.println();

        order.viewdoktear();
        System.out.println();
        System.out.print("Pilih Dokter        : ");
        order.setDokter(sc.nextInt());
        sc.nextLine();

        System.out.println();
        System.out.print("Berikan Keterangan Dokter        : ");
        order.setKeterangan(sc.nextLine());

        System.out.println();

        System.out.print("Masukan Biaya Pendaftaran         : Rp.");
        jsDaftar = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukan Biaya Obat               : Rp.");
        jsObat = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukan Biaya Vitamin              : Rp.");
        jsVitamin = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukan Biaya Dokter           : Rp.");
        jsDok = sc.nextInt();
        sc.nextLine();

        System.out.println("  ----------------------o0o----------------------  ");
        System.out.println(" ================================================= ");
        System.out.println("Poli                        : "+order.getPoli());
        System.out.println("Dokter                       : "+order.getDoktear());
        System.out.println("Keterangan                   : "+order.getKet() );
        System.out.println();
        System.out.println("Total Biaya yang di Bayar Pasien : Rp."+(jsDaftar+jsObat+jsVitamin+jsDok));
        System.out.println();
        System.out.println("Salam sehat " + pesan.getNama() + " Dari Rumah Sakit Waras");

    }
}
