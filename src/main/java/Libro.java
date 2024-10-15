import java.util.ArrayList;

public class Libro {
	public String title;
	public String autor;
	public String ISBN;
	public int year;
	public ArrayList<Biblioteca> biblioteca = new ArrayList<Biblioteca>();
	public Categoria categoria;

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getISBN() {
		return this.ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Libro(String title, String autor, String ISBN, int year) {
		throw new UnsupportedOperationException();
	}
}