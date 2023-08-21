package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.model.Libro;
public class Main {

    public static void main(String[] args) {
        System.out.println();
    }
    private static void crearLibros(){

        String GENERO = "terror";
        int cantidadGenero = 0;

        Libro libro1 = new Libro();
        libro1.setTitulo("Calculo para principiantes");
        libro1.setGenero("Estudio");
        libro1.setAutor("Viviana Franco");
        libro1.setCapitulos(10);
        libro1.setAnioPublicacion(2012);
        libro1.setEditorial("Santana");
        libro1.setNumeroPaginas(760);

        Libro libro2 = new Libro();
        libro2.setTitulo("Cenicienta");
        libro2.setGenero("Narrativo");
        libro2.setAutor("Charles Perrault");
        libro2.setCapitulos(1);
        libro2.setAnioPublicacion(1900);
        libro2.setEditorial("Luarna");
        libro2.setNumeroPaginas(240);

        Libro libro3 = new Libro();
        libro3.setTitulo("Padre rico Padre pobre");
        libro3.setGenero("Narrativo");
        libro3.setAutor("Robert T Kiyosaki");
        libro3.setCapitulos(9);
        libro3.setAnioPublicacion(2019);
        libro3.setEditorial("Epublibre");
        libro3.setNumeroPaginas(678);

        Libro libro4 = new Libro();
        libro4.setTitulo("It");
        libro4.setGenero("Terror");
        libro4.setAutor("Stephen King");
        libro4.setCapitulos(11);
        libro4.setAnioPublicacion(1986);
        libro4.setEditorial("Signet books");
        libro4.setNumeroPaginas(1504);

        Libro libro5 = new Libro();
        libro5.setTitulo("Cuentos de Edgar Allan Poe");
        libro5.setGenero("Ficcion y Literatura");
        libro5.setAutor("Edgar Allan Poe");
        libro5.setCapitulos(4);
        libro5.setAnioPublicacion(2019);
        libro5.setEditorial("Austral cuentos");
        libro5.setNumeroPaginas(192);

    }

}