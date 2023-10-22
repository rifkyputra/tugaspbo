package SoalSatu;


import java.util.Scanner;

class Perawatan {
    public static double hitungHargaPerawatan(int pilihanPerawatan, int jumlahOrang) {
        double harga = 0;
        if (pilihanPerawatan == 1) {
            harga = 50000;
        } else if (pilihanPerawatan == 2) {
            harga = 100000;
        } else if (pilihanPerawatan == 3) {
            if (jumlahOrang == 1) {
                harga = 40000;
            } else if (jumlahOrang == 2) {
                harga = 75000;
            }
        } else if (pilihanPerawatan == 4) {
            if (jumlahOrang == 1) {
                harga = 20000;
            } else if (jumlahOrang == 2) {
                harga = 35000;
            }
        }
        return harga;
    }

    public static double hitungTotalPerawatan(int pilihanPerawatan, int jumlahOrang) {
        double hargaPerawatan = hitungHargaPerawatan(pilihanPerawatan, jumlahOrang);
        return hargaPerawatan * jumlahOrang;
    }
}

class Sewa {
    public static double hitungHargaSewa(int pilihanSewa, int jumlahJam) {
        double harga = 0;
        if (pilihanSewa == 1) {
            harga = 100000;
        } else if (pilihanSewa == 2) {
            harga = 250000;
        } else if (pilihanSewa == 3) {
            if (jumlahJam == 1) {
                harga = 150000;
            } else if (jumlahJam == 2) {
                harga = 350000;
            }
        } else if (pilihanSewa == 4) {
            if (jumlahJam == 1) {
                harga = 20000;
            } else if (jumlahJam == 2) {
                harga = 50000;
            }
        }
        return harga;
    }

    public static double hitungTotalSewa(int pilihanSewa, int jumlahJam) {
        double hargaSewa = hitungHargaSewa(pilihanSewa, jumlahJam);
        return hargaSewa * jumlahJam;
    }
}

public class Salon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama, noTelepon;
        double totalHarga = 0;

        System.out.print("Masukkan nama: ");
        nama = scanner.nextLine();

        System.out.print("Masukkan nomor telepon: ");
        noTelepon = scanner.nextLine();

        char lanjutkan;
        do {
            System.out.println("Pilihan Menu (Ketik 1/2)");
            System.out.print("1. Perawatan\n2. Penyewaan\nPilihan Anda: ");
            int pilihanMenu = scanner.nextInt();

            if (pilihanMenu == 1) {
                System.out.println("Menu Perawatan");
                System.out.println("1. Fasial Wajah");
                System.out.println("2. Masker");
                System.out.println("3. Potong Rambut");
                System.out.print("Pilih jenis perawatan (1/2/3): ");
                int pilihanPerawatan = scanner.nextInt();
                System.out.print("Jumlah orang: ");
                int jumlahOrang = scanner.nextInt();

                double totalPerawatan = Perawatan.hitungTotalPerawatan(pilihanPerawatan, jumlahOrang);
                totalHarga += totalPerawatan;
            } else if (pilihanMenu == 2) {
                System.out.println("Menu Penyewaan");
                System.out.println("1. Rias Wajah");
                System.out.println("2. Baju Pengantin");
                System.out.println("3. Aksesoris");
                System.out.print("Pilih jenis sewa (1/2/3): ");
                int pilihanSewa = scanner.nextInt();
                System.out.print("Jumlah jam sewa: ");
                int jumlahJam = scanner.nextInt();

                double totalSewa = Sewa.hitungTotalSewa(pilihanSewa, jumlahJam);
                totalHarga += totalSewa;
            }

            System.out.print("Ingin input lagi? [Y/T]: ");
            lanjutkan = scanner.next().charAt(0);
        } while (lanjutkan == 'Y' || lanjutkan == 'y');

        System.out.println("Terima kasih, " + nama + "!");
        System.out.println("Total yang harus dibayar: " + totalHarga);

        scanner.close();
}
}