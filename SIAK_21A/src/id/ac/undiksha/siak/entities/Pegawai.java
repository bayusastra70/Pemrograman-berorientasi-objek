package id.ac.undiksha.siak.entities;

public class Pegawai {
	private String nama;
	private String alamat;
	private boolean jenisKelamin;
	private String nip;
	
	
	public Pegawai ()
	{
		this.setNama("(Nama belum diisi)");	
		alamat	="(alamat belum diisi)";
		nip	="(Nip belum diisi)";
		
	}
	
	
	public Pegawai (String nama, String alamat, boolean jenisKelamin, String nip) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.jenisKelamin = jenisKelamin;
		this.nip = nip;
		
	}


	public void printlnALLInfo() {
		System.out.println("Nama:"+ this.getNama());
		System.out.println("Alamat:"+ this.getAlamat());
		System.out.println("Nip:"+ this.getNip());
		
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
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}


}
