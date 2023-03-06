package h3_ejer02_trenes;

public class Billete {
	
	private static Integer numBill = 1;
	private String horaSal;
	private Integer numTrenBill;
	private Integer numVagonBill;
	private Integer asiento;
	
	
	
	public Billete() {
		this.numBill = numBill;
		numBill++;
	}



	public Billete(String horaSal, Integer numTrenBill, Integer numVagonBill, Integer asiento) {
		this.numBill = numBill;
		numBill++;
		this.horaSal = horaSal;
		this.numTrenBill = numTrenBill;
		this.numVagonBill = numVagonBill;
		this.asiento = asiento;
	}
	
	
	
	@Override
	public String toString() {
		System.out.println();
		return String.format("| Num Billete: %2d |\n|************************|\n"
				+ "| HoraSal: %s |\n| Tren: %10d |\n| Vagon: "
				+ "%10d |\n| Asiento: %10d |",numBill,horaSal,numTrenBill,numVagonBill, asiento);
		
	}



	public String getHoraSal() {
		return horaSal;
	}
	public void setHoraSal(String horaSal) {
		this.horaSal = horaSal;
	}
	public Integer getNumTrenBill() {
		return numTrenBill;
	}
	public void setNumTrenBill(Integer numTrenBill) {
		this.numTrenBill = numTrenBill;
	}
	public Integer getNumVagonBill() {
		return numVagonBill;
	}
	public void setNumVagonBill(Integer numVagonBill) {
		this.numVagonBill = numVagonBill;
	}
	public Integer getAsiento() {
		return asiento;
	}
	public void setAsiento(Integer asiento) {
		this.asiento = asiento;
	}
	
	
	

}
