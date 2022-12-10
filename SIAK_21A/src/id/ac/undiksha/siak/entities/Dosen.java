package id.ac.undiksha.siak.entities;

public class Dosen {
	private String nama;
	private String alamat;
	private boolean jenisKelamin;
	private String nip;
	private String prodi;
	private String jurusan;
	private String Falkutas;
	
	public Dosen ()
	{
		this.setNama("(Nama belum diisi)");	
		alamat	="(alamat belum diisi)";
		nip	="(Nip belum diisi)";
		prodi	="(Prodi belum diisi)";
		jurusan	="(Jurusan belum diisi)";
		Falkutas="(Falkutas belum diisi)";
	}
	
	
	public Dosen (String nama, String alamat, boolean jenisKelamin, String nip, String prodi, String jurusan,
			String falkutas) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.jenisKelamin = jenisKelamin;
		this.nip = nip;
		this.prodi = prodi;
		this.jurusan = jurusan;
		this.Falkutas = falkutas;
	}


	public void printlnALLInfo() {
		System.out.println("Nama:"+ this.getNama());
		System.out.println("Alamat:"+ this.getAlamat());
		System.out.println("Nip:"+ this.getNip());
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
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
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
