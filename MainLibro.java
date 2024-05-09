public class MainLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro(); // Crear un objeto Libro.
        libro1.cargarLibro(); // Llamar al método cargarLibro para que el usuario ingrese los detalles del libro.
        System.out.println("---Detalles del libro---");
        libro1.informarDetalles(); // Imprimir los detalles del libro.
    }
}
