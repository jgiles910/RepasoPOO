package biblioteca;

public class Editorial {

	private String nombreEditorial;
	private String paisOrigen;
	private int anyoFundacion;
	private int cantidadLibrosPublicados;
	
	
	public Editorial() {
		
	}
	
	public Editorial(String nombreEditorial, String paisOrigen, int anyoFundacion, int cantidadLibrosPublicados) {
		super();
		this.nombreEditorial = nombreEditorial;
		this.paisOrigen = paisOrigen;
		this.anyoFundacion = anyoFundacion;
		this.cantidadLibrosPublicados = cantidadLibrosPublicados;
	}

	public String getNombreEditorial() {
		return nombreEditorial;
	}

	public void setNombreEditorial(String nombreEditorial) {
		this.nombreEditorial = nombreEditorial;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public int getAnyoFundacion() {
		return anyoFundacion;
	}

	public void setAnyoFundacion(int anyoFundacion) {
		this.anyoFundacion = anyoFundacion;
	}

	public int getCantidadLibrosPublicados() {
		return cantidadLibrosPublicados;
	}

	public void setCantidadLibrosPublicados(int cantidadLibrosPublicados) {
		this.cantidadLibrosPublicados = cantidadLibrosPublicados;
	}

	@Override
	public String toString() {
		return "Editorial - Nombre de la editorial: " + nombreEditorial + " Pais de origen: " + paisOrigen + " Año fundacion: "
				+ anyoFundacion + " Cantidad de libros publicados: " + cantidadLibrosPublicados;
	}
	
	
}
