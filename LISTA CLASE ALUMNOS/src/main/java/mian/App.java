package mian;

import PkgListaPuntos.ClsLista;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // EjColecciones col = new EjColecciones();
        // col.EjListas();
        // col.EjArrayList();
        // col.EjSet();

        // ClsEjemplo ej = new ClsEjemplo();
        // ej.ejemplo1();

        // ClsLista list = new ClsLista();
        
        // list.crearLista();
        
        // int pausa = 0;

        ClsLista lista = new ClsLista(); //INSTACIAMOS Y CREAMOS LA LISTA VACIA
        lista.insertarCabezaLista("012", "Maria", 95); //INSERTAMOS UN NODO AL PRINCIPIO DE LA LISTA
        lista.insertarCabezaLista("023", "Pedro", 55); //INSERTAMOS UN NODO AL PRINCIPIO DE LA LISTA
        lista.insertarCabezaLista("065", "Juanaaaaaaaa", 23); //INSERTAMOS UN NODO AL PRINCIPIO DE LA LISTA
        lista.insertarCabezaLista("232", "Cristian", 83); //INSERTAMOS UN NODO AL PRINCIPIO DE LA LISTA


        System.out.println("********    IMPRESO");
        lista.visualizar();


        lista.insertarLista("065", "001", "Pablo", 77);
        System.out.println("*********    INSERTADO");
        lista.visualizar();

        
        lista.buscarLista("012");
        System.out.println("********* BUSCADO");
        lista.visualizar();


        lista.eliminar("065");
        System.out.println("********* ELIMINADO");
        lista.visualizar();


    
   



        
    }
}
