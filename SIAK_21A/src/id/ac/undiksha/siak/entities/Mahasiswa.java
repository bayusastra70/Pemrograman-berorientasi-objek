package id.ac.undiksha.siak.entities;

public class Mahasiswa {

	private String nama;
	private String alamat;
	private boolean jenisKelamin;
	private String nim;
	private String prodi;
	private String jurusan;
	private String Falkutas;
	
	public Mahasiswa()
	{
		this.setNama("(Nama belum diisi)");	
		alamat	="(alamat belum diisi)";
		nim		="(Nim belum diisi)";
		prodi	="(Prodi belum diisi)";
		jurusan	="(Jurusan belum diisi)";
		Falkutas="(Falkutas belum diisi)";
	}
	
	
	public Mahasiswa(String nama, String alamat, boolean jenisKelamin, String nim, String prodi, String jurusan,
			String falkutas) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.jenisKelamin = jenisKelamin;
		this.nim = nim;
		this.prodi = prodi;
		this.jurusan = jurusan;
		this.Falkutas = falkutas;
	}


	public void printlnALLInfo() {
		System.out.println("Nama:"+ this.getNama());
		System.out.println("Alamat:"+ this.getAlamat());
		System.out.println("Nim:"+ this.getNim());
		System.out.println("Jurusan:"+ this.getJurusan());
		System.out.println("Prodi:"+ this.getProdi());
		System.out.println("Falkutas:"+ this.getFalkutas());
		System.out.println("Jenis Kelamin:" + (jenisKelamin ?"laki-laki":"Perempuan"));
	}
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public boolean getJenisKelamin() {
		return jenisKelamin;
	}
	public void setJenisKelamin(boolean jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getProdi() {
		return prodi;
	}
	public void setProdi(String prodi) {
		this.prodi = prodi;
	}
	public String getJurusan() {
		return jurusan;
	}
	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}
	public String getFalkutas() {
		return Falkutas;
	}
	public void setFalkutas(String falkutas) {
		Falkutas = falkutas;
	}
	
	
}