/* tienda macowins  */

object macowins {
	var ventas = #{}
	
	method calcularGanancias(fecha){
		return self.ventasEnUnaFecha(fecha).sum({ venta =>  venta.montoTotal()})
	}
	
	method ventasEnUnaFecha(fecha){
		return ventas.filter({ venta => venta.seRealizoEn(fecha) })
	}
}
