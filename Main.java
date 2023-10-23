import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            CircularCola cola = new CircularCola(10);
            while (true) {
                System.out.println("Menú:");
                System.out.println("1. Inicializar / Borrar Cola");
                System.out.println("2. Mostrar Cola");
                System.out.println("3. Insertar");
                System.out.println("4. Eliminar");
                System.out.println("5. Créditos");
                System.out.println("6. Salir");
                System.out.print("Elija una opción: ");
                int choice = scanner.nextInt();
                switch (choice) {
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
                        boolean insertarAlFrente = (insertChoice == 1);
                        cola.insertarElemento(num, insertarAlFrente);
                        System.out.println("Elemento insertado en la cola.");
                        break;
                    case 4:
                        System.out.print("Eliminar desde el inicio (1) o desde el final (2): ");
                        int deleteChoice = scanner.nextInt();
                        boolean eliminarDelFrente = (deleteChoice == 1);
                        cola.eliminarElemento(eliminarDelFrente);
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
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtelo de nuevo.");
                        break;
                }
            }
        }
    }
}
