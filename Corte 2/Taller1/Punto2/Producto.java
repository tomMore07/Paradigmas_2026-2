package paradigmas;

public class Producto {
	private String codigo;
	private String nombre;
	private double precio;
	private int stock;
	
	public Producto(String codigo, String nombre, double precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}
	
	public void agregarStock(int cantidad) {
		if (cantidad > 0) {
            this.stock += cantidad;
            System.out.println("Stock agregado. Nuevo stock: " + this.stock);
        } else {
            System.out.println("La cantidad a agregar debe ser mayor a 0.");
        }	
	}
	public void vender(int cantidad) {
		if (cantidad <= 0) {
            System.out.println("La cantidad a vender debe ser mayor a 0.");
        } else if (cantidad <= this.stock) {
            this.stock -= cantidad;
            System.out.println("Venta realizada. Stock restante: " + this.stock);
        } else {
            System.out.println("Error: No hay stock suficiente para realizar la venta.");
        }	
	}
	public void aplicarDescuentos(double porcentaje) {
		if (porcentaje >= 0 && porcentaje <= 100) {
            double descuento = this.precio * (porcentaje / 100.0);
            this.precio -= descuento;
            System.out.printf("Descuento aplicado. Nuevo precio: $%,.2f\n", this.precio);
        } else {
            System.out.println("Error: El porcentaje de descuento debe estar entre 0 y 100.");
        }
		
	}

	public void mostrarInformacion() {
        System.out.println("=== PRODUCTO ===");
        System.out.println("Código: " + this.codigo);
        System.out.println("Nombre: " + this.nombre);
        System.out.printf("Precio: $%,.0f\n", this.precio);
        System.out.println("Stock: " + this.stock + " unidades");
        System.out.println("================");
    }
	
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
	}
  
}
