package builder.builders;

import builder.TipoDeCasa;
import builder.casas.Casa;

public class CasaBuilder implements Builder {

	private TipoDeCasa tipoDeCasa;
	private int puertas;
	private int ventanas;
	private int pisos;
	
	@Override
	public void setTipoCasa(TipoDeCasa tipoDeCasa) {
		this.tipoDeCasa = tipoDeCasa;
	}

	@Override
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public void setVentanas(int ventanas) {
		this.ventanas = ventanas;
	}

	@Override
	public void setCantPisos(int pisos) {
		this.pisos = pisos;
	}

	public Casa getResult() {
		return new Casa(tipoDeCasa, puertas, ventanas, pisos);
	}
}
