import java.util.Objects;

/** Representa un libro dentro del catálogo de la biblioteca universitaria. */
public class Libro {

  private String titulo;
  private String autor;
  private boolean disponible = true;

  /**
   * Crea un nuevo libro disponible para préstamo.
   *
   * @param titulo título del libro.
   * @param autor autor del libro.
   */
  public Libro(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
  }

  /**
   * Obtiene el título del libro.
   *
   * @return el título del libro.
   */
  public String getTitulo() {
    return titulo;
  }

  /**
   * Obtiene el autor del libro.
   *
   * @return el autor del libro.
   */
  public String getAutor() {
    return autor;
  }

  /**
   * Indica si el libro está disponible para préstamo.
   *
   * @return {@code true} si está disponible; {@code false} en caso contrario.
   */
  public boolean estaDisponible() {
    return disponible;
  }

  /**
   * Registra el préstamo del libro si se encuentra disponible.
   *
   * @throws IllegalStateException si el libro no está disponible.
   */
  public void prestar() {
    if (!disponible) {
      throw new IllegalStateException("Libro no disponible");
    }

    disponible = false;
  }

  /** Marca el libro como devuelto y disponible nuevamente. */
  public void devolver() {
    disponible = true;
  }

  /**
   * Compara el título de este libro con otro título por contenido.
   *
   * @param otroTitulo título con el cual comparar.
   * @return {@code true} si ambos títulos son iguales; {@code false} en caso contrario.
   */
  public boolean esMismoTitulo(String otroTitulo) {
    return Objects.equals(this.titulo, otroTitulo);
  }
}
