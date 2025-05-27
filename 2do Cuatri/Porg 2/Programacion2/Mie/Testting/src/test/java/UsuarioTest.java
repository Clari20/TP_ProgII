package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

        private Usuario usuario;

        @BeforeAll
        static void setupAll() {
            System.out.println("Iniciando pruebas...");
        }

        @AfterAll
        static void tearDownAll() {
            System.out.println("Finalizando pruebas...");
        }

        @BeforeEach
        void setUp() {
            usuario = new Usuario("Juan", "hola@gmail.com", 30);
        }

        @AfterEach
        void tearDown() {
            usuario = null;
        }

        @Test
        void testNombreAsignacionYObtencion() {
            usuario.setNombre("Carlos");
            assertEquals("Carlos", usuario.getNombre());
        }

        @Test
        void testEdadAsignacionYObtencion() {
            usuario.setEdad(25);
            assertEquals(25, usuario.getEdad());
        }

        @Test
        void testEdadNegativaLanzaExcepcion() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                usuario.setEdad(-1);
            });
            assertEquals("La edad no puede ser negativa", exception.getMessage());
        }
    }


