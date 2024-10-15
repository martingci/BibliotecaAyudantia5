import java.util.ArrayList;

public class Usuario {
	public String nombre;
	public String identificacion;
	public ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
	public ArrayList<Multa> multas = new ArrayList<Multa>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public void registrardevolucion() {
		throw new UnsupportedOperationException();
	}

	public Usuario(String nombre, String identificacion, ArrayList<Multa> multas, ArrayList<Prestamo> prestamos) {
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.multas = multas;
		this.prestamos = prestamos;
		throw new UnsupportedOperationException();
	}

	public void pagarMulta(Multa multa) {
		throw new UnsupportedOperationException();
	}

	public void hacerPrestamo(Libro libro) {
		throw new UnsupportedOperationException();
	}
}