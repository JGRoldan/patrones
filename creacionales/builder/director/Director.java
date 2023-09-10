package builder.director;

import builder.TipoDeCasa;
import builder.builders.Builder;

public class Director {

	public void constructorCasaMadera(Builder builder) {
		builder.setTipoCasa(TipoDeCasa.MADERA);
		builder.setPuertas(2);
		builder.setVentanas(4);
		builder.setCantPisos(1);
	}
	public void constructorCasaLadrillo(Builder builder) {
		builder.setTipoCasa(TipoDeCasa.LADRILLO);
		builder.setPuertas(3);
		builder.setVentanas(8);
		builder.setCantPisos(2);
	}
	public void constructorCasaPrefabricada(Builder builder) {
		builder.setTipoCasa(TipoDeCasa.PREFABRICADA);
		builder.setPuertas(4);
		builder.setVentanas(10);
		builder.setCantPisos(2);
	}
}
