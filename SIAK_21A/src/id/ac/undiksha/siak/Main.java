package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Mahasiswa;
import id.ac.undiksha.siak.entities.Dosen;
import id.ac.undiksha.siak.entities.Pegawai;

public class Main {

	public static void main(String[] args) {
		
		Mahasiswa mhs1 = new Mahasiswa();
		mhs1.printlnALLInfo();
		
		Dosen dsn1 = new Dosen();
		dsn1.printlnALLInfo();
		
		Pegawai pgw1 = new Pegawai();
		pgw1.printlnALLInfo();
		
		Mahasiswa mhs2 = new Mahasiswa(
				"Budi",
				"Singaraja",
				true,
				"21516161",
				"ilmu Komputer",
				"Teknik Informatika",
				"Teknik dan kejuruan"
				);
		mhs2.printlnALLInfo();
		
		
		
	}

}
