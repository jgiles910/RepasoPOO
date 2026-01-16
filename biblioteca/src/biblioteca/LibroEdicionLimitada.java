package biblioteca;

public final class LibroEdicionLimitada extends Libro {

	private int numeroEdicion;
	private int ejemplares;
	
	public LibroEdicionLimitada() {
		
	}

	public LibroEdicionLimitada(String titulo, String autor, String isbn, int paginas, int numeroEdicion, int ejemplares) {
		super(titulo, autor, isbn, paginas);
		this.numeroEdicion = numeroEdicion;
		this.ejemplares = ejemplares;
	}

	public int getNumeroEdicion() {
		return numeroEdicion;
	}
	public void setNumeroEdicion(int numeroEdicion) {
		this.numeroEdicion = numeroEdicion;
	}
	public int getEjemplares() {
		return ejemplares;
	}
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	
	private void cambiarNumeroEdicion(int nuevoNumero) {
		
		this.numeroEdicion = nuevoNumero;
		
	}
	
	
	@Override
	public String toString() {
		
		return "Libro Edicion Limitada | Titulo: " + getTitulo() + ", Autor:" + getAutor() + ", ISBN:" + getIsbn() + ", Paginas:" + getPaginas() + ", Prestado:" + isPrestado() + " Ejemplares: " + ejemplares + "Numero de edicion: " + numeroEdicion;
	}
	
	
}
