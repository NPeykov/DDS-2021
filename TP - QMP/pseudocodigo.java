public class Atuendo{
    List<Prenda> prendas;
}

public class Prenda{
    TipoPrenda tipoPrenda;
    Material material;
    Color colorPrimario;
    Color colorSecundario;

    public Prenda(tipoPrenda, material, colorPrimario, colorSecundario){ //CONSTRUCTOR DE UNA PRENDA
	if(tipoPrenda == null || material == null || colorPrimario == null){
	    throw new RunTimeException ("Falta un campo por completar");
	}
	else{
	    this.tipoPrenda = tipoPrenda;
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
public class TipoPrenda{
    Categoria categoria;
}

public enum Categoria{
    PARTE_SUPERIOR,
    PARTE_INFERIOR,
    CALZADO,
    ACCESORIO
}


//falta ver como se podria implementar.
enum Material{
    TIPO1,
    TIPO2,
    ETC
}
