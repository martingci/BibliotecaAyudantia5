public class Empleado {
	public String nombre;
	public String identificacion;
	public String cargo;
	public Biblioteca biblioteca;

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

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Empleado(String nombre, String identificacion, String cargo) {
		throw new UnsupportedOperationException();
	}
}