public class Literatura {
    public static void main(String[] args) {
        System.out.printf("Datos de libros recomendados");
        //Como no vamos a ingresar datos no requerimos del metodo Scanner
        System.out.println("");

        //Instancias

        CaracLiteratura Libro1 = new CaracLiteratura(
                "El juego de Ender",
                2012,
                "Ciencia ficción",
                "Desconocido",
                215,
                "Si");
        CaracLiteratura Libro2 = new CaracLiteratura(
                "Juegos del hambre",
                2015,
                "Ciencia ficcion",
                "Desconocido",
                400,
                "Si");
        CaracLiteratura Libro3 = new CaracLiteratura(
                "Hasta el ultimo hombre",
                2012,
                "Bibliografica",
                "desconocid",
                120,
                "Si");
        CaracLiteratura Libro4 = new CaracLiteratura(
                "Mil leguas de viaje submarino",
                1996,
                "Ciecia Ficción",
                "Desconocido",
                320,
                "No");
        CaracLiteratura Libro5 = new CaracLiteratura(
                "Alicia en el pais de las Maravillas",
                2005,
                "Fantasía",
                "Desconocido",
                300,
                "Si");

        //imprimir los datos

        Libro1.imprimir_DatosLibros();
        Libro2.imprimir_DatosLibros();
        Libro3.imprimir_DatosLibros();
        Libro4.imprimir_DatosLibros();
        Libro5.imprimir_DatosLibros();
    }
}