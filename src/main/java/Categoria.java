import java.util.ArrayList;

public class Categoria {
	public String nombre;
	public String descripcion;
	public Biblioteca biblioteca;
	public ArrayList<Libro> libros = new ArrayList<Libro>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Categoria(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.libros = libros;
		throw new UnsupportedOperationException();
	}
}