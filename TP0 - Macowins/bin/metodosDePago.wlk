object efectivo{
	method calcularMonto(cuotas, prenda){
		return prenda.precio()
	}
}

object tarjeta{
	const coheficienteFijo
	
	method calcularMonto(cuotas, prenda){
		const precioPrenda = prenda.precio()
		return precioPrenda + self.recargo(cuotas, precioPrenda)
	}
	
	method recargo(cuotas, precioPrenda){
		return cuotas * coheficienteFijo + 0.01 * precioPrenda
	}
}
