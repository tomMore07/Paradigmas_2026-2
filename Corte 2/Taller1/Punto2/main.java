package paradigmas;

public class Main {
    public static void main(String[] args) {
        // 1. Creación de los productos
        Producto producto1 = new Producto("P001", "Laptop HP", 2500000);
        Producto producto2 = new Producto("P002", "Mouse Inalámbrico", 50000);

        // 2. Prueba con el primer producto (siguiendo el ejemplo de la imagen)
        System.out.println("--- PRUEBA PRODUCTO 1 ---");
        producto1.mostrarInformacion();
        System.out.println();

        producto1.agregarStock(15);
        producto1.vender(5);
        producto1.aplicarDescuento(10);
        
        System.out.println();
        producto1.mostrarInformacion();

        // 3. Prueba con el segundo producto (incluye validación de errores)
        System.out.println("\n--- PRUEBA PRODUCTO 2 ---");
        producto2.mostrarInformacion();
        System.out.println();

        producto2.agregarStock(20);
        producto2.vender(25); // Intento de venta mayor al stock disponible
        producto2.aplicarDescuento(150); // Intento de descuento inválido
        producto2.aplicarDescuento(15); // Descuento válido
    }
}
