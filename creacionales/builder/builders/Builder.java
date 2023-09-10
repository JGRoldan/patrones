package builder.builders;

import builder.TipoDeCasa;

public interface Builder {
	public void setTipoCasa(TipoDeCasa tipoDeCasa);
	public void setPuertas(int puertas);
	public void setVentanas(int ventanas);
	public void setCantPisos(int pisos);
}
