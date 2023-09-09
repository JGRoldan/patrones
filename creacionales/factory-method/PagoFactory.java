package factory;

import java.util.HashMap;

public class PagoFactory {

	private final static HashMap<TipoDePago, Pago> pagos = new HashMap<>() 
	{{
		put(TipoDePago.MERCADOPAGO, new PagoMercadoPago());
		put(TipoDePago.PAYPAL, new PagoPaypal());
		put(TipoDePago.DEBITO, new PagoDebito());
		put(TipoDePago.CREDITO, new PagoCredito());
		put(TipoDePago.EFECTIVO, new PagoEfectivo());
	}};
	
	public Pago obtenerPago(TipoDePago tipoDePago){
		return pagos.get(tipoDePago);
	}
}
