public class Inicio {
    public static void main(String[] args) {

        /// Creamos las instancias de los objetos
        Sillas sillas = new Sillas(20,"Sillitas",1000,true);
        Escritorios escritorio = new Escritorios(20,"Un escritorio",1000,25,30);
        Impresora impresora = new Impresora(15,"Impresora",1000,"HP",2500);
        Notebook notebook = new Notebook(20,"Razer",1000,"HP",32);



        Oficina oficina = new Oficina();

        /// Agregamos los productos a la lista
        oficina.agregarProducto(sillas);
        oficina.agregarProducto(escritorio);
        oficina.agregarProducto(impresora);
        oficina.agregarProducto(notebook);

        /// Mostramos la lista
        oficina.mostrarLista();


        /// Actualizamos y mostramos
        oficina.actualizarPrecioListadeProductos();
        System.out.println("\n\n");


        /// Oferta de Silla y Impresora
        oficina.ofertasActuales(15);

    }
}
