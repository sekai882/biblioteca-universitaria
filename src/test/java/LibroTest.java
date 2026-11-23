import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LibroTest {

    @Test
    void deberiaCrearLibroDisponible() {
        Libro libro = new Libro("1984", "George Orwell");

        assertEquals("1984", libro.getTitulo());
        assertEquals("George Orwell", libro.getAutor());
        assertTrue(libro.estaDisponible());
    }

    @Test
    void deberiaPrestarLibroDisponible() {
        Libro libro = new Libro("1984", "George Orwell");

        libro.prestar();

        assertFalse(libro.estaDisponible());
    }

    @Test
    void deberiaLanzarErrorAlPrestarLibroNoDisponible() {
        Libro libro = new Libro("1984", "George Orwell");

        libro.prestar();

        assertThrows(
            IllegalStateException.class,
            libro::prestar
        );
    }

    @Test
    void deberiaDevolverLibroPrestado() {
        Libro libro = new Libro("1984", "George Orwell");

        libro.prestar();
        libro.devolver();

        assertTrue(libro.estaDisponible());
    }

    @Test
    void deberiaCompararTitulosPorContenido() {
        Libro libro = new Libro("1984", "George Orwell");

        String otroTitulo = new String("1984");

        assertTrue(libro.esMismoTitulo(otroTitulo));
    }

    @Test
    void deberiaRetornarFalseCuandoTitulosSonDiferentes() {
        Libro libro = new Libro("1984", "George Orwell");

        assertFalse(libro.esMismoTitulo("Rebelión en la granja"));
    }

    @Test
    void deberiaRetornarFalseCuandoOtroTituloEsNull() {
        Libro libro = new Libro("1984", "George Orwell");

        assertFalse(libro.esMismoTitulo(null));
    }
}
