public class Multa {
	public int monto;
	public String fechaGeneracion;
	public boolean estado;
	public Prestamo prestamo;
	public Usuario usuario;

	public int getMonto() {
		return this.monto;
	}

	public void setMonto(int multa) {
		this.monto = multa;
	}

	public String getFechaGeneracion() {
		return this.fechaGeneracion;
	}

	public void setFechaGeneracion(String fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}

	public boolean getEstado() {
		return this.estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public void pagarMulta() {
		throw new UnsupportedOperationException();
	}

	public Multa(int monto, String fechaGeneracion, boolean estado) {
		throw new UnsupportedOperationException();
	}
}