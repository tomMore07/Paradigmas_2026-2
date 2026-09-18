package Punto3;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private int anoPublicacion;
	private boolean disponible;
	private String prestadoA;
	
	public Libro(String isbn, String titulo, String autor, int anoPublicacion) {
	    super();
	    this.isbn = isbn;
	    this.titulo = titulo;
	    this.autor = autor;
	    this.anoPublicacion = anoPublicacion; // Asegúrate que el atributo de arriba también use 'anioPublicacion'
	    this.disponible = true;
	    this.prestadoA = null;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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

	public int getAnoPublicacion() {
		return anoPublicacion;
	}

	public void setAnoPublicacion(int añoPublicacion) {
		this.anoPublicacion = añoPublicacion;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getPrestadoA() {
		return prestadoA;
	}

	public void setPrestadoA(String prestadoA) {
		this.prestadoA = prestadoA;
	}
	
	
	//METODOS
	public void prestar(String nombrePersona) {
	    if (this.disponible) {
	        this.disponible = false;
	        this.prestadoA = nombrePersona;
	        System.out.println("El libro '" + this.titulo + "' ha sido prestado exitosamente a: " + nombrePersona);
	    } else {
	        System.out.println("Error: El libro '" + this.titulo + "' ya se encuentra prestado a " + this.prestadoA + ".");
	    }
	}
	
	public void devolver() {
	    if (!this.disponible) {
	        this.disponible = true;
	        System.out.println("El libro '" + this.titulo + "' ha sido devuelto y ahora está disponible.");
	        this.prestadoA = null; // Limpiamos el nombre de quien lo tenía
	    } else {
	        System.out.println("Error: El libro '" + this.titulo + "' ya se encontraba disponible.");
	    }
	}
	
	public void mostrarEstado() {
	    System.out.println("--- Estado del Libro ---");
	    System.out.println("ISBN: " + this.isbn);
	    System.out.println("Título: " + this.titulo);
	    System.out.println("Autor: " + this.autor);
	    System.out.println("Año de Publicación: " + this.anoPublicacion);
	    System.out.println("Disponible: " + (this.disponible ? "Sí" : "No"));
	    if (!this.disponible) {
	        System.out.println("Prestado a: " + this.prestadoA);
	    }
	}
	
	
}
