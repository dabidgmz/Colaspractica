class CircularCola {
    private int tamañoMáximo;
    private int[] cola;
    private int frente = -1;
    private int trasera = -1;

    public CircularCola(int tamañoMáximo) {
        this.tamañoMáximo = tamañoMáximo;
        cola = new int[tamañoMáximo];
        frente = -1;
        trasera = -1;
    }

    public void inicializarCola() {
        frente = -1;
        trasera = -1;
    }

    public void mostrarCola() {
        if (estáVacia()) {
            System.out.println("Cola Vacía");
            return;
        }

        int i = frente;
        do {
            System.out.print(cola[i] + " ");
            i = (i + 1) % tamañoMáximo;
        } while (i != (trasera + 1) % tamañoMáximo);
        System.out.println();
    }

    public boolean estáLlena() {
        return (frente == 0 && trasera == tamañoMáximo - 1) || (frente == trasera + 1);
    }

    public boolean estáVacia() {
        return frente == -1;
    }

    public void insertarElemento(int elemento, boolean insertarAlFrente) {
        if (estáLlena()) {
            System.out.println("La cola está llena");
            return;
        }

        if (estáVacia()) {
            frente = 0;
            trasera = 0;
        } else if (insertarAlFrente) {
            frente = (frente - 1 + tamañoMáximo) % tamañoMáximo;
        } else {
            trasera = (trasera + 1) % tamañoMáximo;
        }

        cola[insertarAlFrente ? frente : trasera] = elemento;
    }

    public void eliminarElemento(boolean eliminarDelFrente) {
        if (estáVacia()) {
            System.out.println("Cola Vacía");
            return;
        }

        if (frente == trasera) {
            inicializarCola();
        } else if (eliminarDelFrente) {
            frente = (frente + 1) % tamañoMáximo;
        } else {
            trasera = (trasera - 1 + tamañoMáximo) % tamañoMáximo;
        }
    }
}
