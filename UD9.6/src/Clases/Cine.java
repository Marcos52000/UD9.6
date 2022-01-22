package Clases;

public class Cine {

	// atributos
	Pelicula pelicula;
	int precioEntrada;

	// constructor
	public Cine(Pelicula pelicula, int precioEntrada) {
		super();
		this.pelicula = pelicula;
		this.precioEntrada = precioEntrada;
	}

	// getters y setters
	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(int precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

}
