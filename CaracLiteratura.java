public class CaracLiteratura {

    //Atributos
    //Se va a añadir 6 atributos para describir a los libro
    String NomLibro;
    int year;
    String Tipo;
    String Autor;
    int NumPaginas;
    String adaptada;

    //Metodos
    public String getNomLibro() {
        return NomLibro;
    }

    public void setNomLibro(String nomLibro) {
        NomLibro = nomLibro;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        NumPaginas = numPaginas;
    }

    public String getAdaptada() {
        return adaptada;
    }

    public void setAdaptada(String adaptada) {
        this.adaptada = adaptada;
    }

    //Constructores
    public CaracLiteratura(String nomLibro, int year, String tipo, String autor, int numPaginas, String adaptada) {
        NomLibro = nomLibro;
        this.year = year;
        Tipo = tipo;
        Autor = autor;
        NumPaginas = numPaginas;
        this.adaptada = adaptada;
    }

    //Funcion Imprimir
    public void imprimir_DatosLibros(){
        System.out.println("NOmbre del libro: "+ NomLibro);
        System.out.println("Año de creación: "+ year);
        System.out.println("Tipo: "+ Tipo);
        System.out.println("Autor: "+ Autor);
        System.out.println("Numero de paginas: "+ NumPaginas);
        System.out.println("Adaptada al cine: "+ adaptada);
        System.out.println("");
    }
}
