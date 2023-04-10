package tiendita.camisas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;


class TiendaCamisasTest {
	@Disabled
	@Test
	@DisplayName("Descuento por Camisa")
	void testCalcularDescuento() {
		TiendaCamisas tiendaCamisas = new TiendaCamisas();
		assertEquals(0.0, tiendaCamisas.calcularDescuento(1), "El descuento por 1 Camisa deberia de ser 0%");
		assertEquals(0.0, tiendaCamisas.calcularDescuento(2), "El descuento por 2 Camisa deberia de ser 0%");
		assertEquals(0.05, tiendaCamisas.calcularDescuento(3), "El descuento por 3 Camisas deberia de ser 5%");
		assertEquals(0.05, tiendaCamisas.calcularDescuento(4), "El descuento por 4 Camisas deberia de ser 5%");
		assertEquals(0.05, tiendaCamisas.calcularDescuento(5), "El descuento por 5 Camisas deberia de ser 5%");
		assertEquals(0.08, tiendaCamisas.calcularDescuento(6), "El descuento por 6 Camisas deberia de ser 8%");
		assertEquals(0.08, tiendaCamisas.calcularDescuento(7), "El descuento por 7 Camisas deberia de ser 8%");
	}

	@Test
	void testCalcularCostoTotal() {
		int[] cantidadCamisas1 = {1, 1, 0};
        double costoTotal1 = TiendaCamisas.calcularCostoTotal(cantidadCamisas1);
        assertEquals(420, costoTotal1, "El precio por estas camisas deberia de ser 420 ya con su descuento");
        
		int[] cantidadCamisas2 = {1, 1, 2};
        double costoTotal2 = TiendaCamisas.calcularCostoTotal(cantidadCamisas2);
        assertEquals(988, costoTotal2, "El precio por estas camisas deberia de ser 988 ya con su descuento");
		
		int[] cantidadCamisas3 = {2, 3, 4};
        double costoTotal3 = TiendaCamisas.calcularCostoTotal(cantidadCamisas3);
        assertEquals(2125.2, costoTotal3, "El precio por estas camisas deberia de ser 2125.2 ya con su descuento");

		int[] cantidadCamisas4 = {5, 5, 5};
        double costoTotal4 = TiendaCamisas.calcularCostoTotal(cantidadCamisas4);
        assertEquals(3358, costoTotal4, "El precio por estas camisas deberia de ser 3358 ya con su descuento");

	}
	
	@Disabled
	@Test
	void testMain() {
		fail("Not yet implemented");
	}

}
