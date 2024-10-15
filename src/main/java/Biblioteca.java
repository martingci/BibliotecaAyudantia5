import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	public String nombre;
	public String direccion;
	public ArrayList<Libro> libros = new ArrayList<Libro>();
	public ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	public ArrayList<Categoria> categorias = new ArrayList<Categoria>();

	public String getNombre() {
		return this.nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean agregarLibro(String title, String autor, String ISBN, int year, Categoria categoria) {
		throw new UnsupportedOperationException();
	}

	public boolean modificarLibro(String title, String autor, String ISBN, int year, Categoria categoria) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarLibro(String ISBN) {
		throw new UnsupportedOperationException();
	}

	boolean agregarEmpleado(String nombre, String identificacion, String cargo) {
		throw new UnsupportedOperationException();
	}

	boolean modificarEmpleado(String nombre, String identificacion, String cargo) {
		throw new UnsupportedOperationException();
	}

	boolean eliminarEmpleado(String identificacion) {
		throw new UnsupportedOperationException();
	}

	public Biblioteca(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.categorias = categorias;
		this.libros = libros;
		this.empleados = empleados;
	}

	public boolean agregarCategoria(String nombre, String descripcion) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarCategoria(String nombre, String descripcion) {
		throw new UnsupportedOperationException();
	}

	public boolean editarCategoria(String nombre, String descripcion) {
		throw new UnsupportedOperationException();
	}
}