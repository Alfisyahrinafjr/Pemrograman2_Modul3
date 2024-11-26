package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nim = scanner.nextLine();
                    daftarMahasiswa.add(new Mahasiswa(nama, nim));
                    System.out.println("Mahasiswa " + nama + " ditambahkan.");
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimHapus = scanner.nextLine();
                    boolean ditemukanHapus = false;

                    for (int i = 0; i < daftarMahasiswa.size(); i++) {
                        if (daftarMahasiswa.get(i).getNim().equals(nimHapus)) {
                            daftarMahasiswa.remove(i);
                            System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
                            ditemukanHapus = true;
                            break;
                        }
                    }

                    if (!ditemukanHapus) {
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang ingin dicari: ");
                    String nimCari = scanner.nextLine();
                    boolean ditemukanCari = false;

                    for (Mahasiswa m : daftarMahasiswa) {
                        if (m.getNim().equals(nimCari)) {
                            System.out.println("Mahasiswa ditemukan!");
                            System.out.println("Nama: " + m.getNama());
                            System.out.println("NIM: " + m.getNim());
                            ditemukanCari = true;
                            break;
                        }
                    }

                    if (!ditemukanCari) {
                        System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
                    }
                    break;

                case 4:
                    if (daftarMahasiswa.isEmpty()) {
                        System.out.println("Daftar Mahasiswa kosong.");
                    } else {
                        System.out.println("\nDaftar Mahasiswa:");
                        for (Mahasiswa m : daftarMahasiswa) {
                            System.out.println("NIM: " + m.getNim() + ", Nama: " + m.getNama());
                        }
                    }
                    break;

                case 0:
                    daftarMahasiswa.clear();
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
