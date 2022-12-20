package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Mahasiswa;
import id.ac.undiksha.siak.entities.Dosen;
import id.ac.undiksha.siak.entities.Pegawai;
import id.ac.undiksha.siak.entities.Manusia;


public class Main {

	public static void main(String[] args) {
		
		/*Mahasiswa mhs1 = new Mahasiswa();
		mhs1.printlnALLInfo();*/
		
		/*Dosen dsn1 = new Dosen();
		dsn1.printlnALLInfo();*/
		
		/*Pegawai pgw1 = new Pegawai();
		pgw1.printlnALLInfo();*/
		
		/*Manusia mn1 = new Mahasiswa();
		mn1.setNama("Dudi");*/
		
		Mahasiswa mhs2 = new Mahasiswa(
				"Budi",
				"Singaraja",
				false,
				"21516161",
				"kode Ilkom",
				"ilmu Komputer",
				"Teknik Informatika",
				"Teknik dan kejuruan"
				);
		
		mhs2.printAllinfo();
		mhs2.getProdi().setKodeProdi("1234");
		mhs2.getProdi().getKodeProdi();
		mhs2.getNama();
		mhs2.getProdi().getkodeJurusan();
		
		/*Manusia mns1 = new Manusia();
		
		/*Manusia mns1 = new Manusia("Caca", "Gianyar", false);
		System.out.println(mns1.getNama());*/
		
		
		
		
	}

}
