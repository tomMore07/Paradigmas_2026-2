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
		
		
		
		
	}
	public void vender(int cantidad) {
		
	}
	public void aplicarDescuentos(double porcentaje) {
		
	}
	
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
	}
  
}
