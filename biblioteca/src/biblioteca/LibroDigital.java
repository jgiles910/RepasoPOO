package biblioteca;

public class LibroDigital extends Libro {
	protected String formato;

	public LibroDigital() {
		
	}
	
	public LibroDigital(String formato, String titulo, String autor, String isbn, int paginas) {
		super(titulo, autor, isbn, paginas);
		this.formato = formato;
	}

	public LibroDigital(String formato) {
	
		this.formato = formato;
	}

	public String getFormato() {
		return formato;
	}

	//metodo para cambiar el formato
	private void cambiarFormato(String nuevoFormato) {
		
		this.formato = nuevoFormato;
		
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	@Override
	public String toString() {
		
		return "Libro Digital | Titulo: " + getTitulo() + ", Autor:" + getAutor() + ", ISBN:" + getIsbn() + ", Paginas:" + getPaginas() + ", Prestado:" + isPrestado() + " Formato: " + formato;
	}
}
