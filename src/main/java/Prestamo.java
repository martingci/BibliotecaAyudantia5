public class Prestamo {
	public String fechaPrestamo;
	public String fechaDevolucion;
	public Libro libro;
	public Usuario usuario;
	public Multa multa;

	public String getFechaPrestamo() {
		return this.fechaPrestamo;
	}

	public void setFechaPrestamo(String fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public String getFechaDevolucion() {
		return this.fechaDevolucion;
	}

	public void registrarFechaDevolucion(String fechaDevolucion) {
		throw new UnsupportedOperationException();
	}

	public Libro getlibro() {
		throw new UnsupportedOperationException();
	}

	public void setlibro(Libro libro) {
		throw new UnsupportedOperationException();
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Prestamo(String fechaPrestamo, String fechaDevolucion, Libro libro, Usuario usuario) {
		throw new UnsupportedOperationException();
	}
}