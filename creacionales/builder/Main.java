package builder;

import builder.builders.CasaBuilder;
import builder.casas.Casa;
import builder.director.Director;

public class Main {

	public static void main(String[] args) {
		Director director = new Director();
		CasaBuilder builder = new CasaBuilder();
		director.constructorCasaLadrillo(builder);
		
		Casa casa = builder.getResult();
		System.out.println("Casa construida: " + casa.getTipoDeCasa());
		System.out.println("Caracteristicas: \n" + casa.toString());
	}

}
