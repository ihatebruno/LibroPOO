public class Libro {
    private String editorial;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    
    // Constructor que inicializa todas las propiedades del libro.
    public Libro(String editorial, String titulo, String autor, int numeroPaginas) {
        this.editorial = editorial;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    // Constructor vacío.
    public Libro() {
    }

    // Método para cargar los detalles del libro desde la entrada del usuario.
    public void cargarLibro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la editorial del libro:");
        editorial = sc.nextLine();
        System.out.println("Ingresa el título del libro:");
        titulo = sc.nextLine();
        System.out.println("Ingresa el autor del libro:");
        autor = sc.nextLine();
        System.out.println("Ingresa el número de páginas del libro:");
        numeroPaginas = sc.nextInt();
    }
    
    // Método para imprimir los detalles del libro.
    public void informarDetalles() {
        System.out.println("Editorial: " + editorial);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}
