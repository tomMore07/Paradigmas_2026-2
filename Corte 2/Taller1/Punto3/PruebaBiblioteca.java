package Punto3;

public class PruebaBiblioteca {
    public static void main(String[] args) {
        // 1. Crear al menos 3 libros diferentes
        System.out.println("--- 1. Creando libros ---");
        Libro libro1 = new Libro("978-0134685991", "Effective Java", "Joshua Bloch", 2018);
        Libro libro2 = new Libro("978-0596009205", "Head First Design Patterns", "Eric Freeman", 2004);
        Libro libro3 = new Libro("978-0132350884", "Clean Code", "Robert C. Martin", 2008);
        System.out.println("¡Libros registrados correctamente en el sistema!\n");

        // 2. Prestar 2 libros a diferentes personas
        System.out.println("--- 2. Prestando libros a diferentes personas ---");
        libro1.prestar("Carlos Pérez");
        libro2.prestar("Ana Gómez");
        System.out.println();

        // 3. Intentar prestar un libro ya prestado (debe mostrar error)
        System.out.println("--- 3. Intentando prestar un libro ya ocupado ---");
        libro1.prestar("María Rodríguez"); // Este ya lo tiene Carlos, debe dar error
        System.out.println();

        // 4. Devolver 1 libro
        System.out.println("--- 4. Devolviendo un libro ---");
        libro1.devolver(); // Carlos devuelve el libro 1
        System.out.println();

        // 5. Mostrar el estado final de todos los libros
        System.out.println("--- 5. Estado final de todos los libros ---");
        libro1.mostrarEstado();
        System.out.println();
        libro2.mostrarEstado();
        System.out.println();
        libro3.mostrarEstado();

    }
}
