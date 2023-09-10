package builder.casas;

import builder.TipoDeCasa;

public class Casa {

	private TipoDeCasa tipoDeCasa;
	private int puertas;
	private int ventanas;
	private int pisos;
	
	public Casa(TipoDeCasa tipoDeCasa, int puertas, int ventanas, int pisos) {
		this.tipoDeCasa = tipoDeCasa;
		this.puertas = puertas;
		this.ventanas = ventanas;
		this.pisos = pisos;
	}
	
	public TipoDeCasa getTipoDeCasa() {
		return tipoDeCasa;
	}

	public void setTipoDeCasa(TipoDeCasa tipoDeCasa) {
		this.tipoDeCasa = tipoDeCasa;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getVentanas() {
		return ventanas;
	}

	public void setVentanas(int ventanas) {
		this.ventanas = ventanas;
	}

	public int getPisos() {
		return pisos;
	}

	public void setPisos(int pisos) {
		this.pisos = pisos;
	}

	@Override
	public String toString() {
		return "Puertas=" + puertas + "\n"
				+ "Ventanas=" + ventanas + "\n"
				+ "Pisos=" + pisos;
	}
	

}
