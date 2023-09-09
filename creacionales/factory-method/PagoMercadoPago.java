package factory;

public class PagoMercadoPago implements Pago {
	
	@Override
	public void generarPago() {
		System.out.println("Se realizo el pago con " + TipoDePago.MERCADOPAGO);
	}

}
