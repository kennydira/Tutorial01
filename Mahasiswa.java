public class Mahasiswa {
	String name;
	String npm;

	public Mahasiswa (String name, int npm) {
		super();
		this.name = name;
		this.npm = npm;
	}

	public getName() {
		return name;
	}

	public void setName(String mahasiswaName) {
		name = mahasiswaName;
	}

	public getNpm() {
		return npm;
	}

	public void setNpm(int mahasiswaNpm) {
		npm = mahasiswaNpm;
	}
}