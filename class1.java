class CircularCola {
    private int tamañoMáximo;
    private int[] cola;
    private int inicio = -1;
    private int Finaal = -1;

    public CircularCola(int tamañoMáximo) {
        this.tamañoMáximo = tamañoMáximo;
        cola = new int[tamañoMáximo];
        inicio = -1;
        Finaal = -1;
    }

    public void inicializarCola() {
        inicio = -1;
        Finaal = -1;
    }

    public void mostrarCola() {
        if (estáVacia()) {
            System.out.println("Cola Vacía");
            return;
        }

        int i = inicio;
        do {
            System.out.print(cola[i] + " ");
            i = (i + 1) % tamañoMáximo;
        } while (i != (Finaal + 1) % tamañoMáximo);
        System.out.println();
    }

    public boolean estáLlena() {
        return (inicio == 0 && Finaal == tamañoMáximo - 1) || (inicio == Finaal + 1);
    }

    public boolean estáVacia() {
        return inicio == -1;
    }

    
public void insertarElemento(int elemento, boolean insertarAlinicio) {
    if (estáLlena()) {
        System.out.println("La cola está llena, no se puede insertar.");
        return;
    }

    if (estáVacia()) {
        inicio = 0;
        Finaal = 0;
    } else if (insertarAlinicio) {
        inicio = (inicio - 1 + tamañoMáximo) % tamañoMáximo;
    } else {
        Finaal = (Finaal + 1) % tamañoMáximo;
    }

    cola[insertarAlinicio ? inicio : Finaal] = elemento;
}


    public void eliminarElemento(boolean eliminarDelinicio) {
        if (estáVacia()) {
            System.out.println("Cola Vacía");
            return;
        }

        if (inicio == Finaal) {
            inicializarCola();
        } else if (eliminarDelinicio) {
            inicio = (inicio + 1) % tamañoMáximo;
        } else {
            Finaal = (Finaal- 1 + tamañoMáximo) % tamañoMáximo;
        }
    }
}
