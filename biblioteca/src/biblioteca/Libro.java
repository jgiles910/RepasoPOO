package biblioteca;

public class Libro {

	private String titulo;
	private String autor;
	private String isbn;
	private int paginas;
	private boolean prestado;
	
	public Libro() {
		
	}
	
	public Libro(String titulo, String autor, String isbn, int paginas, boolean prestado) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.paginas = paginas;
		this.prestado = prestado;
	}
	
	public Libro(String titulo, String autor, String isbn, int paginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.paginas = paginas;
		this.prestado = false;
	}

	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	public void prestar(boolean prestado) {
		
		prestado = true;
		
	}
	
	public void devolver(boolean prestado) {
		
		prestado = false;
		
	}

	@Override
	public String toString() {
		return "Libro Titulo:" + titulo + ", Autor:" + autor + ", ISBN:" + isbn + ", Paginas:" + paginas
				+ ", Prestado:" + prestado;
	}
	
	
}
