import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el título del libro: ");
        String titulo = scanner.nextLine();

        System.out.print("Introduce el autor del libro: ");
        String autor = scanner.nextLine();

        System.out.print("Introduce el año de publicación del libro: ");
        int anioPublicacion = scanner.nextInt();
        scanner.nextLine();

        Libro libro = new Libro(titulo, autor, anioPublicacion);

        int opcion;

        do {
            System.out.println("\n--- Gestión del Libro ---");
            System.out.println("1. Mostrar información del libro");
            System.out.println("2. Prestar o devolver libro");
            System.out.println("3. Actualizar información del libro");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    libro.mostrarInformacion();
                    break;
                case 2:
                    libro.cambiarEstado();
                    System.out.println("El estado del libro ha sido actualizado.");
                    break;
                case 3:
                    System.out.print("Introduce el nuevo título del libro (deja en blanco para no cambiar): ");
                    String nuevoTitulo = scanner.nextLine();
                    if (!nuevoTitulo.isBlank()) {
                        libro.setTitulo(nuevoTitulo);
                    }

                    System.out.print("Introduce el nuevo autor del libro (deja en blanco para no cambiar): ");
                    String nuevoAutor = scanner.nextLine();
                    if (!nuevoAutor.isBlank()) {
                        libro.setAutor(nuevoAutor);
                    }

                    System.out.print("Introduce el nuevo año de publicación (0 para no cambiar): ");
                    int nuevoAnio = scanner.nextInt();
                    if (nuevoAnio != 0) {
                        libro.setAnioPublicacion(nuevoAnio);
                    }

                    System.out.println("La información del libro ha sido actualizada.");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 4);

        scanner.close();

        }

    }
