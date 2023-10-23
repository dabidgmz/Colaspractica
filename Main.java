import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            CircularCola cola = new CircularCola(10);

            buclePrincipal: // Etiqueta para el bucle
            while (true) {
                System.out.println("Menú:");
                System.out.println("1. Inicializar / Borrar Cola");
                System.out.println("2. Mostrar Cola");
                System.out.println("3. Insertar");
                System.out.println("4. Eliminar");
                System.out.println("5. Créditos");
                System.out.println("6. Salir");
                System.out.print("Elija una opción: ");
                int opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        cola.inicializarCola();
                        System.out.println("Cola inicializada/borrada.");
                        break;
                    case 2:
                        System.out.print("Contenido de la cola: ");
                        cola.mostrarCola();
                        break;
                    case 3:
                        System.out.print("Ingrese un número: ");
                        int num = scanner.nextInt();
                        System.out.print("Insertar en el inicio (1) o al final (2): ");
                        int insertChoice = scanner.nextInt();
                        boolean insertarAlinicio = (insertChoice == 1);
                        cola.insertarElemento(num, insertarAlinicio);
                        System.out.println("Elemento insertado en la cola.");
                        break;
                    case 4:
                        System.out.print("Eliminar desde el inicio (1) o desde el final (2): ");
                        int deleteChoice = scanner.nextInt();
                        boolean eliminarDelinicio = (deleteChoice == 1);
                        cola.eliminarElemento(eliminarDelinicio);
                        System.out.println("Elemento eliminado de la cola.");
                        break;
                    case 5:
                        System.out.println("Créditos:");
                        System.out.println("4C");
                        System.out.println("Integrantes del equipo:");
                        System.out.println("David Gomez Herrera - 22170035");
                        System.out.println("Maria de Los Angeles Rivera Villegas - [Matrícula 2]");
                        break;
                    case 6:
                        System.out.println("Saliendo......");
                        break buclePrincipal; // Salir del bucle principal
                    default:
                        System.out.println("Opción no válida. Inténtelo de nuevo.");
                        break;
                }
            }
        }
    }
}
