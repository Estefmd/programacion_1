package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.model.Libro;
public class Main {

    public static void main(String[] args) {
        crearLibros();
    }
    private static void crearLibros(){

        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        Libro libro3 = new Libro();
        Libro libro4 = new Libro();
        Libro libro5 = new Libro();

        libro1.setTitulo(" Calculo integral");
        libro1.setGenero("Estudio");
        libro1.setAutor("Viviana Franco");
        libro1.setCapitulos(10);
        libro1.setAnioPublicacion(2012);
        libro1.setEditorial("Santana");
        libro1.setNumeroPaginas(760);

        libro2.setTitulo(" Cenicienta");
        libro2.setGenero("Narrativo");
        libro2.setAutor("Charles Perrault");
        libro2.setCapitulos(1);
        libro2.setAnioPublicacion(1900);
        libro2.setEditorial("Luarna");
        libro2.setNumeroPaginas(240);

        libro3.setTitulo(" Padre rico Padre pobre");
        libro3.setGenero("Narrativo");
        libro3.setAutor("Robert T Kiyosaki");
        libro3.setCapitulos(9);
        libro3.setAnioPublicacion(2019);
        libro3.setEditorial("Epublibre");
        libro3.setNumeroPaginas(678);

        libro4.setTitulo(" It");
        libro4.setGenero("Terror");
        libro4.setAutor("Stephen King");
        libro4.setCapitulos(11);
        libro4.setAnioPublicacion(1986);
        libro4.setEditorial("Signet books");
        libro4.setNumeroPaginas(1504);

        libro5.setTitulo(" Cuentos de Edgar Allan Poe");
        libro5.setGenero("Ficcion y Literatura");
        libro5.setAutor("Edgar Allan Poe");
        libro5.setCapitulos(4);
        libro5.setAnioPublicacion(2019);
        libro5.setEditorial("Austral cuentos");
        libro5.setNumeroPaginas(192);

        //Obtener la cantidad de libros donde el libro empiece por una vocal y consonante

        int contarVocal = 0;
        int contarConsonante = 0;

        if(esVocal(libro1.getTitulo().charAt(0))) {
            contarVocal = contarVocal + 1;
        }else{
            contarConsonante = contarConsonante +1;
        }
        if(esVocal(libro2.getTitulo().charAt(0))) {
            contarVocal = contarVocal + 1;
        }else{
            contarConsonante = contarConsonante +1;
        }
        if(esVocal(libro3.getTitulo().charAt(0))) {
            contarVocal = contarVocal + 1;
        }else{
            contarConsonante = contarConsonante +1;
        }
        if(esVocal(libro4.getTitulo().charAt(0))) {
            contarVocal = contarVocal + 1;
        }else{
            contarConsonante = contarConsonante +1;
        }
        if(esVocal(libro5.getTitulo().charAt(0))) {
            contarVocal = contarVocal + 1;
        }else{
            contarConsonante = contarConsonante +1;
        }
        System.out.println("Los Libros que empiezan con vocales son: " + contarVocal +
                " y Los Libros que empiezan con consonantes son: " +contarConsonante) ;

        //Obtener la cantidad de Libros con el genero Terror

        String genero = "Terror";
        int cantidadGenero = 0;

        if(libro1.getGenero().equalsIgnoreCase(genero)){
            cantidadGenero = cantidadGenero+1;
        }
        if(libro2.getGenero().equalsIgnoreCase(genero)){
            cantidadGenero = cantidadGenero+1;
        }
        if(libro3.getGenero().equalsIgnoreCase(genero)){
            cantidadGenero = cantidadGenero+1;
        }
        if(libro4.getGenero().equalsIgnoreCase(genero)){
            cantidadGenero = cantidadGenero+1;
        }
        if(libro5.getGenero().equalsIgnoreCase(genero)){
            cantidadGenero = cantidadGenero+1;
        }
        System.out.println("Hay " +  cantidadGenero  + " Libro del genero: " +genero);

        //Libros que tengan paginas mayores a 120

        int numeroPaginas = 120;
        int cantidadLibros = 0;

        if(libro1.getNumeroPaginas() > numeroPaginas){
           cantidadLibros = cantidadLibros +1;
        }
        if(libro2.getNumeroPaginas() > numeroPaginas){
            cantidadLibros = cantidadLibros +1;
        }
        if(libro3.getNumeroPaginas() > numeroPaginas){
            cantidadLibros = cantidadLibros +1;
        }
        if(libro4.getNumeroPaginas() > numeroPaginas){
            cantidadLibros = cantidadLibros +1;
        }
        if(libro5.getNumeroPaginas() > numeroPaginas){
            cantidadLibros = cantidadLibros +1;
        }

        //Modificar nombre de Libro Calculo integral por Calculo integral y Diferencial

        System.out.println("Nombre del libro 1" + libro1.getTitulo());
        System.out.println("Nombre del libro 2" + libro2.getTitulo());
        System.out.println("Nombre del libro 3" + libro3.getTitulo());
        System.out.println("Nombre del libro 4" + libro4.getTitulo());
        System.out.println("Nombre del libro 5" + libro5.getTitulo());

        libro1.setTitulo("Calculo Integral y Diferencial");

        System.out.println("Nuevo nombre del libro 1: " +libro1.getTitulo());

    }

    public static boolean esVocal(char vocal){
        boolean vocales = false;
                vocal = Character.toLowerCase(vocal);

                if(vocal=='a' || vocal=='e' || vocal=='i' || vocal=='o' || vocal=='u'){

                    vocales = true;
                }
                return vocales;

    }

}
