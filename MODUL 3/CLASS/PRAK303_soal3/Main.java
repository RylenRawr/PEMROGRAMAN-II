package PRAK303_soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = sc.nextInt();

            if (pilihan == 0) {
                mahasiswaList.clear();
                System.out.println("Terima kasih!");
                break;
            } else if (pilihan == 1) {
                System.out.print("Masukkan Nama Mahasiswa: ");
                sc.nextLine();
                String nama = sc.nextLine();
                System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                String nim = sc.nextLine();

                boolean isNimExist = false;
                for (Mahasiswa mahasiswa : mahasiswaList) {
                    if (mahasiswa.getNim().equals(nim)) {
                        isNimExist = true;
                        break;
                    }
                }

                if (isNimExist) {
                    System.out.println("NIM sudah digunakan.");
                } else {
                    Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
                    mahasiswaList.add(mahasiswa);
                    System.out.println("Mahasiswa " + nama + " ditambahkan.");
                }
            } else if (pilihan == 2) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                String nim = sc.next();

                boolean isNimExist = false;
                for (Mahasiswa mahasiswa : mahasiswaList) {
                    if (mahasiswa.getNim().equals(nim)) {
                        isNimExist = true;
                        mahasiswaList.remove(mahasiswa);
                        System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
                        break;
                    }
                }

                if (!isNimExist) {
                    System.out.println("NIM tidak ditemukan.");
                }
            } else if (pilihan == 3) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                String nim = sc.next();

                boolean isNimExist = false;
                for (Mahasiswa mahasiswa : mahasiswaList) {
                    if (mahasiswa.getNim().equals(nim)) {
                        isNimExist = true;
                        System.out.println("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama());
                        break;
                    }
                }
                if (!isNimExist) {
                    System.out.println("NIM tidak ditemukan.");
                }
            } else if (pilihan == 4) {
                System.out.println("Daftar Mahasiswa:");
                for (Mahasiswa mahasiswa : mahasiswaList) {
                    System.out.println("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama());
                }
            } else {
                System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        }
    }
}
