package factory;

public class Main {

	public static void main(String[] args){
		
		PagoFactory pagoFactory = new PagoFactory();
		Pago pago = pagoFactory.obtenerPago(TipoDePago.EFECTIVO);
		pago.generarPago();
	}

}
