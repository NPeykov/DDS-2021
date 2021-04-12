class Prenda{
	var estado
	var precioBase
	var tipoPrenda
	
	method precio(){
		return estado.ajustarPrecio(precioBase)
	}
	
	method tipoPrenda(){
		return tipoPrenda
	}
}