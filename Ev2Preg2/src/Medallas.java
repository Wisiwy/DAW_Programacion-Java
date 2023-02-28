import java.util.Objects;

public class Medallas {
	private String pais;
	private Integer oros;
	private Integer platas;
	private Integer bronces;

	public Medallas(String pais) {
		this.pais = pais;
		this.oros = 0;
		this.platas = 0;
		this.bronces = 0;
	}

	// Metodos para incrementar
	public void incOros() {
		this.oros++;
	}

	public void incPlatas() {
		this.platas++;
	}

	public void incBronces() {
		this.bronces++;
	}

	// Lo hace solo el equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medallas other = (Medallas) obj;
		return Objects.equals(pais, other.pais);
	}

	public Integer getOros() {
		return oros;
	}

	public void setOros(Integer oros) {
		this.oros = oros;
	}

	public Integer getPlatas() {
		return platas;
	}

	public void setPlatas(Integer platas) {
		this.platas = platas;
	}

	public Integer getBronces() {
		return bronces;
	}

	public void setBronces(Integer bronces) {
		this.bronces = bronces;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return String.format("%s \t Oros: %d || Platas: %d || Bronces: %d", pais, oros, platas, bronces);
	}

}
