class Venta {
	var prendasVendidas
	const fechaVenta
	var metodoDePago
	
	method montoTotal(){
		return prendasVendidas.sum({ prendaVendida => prendaVendida.precio() })
	}
	
	method montoACobrar(cuotas){
		return prendasVendidas.sum({ prenda => metodoDePago.calcularMonto(cuotas, prenda) })
	}
	
	method registrarPrenda(prenda){
		prendasVendidas.add(prenda)
	}
	
	method seRealizoEn(fecha){
		return fechaVenta == fecha
	}
}
