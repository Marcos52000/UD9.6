package Main;

import java.util.Random;
import Clases.*;

public class SalaApp {

	public static String[][] sala = { { "8A", "8B", "8C", "8D", "8E", "8F", "8G", "8H", "8I" },
			{ "7A", "7B", "7C", "7D", "7E", "7F", "7G", "7H", "7I" },
			{ "6A", "6B", "6C", "6D", "6E", "6F", "6G", "6H", "6I" },
			{ "5A", "5B", "5C", "5D", "5E", "5F", "5G", "5H", "5I" },
			{ "4A", "4B", "4C", "4D", "4E", "4F", "4G", "4H", "4I" },
			{ "3A", "3B", "3C", "3D", "3E", "3F", "3G", "3H", "3I" },
			{ "2A", "2B", "2C", "2D", "2E", "2F", "2G", "2H", "2I" },
			{ "1A", "1B", "1C", "1D", "1E", "1F", "1G", "1H", "1I" } };
	public static Espectador arrayEs[];
	public static Pelicula p1 = new Pelicula("Spiderman", 120, 12, "Jon Watts");
	public static Cine c1 = new Cine(p1, 5);

	public static void main(String[] args) {
		arrayEs = crearEspectadores();
		mostrarSala();

		for (int i = 0; i < arrayEs.length; i++) {
			asignarAsiento(arrayEs[i]);
		}
		mostrarSala();

	}

	// crear espectadores
	public static Espectador[] crearEspectadores() {
		Espectador espec[] = new Espectador[10];
		Espectador e1 = new Espectador("a", 15, 50);
		Espectador e2 = new Espectador("b", 10, 20);
		Espectador e3 = new Espectador("c", 30, 100);
		Espectador e4 = new Espectador("d", 18, 10);
		Espectador e5 = new Espectador("e", 12, 2);
		Espectador e6 = new Espectador("f", 24, 20);
		Espectador e7 = new Espectador("g", 20, 4);
		Espectador e8 = new Espectador("h", 50, 30);
		Espectador e9 = new Espectador("i", 35, 4);
		Espectador e10 = new Espectador("j", 19, 3);

		espec[0] = e1;
		espec[1] = e2;
		espec[2] = e3;
		espec[3] = e4;
		espec[4] = e5;
		espec[5] = e6;
		espec[6] = e7;
		espec[7] = e8;
		espec[8] = e9;
		espec[9] = e10;

		return espec;
	}

	// asignar asiento para los espectadores aleatoriamente
	public static void asignarAsiento(Espectador es) {
		Random random = new Random();
		int filas;
		int columnas;
		if (es.getDinero() > c1.getPrecioEntrada() && es.getEdad() > p1.getEdadMinima()) {
			do {
				filas = random.nextInt(8);
				columnas = random.nextInt(9);
				sala[filas][columnas] = "X";
			} while (!sala[filas][columnas].equals("X"));
		}
	}

	// printar por pantalla las posiciones de la sala
	public static void mostrarSala() {
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[i].length; j++) {
				System.out.print(sala[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
