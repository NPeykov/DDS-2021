object promocion{
	method ajustarPrecio(precioBase, valorUsuario){
		const nuevoPrecio = precioBase - valorUsuario
		if( nuevoPrecio < 0){
			throw new Exception (message = "El precio no puede ser negativo")
		}
		else return nuevoPrecio
	}
}

object nuevo{
	method ajustarPrecio(precioBase, valorUsuario){
		return precioBase
	}
}

object liquidacion{
	method ajustarPrecio(precioBase, valorUsuario){
		return precioBase * 0.5
	}
}
