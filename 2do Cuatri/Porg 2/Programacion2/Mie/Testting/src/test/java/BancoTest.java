package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class BancoTest {

    private Banco banco;

    @BeforeEach
    void setUp() {
        banco = new Banco();
    }

    @Test
    void testAgregarCuentaConSaldoInicial() {
        banco.agregarCuenta("123", 1000.0);
        assertEquals(1000.0, banco.consultarSaldo("123"));
    }

    @Test
    void testConsultarSaldoCuentaExistente() {
        banco.agregarCuenta("456", 500.0);
        assertEquals(500.0, banco.consultarSaldo("456"));
    }

    @Test
    void testConsultarSaldoCuentaInexistenteLanzaExcepcion() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> banco.consultarSaldo("999"));
        assertTrue(e.getMessage().contains("La cuenta no existe"));
    }

    @Test
    void testDepositarEnCuentaExistente() {
        banco.agregarCuenta("111", 200.0);
        banco.depositar("111", 50.0);
        assertEquals(250.0, banco.consultarSaldo("111"));
    }

    @Test
    void testDepositarMontoNegativoLanzaExcepcion() {
        banco.agregarCuenta("222", 300.0);
        Exception e = assertThrows(IllegalArgumentException.class, () -> banco.depositar("222", -10));
        assertEquals("El monto no puede ser negativo.", e.getMessage());
    }

    @Test
    void testDepositarEnCuentaInexistenteLanzaExcepcion() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> banco.depositar("000", 100));
        assertTrue(e.getMessage().contains("La cuenta no existe"));
    }

    @Test
    void testRetirarDeCuentaExistente() {
        banco.agregarCuenta("333", 500.0);
        banco.retirar("333", 200.0);
        assertEquals(300.0, banco.consultarSaldo("333"));
    }

    @Test
    void testRetiroMontoNegativoLanzaExcepcion() {
        banco.agregarCuenta("444", 600.0);
        Exception e = assertThrows(IllegalArgumentException.class, () -> banco.retirar("444", -20));
        assertEquals("El monto no puede ser negativo.", e.getMessage());
    }

    @Test
    void testRetiroSaldoInsuficienteLanzaExcepcion() {
        banco.agregarCuenta("555", 50.0);
        Exception e = assertThrows(IllegalArgumentException.class, () -> banco.retirar("555", 100));
        assertEquals("Saldo insuficiente.", e.getMessage());
    }

    @Test
    void testRetiroEnCuentaInexistenteLanzaExcepcion() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> banco.retirar("000", 10));
        assertTrue(e.getMessage().contains("La cuenta no existe"));
    }
}
