package id.ac.undiksha.organisasi;

public class Prodi implements Jurusan{

	private String kodeProdi;
	private String namaProdi;
	
	public Prodi() {
		this.setKodeProdi("()");
		this.setNamaProdi("()");
	}
	
	public Prodi(String kodeProdi, String namaProdi) {
		super();
		this.kodeProdi = kodeProdi;
		this.kodeProdi = namaProdi;
	}
	
	public String getKodeProdi() {
		return kodeProdi;
	}
	
	public String setKodeProdi(String kodeProdi) {
		return kodeProdi;
	}
	
	public String getNamaProdi() {
		return namaProdi;
	}
	
	public String setNamaProdi(String namaProdi) {
		return namaProdi;
	}
	
	private String namaJurusan;
	private String kodeJurusan;
	

	public void setNamaJurusan(String namaJurusan) {
		this.namaJurusan = namaJurusan;
		
	}

	@Override
	public String getNamaJurusan() {
		return this.namaJurusan;
	}

	public void setKodeJurusan(String kodeJurusan) {
		this.kodeJurusan = kodeJurusan;
		
	}

	@Override
	public String getkodeJurusan() {
		return this.kodeJurusan;
	}
	


}
