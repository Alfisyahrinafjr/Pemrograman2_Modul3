package soal2;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashMap<Integer, String> bulanMap = new HashMap<>();
        bulanMap.put(1, "Januari");
        bulanMap.put(2, "Februari");
        bulanMap.put(3, "Maret");
        bulanMap.put(4, "April");
        bulanMap.put(5, "Mei");
        bulanMap.put(6, "Juni");
        bulanMap.put(7, "Juli");
        bulanMap.put(8, "Agustus");
        bulanMap.put(9, "September");
        bulanMap.put(10, "Oktober");
        bulanMap.put(11, "November");
        bulanMap.put(12, "Desember");

        LinkedList<Negara> negaraList = new LinkedList<>();

        System.out.print(" ");
        int jumlahNegara = sc.nextInt();
        sc.nextLine(); 
        
        for (int i = 0; i < jumlahNegara; i++) {
            System.out.print(" ");
            String nama = sc.nextLine();

            System.out.print(" ");
            String jenisKepemimpinan = sc.nextLine();

            System.out.print(" ");
            String namaPemimpin = sc.nextLine();

            int tanggal = 0, bulan = 0, tahun = 0;
            if (!jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                System.out.print(" ");
                tanggal = sc.nextInt();

                System.out.print(" ");
                bulan = sc.nextInt();

                System.out.print(" ");
                tahun = sc.nextInt();
                sc.nextLine();
            }

            negaraList.add(new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggal, bulan, tahun));
        }

        System.out.println(" ");
        for (Negara negara : negaraList) {
            negara.displayInfo(bulanMap);
        }
        
        sc.close();
    }
}

