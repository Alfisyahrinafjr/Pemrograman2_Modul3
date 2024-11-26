package soal2;

import java.util.HashMap;

public class Negara {
	private String nama;
	private String jenisKepemimpinan;
	private String namaPemimpin;
	private int tanggalKemerdekaan;
	private int bulanKemerdekaan;
	private int tahunKemerdekaan;

	public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
		this.nama = nama;
		this.jenisKepemimpinan = jenisKepemimpinan;
		this.namaPemimpin = namaPemimpin;
		this.tanggalKemerdekaan = tanggalKemerdekaan;
		this.bulanKemerdekaan = bulanKemerdekaan;
		this.tahunKemerdekaan = tahunKemerdekaan;
	}
	
	public void displayInfo(HashMap<Integer, String> bulanMap) {
		String kepemimpinan = jenisKepemimpinan.equalsIgnoreCase("monarki") ? "Raja" : jenisKepemimpinan;

        System.out.println("Negara " + nama + " mempunyai " + kepemimpinan + " bernama " + namaPemimpin);
        if (!jenisKepemimpinan.equalsIgnoreCase("monarki")) { 
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " " + bulanMap.get(bulanKemerdekaan) + " " + tahunKemerdekaan);
        }
        System.out.println();
    }
}
