package PkgListaPuntos;


public class ClsLista {
    // Cabeza , head
    public Nodo primero;

    public ClsLista() {
        primero = null;
    }

    // Funcion para obtener numeros
    // private int leerEntero() {
    //     System.out.println("Ingrese valor, -1 para terminar");
    //     return Integer.parseInt(new Scanner(System.in).nextLine());

    // }

    // public ClsLista crearLista() {
    //     int x;
    //     primero = null;

    //     do {
    //         x = leerEntero();
    //         if (x != -1) {
    //             primero = new Nodo(x, primero);
    //         }
    //     } while (x != -1);

    //     return this;
    // }


    ////////CLASE 8

    public ClsLista insertarCabezaLista(String carnet, String nombre, int promedio) {
        Nodo nuevo;
        nuevo = new Nodo(carnet, nombre, promedio);
        nuevo.enlace = primero; //ENLAZA NUEVIO NODO AL FRENTE DE LA LISTA (LO APUNTA)
        primero = nuevo; //MUEVE PRIMERO Y APUNTA AL NODO NUEVO.
        return this; //RETORNA LA REFERENCIA DEL OBJETO LISTA

    }

    public void visualizar() {
        Nodo n;
        int k = 0;
        n = primero;
        while (n != null) {
            System.out.println(" " + n.carnet + " " + n.nombre + " " + n.promedio);
            n = n.enlace;
            k++;
            System.out.print((k % 15 != 0 ? " " : "\n"));
        }
    }

    // public ClsLista insertarUltimo(Nodo ultimo, int entrada) {
    //     ultimo.enlace = new Nodo(entrada);
    //     ultimo = ultimo.enlace;
    //     return this;
    // }

    public Nodo buscarLista(String destino) {
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace) {
            if (destino == indice.carnet) {//valorBuscar.equals(indice.dato)
                return indice;
            }
        }
        return null;
    }

    //INSERTAR EN LA LISTA
    public ClsLista insertarLista(String busqueda, String carnet, String nombre, int promedio) {
        Nodo nuevo, anterior;
        anterior = buscarLista(busqueda);
        if (anterior != null) {
            nuevo = new Nodo(carnet, nombre, promedio);
            nuevo.enlace = anterior.enlace;
            anterior.enlace = nuevo;
        }
        return this;
    }

    //BUSCAR POR POSICION
    // public Nodo buscarPosicion(int posicion) {
    //     Nodo indice;
    //     int i;
    //     if (posicion < 0) {
    //         return null;
    //     }
    //     indice = primero;
    //     for (i = 1; (i < posicion) && (indice != null); i++) {
    //         indice = indice.enlace;
    //     }
    //     return indice;
    // }

    public void eliminar(String entrada) {
        Nodo actual, anterior;
        boolean encontrado;
        //INICIALIZAR LOS APUNTADORES
        actual = primero;
        anterior = null;
        encontrado = false;
        //BUSCAR NODO
        while ((actual != null) && (!encontrado)) {
            encontrado = (actual.carnet == entrada); //EQUALS
            if (!encontrado) {
                anterior = actual;
                actual = actual.enlace;
            }
        }
        //ENLAZAR DEL NODO ANTERIOR CON EL SIGUIENTE NODO
        if (actual != null) {
            //DISTINGUE QUE EL NODO NO SEA LA CABEZA
            if (actual == primero) {
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
            actual = null;
        }
    }
}
    


