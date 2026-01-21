package biblioteca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class BibliotecaAPP {
	
	static Scanner sc = new Scanner(System.in);
	static String rutaLibrosDigitales = ("C:\\Users\\1AWA-9\\Documents\\RepasoPOOProgram\\librosDigitales.txt");
	static String rutaLibrosLimitados = ("C:\\Users\\1AWA-9\\Documents\\RepasoPOOProgram\\librosEdicionLimitada.txt");
	
	String rutalibrosEdicionLimitada = ("C:\\Users\\1AWA-9\\Documents\\RepasoPOOProgram\\librosEdicionLimitada.txt");

	public static void main(String[] args) throws Exception {
	
		
		ArrayList<LibroDigital> listaDigital = new ArrayList<>();
		ArrayList<LibroEdicionLimitada> listaLimitada = new ArrayList<LibroEdicionLimitada>();
		
		
		ArrayList <Libro> libroLista = new ArrayList<>();
		
		Libro l1 = new Libro("El señor de los anillos", "Tolkien", "12sjnks", 300);
		libroLista.add(l1);
		
		Libro l2 = new Libro ("El principito", "Jonathan", "13sakdjn", 100); 
		libroLista.add(l2);
		
		Libro l3 = new Libro("Harry Potter", "JK Simmons", "14adlasd", 50); 
		libroLista.add(l3);
		
		
		visualizarMenu(libroLista, listaDigital, listaLimitada);
	}

	private static void visualizarMenu(ArrayList<Libro> libroLista, ArrayList<LibroDigital> listaDigital, ArrayList<LibroEdicionLimitada> listaLimitada) throws Exception {
		
		int input;
		
		
		do {
			
			System.out.println("\n1. Añadir un libro");
			System.out.println("2. Mostrar datos del libro");
			System.out.println("3. Editar un libro");
			System.out.println("4. Eliminar libro");
			System.out.println("5. Cargar fichero libros digitales\n"
					+ "6. Mostrar fichero libros digitales\r\n"
					+ "7. Cargar libros de edición limitada\r\n"
					+ "8. Mostrar libros de edición limitada\r\n"
					+ "9. Cambiar formato libro digital\r\n"
					+ "10. Cambiar número de edición libro de edición limitada\r\n"
					+ "11. Sobrescribir fichero libros digitales\r\n"
					+ "12. Sobrescribir libros digitales\r\n");
			input = Integer.parseInt(sc.nextLine());
					
			switch (input) {
			case 1:
				
				anyadirLibro(libroLista);
				break;
			case 2:
				
				mostrarDatos(libroLista); 
				break;
			case 3:
				editarLibro(libroLista);
				break;
			case 4:
				
				break;
			case 5:
				listaDigital = cargarLibrosDigitales(rutaLibrosDigitales);
				break;
			case 6:
				listaLimitada = cargarLibrosLimitados(rutaLibrosLimitados);
				break;
				
			case 7: 
				
			default:
				if (input > 13 || input < 0) {
					System.out.println("Error");
				} else {System.out.println("Has salido.");}
			}
		} while(input != 13);
		
		
	}


	private static ArrayList<LibroEdicionLimitada> cargarLibrosLimitados(String rutaLibrosLimitados) throws FileNotFoundException {
		
		File file = new File (rutaLibrosLimitados);
		
		Scanner scFile = new Scanner(file);
		scFile.nextLine();
		
		while (scFile.hasNext()) {
			
			String[] campos = scFile.nextLine().split(":");
			
			
		}
		
		return null;
	}

	private static void MostrarLibrosDigitales(ArrayList<LibroDigital> listaDigital) {
		
		for (int i = 0; i < listaDigital.size(); i++) {
			
			System.out.println(listaDigital.get(i).toString());
		}
		
	}

	public static void mostrarDatos(ArrayList<Libro> libroLista) {
		for(int i = 0; i < libroLista.size(); i++) {
			System.out.println(i+1+": "+libroLista.get(i).toString());
		}
	}

	public static void anyadirLibro(ArrayList<Libro> libroLista) {
		String nuevoLibro;
		System.out.println("Nombre del nuevo Libro");
		nuevoLibro = sc.nextLine();
		
		String nuevoAutor;
		System.out.println("Nombre del nuevo Autor");
		nuevoAutor = sc.nextLine();
		
		String nuevoISBN;
		System.out.println("Nombre del nuevo ISBN");
		nuevoISBN = sc.nextLine();
		
		int numeroPaginas; 
		do {
			System.out.println("Numero de paginas del libro (Min 50 y Max 500)");
			numeroPaginas = Integer.parseInt(sc.nextLine());
		} while (numeroPaginas < 50 || numeroPaginas > 500);
		
		Libro libInroducido = new Libro(nuevoLibro, nuevoAutor, nuevoISBN, numeroPaginas);
		libroLista.add(libInroducido);
	}
	
	//3.	La opción editar libro deberá permitir al usuario editar el número de páginas y el estado, validando que el número de páginas esté entre 50 y 500. 
	public static void editarLibro(ArrayList<Libro> libroLista) {
		
		String buscarLibro;
		boolean existe = false;
		int posicion = 0;
		System.out.println("Nombre del libro a buscar");
		
		
		buscarLibro = sc.nextLine();
		for (int i = 0; i < libroLista.size(); i++) {
			
			if(libroLista.get(i).getTitulo().equals(buscarLibro)) {
				
				posicion = i;
				existe = true;
				
			}
		} 
		
		int paginas = 0;
		if(existe == true) {
			System.out.println("Introduce el numero de paginas para el libro:  " + libroLista.get(posicion).getTitulo());
			paginas = Integer.parseInt(sc.nextLine()); 
			if (paginas >= 50 && paginas <= 500){
				
				libroLista.get(posicion).setPaginas(paginas);  
				System.out.println("Numero de paginas actualizado con exito. \n");
			}
			else {
				System.out.println("El numero de paginas debe de ser de al menos 50 pagina y no mas de 500.");
			}
		} else {System.out.println("El libro introducido no existe");}
	}
	
	private static ArrayList<LibroDigital> cargarLibrosDigitales(String rutaLibrosDigitales) throws Exception{
		
		ArrayList<LibroDigital> listLibroDigi = new ArrayList<LibroDigital>();
		
		File file = new File(rutaLibrosDigitales);
		
		Scanner scFile = new Scanner(file);
		
		scFile.nextLine();
		
		while (scFile.hasNext()) {
			
			String[] campos = scFile.nextLine().split(":");
			
			LibroDigital l = new LibroDigital(campos[0], campos[1], campos[2], Integer.parseInt(campos[3]), Boolean.parseBoolean(campos[4]), campos[5]);
			
			listLibroDigi.add(l);
			
			
		}
		
		scFile.close();
		
		return listLibroDigi;
		
		
		
	}
}
