public class QueMePongo{
    List<Atuendo> atuendos;
    Usuario usuario;
    /*
      en realidad tendria que poder mostrarle de alguna forma.
      Usuario es una abstraccion de algo a lo que le puedo mostrar la prenda generada.
      Tambien puede ser que tenga que mostrar la prenda por pantalla y no enviarsela a una clase Usuario.
      Hay que ver en un futuro si el usuario va a tener mas comportamientos.
     */
    
    public void sugerirUniforme(Usuario usuario){
	Atuendo unUniforme = this.generarUniforme();
	usuario.recibirSugerencia(unUniforme);
    }

    public Atuendo generarUniforme(){
	//genera uniforme
    }
}


public class Atuendo{
    List<Prenda> prendas;
}

public class Prenda{
    TipoPrenda tipoPrenda;
    Material material;
    Color colorPrimario;
    Color colorSecundario;

    public Prenda(TipoPrenda tipoPrenda){ //primero creo la prenda
	if(tipoPrenda == null){
	    throw new RunTimeException ("Debe especificar tipo prenda!");
	}
	else{
	    this.tipoPrenda = tipoPrenda;
	}
    }

    public asignarCaracteristicas(material, colorPrimario, colorSecundario){ //luego asigno las caracteristicas de la prenda
	if(material == null || colorPrimario == null){
	    throw new RunTimeException("Faltan asignar caracteristicas!");
	}

	else if(!tipoPrenda.esMaterialValido(material)){ //tiene que ver con la relacion TIPO PRENDA - MATERIAL
	    throw new RunTimeException("No es un material valido para esa prenda!");
	}
	else{
	    this.material = material;
	    this.colorPrimario = colorPrimario;
	    this.colorSecundario = colorSecundario;
	}
    }
}

public class Color{
    String color;
}


enum TipoPrenda{
    Categoria categoria;

    public setCategoria(categoria){ //no se si haciendo esto ya lo valida en java.
	this.categoria = categoria;
    }

    public boolean esMaterialValido(Material material){
	/*de alguna forma aca podria ir la relacion de restriccion entre TIPO PRENDA - MATERIAL.
	  no creo que se tenga que poner todas las posibilidades dentro de un enum, son demasiadas,
	  pero tampoco se me ocurre otra forma de hacerlo
	*/
    }

    TIPOPRENDA1(Categoria.UNACATEGORIA),
    TIPOPRENDA2(Categoria.OTRACATEGORIA),
    ETC..
}


public enum Categoria{
    PARTE_SUPERIOR,
    PARTE_INFERIOR,
    CALZADO,
    ACCESORIO
}


//falta ver como se podria implementar.
enum Material{
    Trama trama;

    public setTrama(trama){
	if(trama == null)
	    this.trama = Trama.LISA;
	else this.trama = trama;
    }
    /*
      No creo que tenga que tener el mismo acoplamiento que TIPO PRENDA - CATEGORIA
      porque en este caso cualquier material podria tener CUALQUIER trama.
      Podrian existir hasta zapatos con estampado.
      Por eso no creo que tenga que tener una relacion tan fuerte, simplemente tiene que haber
      un atributo para que material conozca a su trama, pero que no haya exclusion entre los mismos.
      --No se si puede implementarse un enum de esta forma.
    */
    MATERIAL1,
    MATERIAL2,
    ETC..
}

enum Trama{
    LISA,
    RAYADA,
    CON_LUNARES,
    CUADRADOS,
    ESTAMPADO
}


