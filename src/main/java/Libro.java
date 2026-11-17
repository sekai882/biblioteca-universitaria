public class Libro {

    private String titulo;
    private String autor;
    private boolean disponible = true;

    // Problema 1: campo privado nunca utilizado.
    private String codigoInterno = "SIN-CODIGO";

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void prestar() {
        // Problema 2: salida directa por consola.
        System.out.println("Prestando libro: " + titulo);

        if (!disponible) {
            throw new IllegalStateException(
                "Libro no disponible"
            );
        }

        disponible = false;
    }

    public void devolver() {
        disponible = true;

        // Problema 3: manejo incorrecto de excepción.
        try {
            Integer.parseInt("ABC");
        } catch (NumberFormatException e) {
            // Bloque vacío intencional.
        }
    }

    public boolean esMismoTitulo(String otroTitulo) {
        // Problema 4: comparación de referencias.
        return titulo == otroTitulo;
    }

    // Problema 5: método privado nunca utilizado.
    private void registrarAuditoriaInterna() {
    }
}