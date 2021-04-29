public class QueMePongo{
    List<Atuendo> atuendos;
    Usuario usuario; //puede ser un usuario de mi aplicacion, a definir
    
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

    public Prenda(TipoPrenda tipoPrenda){
	if(tipoPrenda == null){
	    throw new RunTimeException ("Debe especificar tipo prenda!");
	}
	else{
	    this.tipoPrenda = tipoPrenda;
	}
    }

    public asignarCaracteristicas(material, colorPrimario, colorSecundario){
	if(material == null || colorPrimario == null){
	    throw new RunTimeException("Faltan asignar caracteristicas!");
	}

	else if(!tipoPrenda.esMaterialValido(material)){
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


//Podria ser un enum, me falta ver como podria agregarle comportamiento
enum TipoPrenda{
    Categoria categoria;

    public TipoPrenda(categoria){
	this.categoria = categoria;
    }

    public boolean esMaterialValido(Material material){
	//podria ir aca la relacion TIPO PRENDA - TIPO MATERIAL
    }

    CATEGORIA1(categoria),
    CATEGORIA2(categoria),
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

    public Material(trama){
	if(trama == null)
	    this.trama = Trama.LISA;
	else this.trama = trama;
    }
    
    TIPO1,
    TIPO2,
    ETC
}

enum Trama{
    LISA,
    RAYADA,
    CON_LUNARES,
    CUADRADOS,
    ESTAMPADO
}


