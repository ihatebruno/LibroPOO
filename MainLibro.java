public class MainLibro {
    public static void main(String[] args) {
    Libro libro1 = new Libro();
    libro1.cargarLibro();
    System.out.println("---Detalles del libro---");
    libro1.informarDetalles();
}
}