package factory;

public class PagoEfectivo implements Pago {

	@Override
	public void generarPago() {
		System.out.println("Se realizo el pago con " + TipoDePago.EFECTIVO);
	}

}
