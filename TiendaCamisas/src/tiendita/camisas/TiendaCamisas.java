package tiendita.camisas;
import java.util.Scanner;

public class TiendaCamisas {

	public static final double PRECIO_CAMISA_MANGA_CORTA = 190.0;
	public static final double PRECIO_CAMISA_CASUAL_MANGA_LARGA = 230.0;
	public static final double PRECIO_CAMISA_FORMAL_MANGA_LARGA = 310.0;

	public static double calcularDescuento(int cantidadCamisas) {
		if (cantidadCamisas <= 2) {
			return 0.0;
		} else if (cantidadCamisas >= 3 && cantidadCamisas <= 5) {
			return 0.05;
		} else {
			return 0.08;
		}
	}

	public static double calcularCostoTotal(int[] cantidadCamisas) {
		double costoTotal = 0.0;

		costoTotal += cantidadCamisas[0] * PRECIO_CAMISA_MANGA_CORTA;
		costoTotal += cantidadCamisas[1] * PRECIO_CAMISA_CASUAL_MANGA_LARGA;
		costoTotal += cantidadCamisas[2] * PRECIO_CAMISA_FORMAL_MANGA_LARGA;

		int cantidadTotalCamisas = cantidadCamisas[0] + cantidadCamisas[1] + cantidadCamisas[2];
		double descuento = calcularDescuento(cantidadTotalCamisas);
		double precioAntesDescuento = costoTotal;
		costoTotal -= costoTotal * descuento;
		double porcentajeDescuento = descuento * 100;

		System.out.println("Precio antes del descuento: $" + precioAntesDescuento);
		System.out.println("Porcentaje de descuento aplicado: " + porcentajeDescuento + "%");

		return costoTotal;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese la cantidad de camisas de manga corta: ");
		int cantidadCamisasMangaCorta = sc.nextInt();

		System.out.print("Ingrese la cantidad de camisas casuales de manga larga: ");
		int cantidadCamisasCasualMangaLarga = sc.nextInt();

		System.out.print("Ingrese la cantidad de camisas formales de manga larga: ");
		int cantidadCamisasFormalMangaLarga = sc.nextInt();

		int[] cantidadCamisas = { cantidadCamisasMangaCorta, cantidadCamisasCasualMangaLarga,
				cantidadCamisasFormalMangaLarga };

		double costoTotal = calcularCostoTotal(cantidadCamisas);
		System.out.println("El costo total es :" + costoTotal);
	}
}