import java.util.ArrayList;
import java.util.List;

public class Oficina{
    private Escritorios escritorios;
    private Sillas sillas;
    private Notebook notebook;
    private Impresora impresora;

    private List<Productos> productos = new ArrayList<Productos>();

    public Oficina() {
    }

    public Escritorios getEscritorios() {return escritorios;}

    public void setEscritorios(Escritorios escritorios) {this.escritorios = escritorios;}

    public Sillas getSillas() {return sillas;}

    public void setSillas(Sillas sillas) {this.sillas = sillas;}

    public Notebook getNotebook() {return notebook;}

    public void setNotebook(Notebook notebook) {this.notebook = notebook;}

    public Impresora getImpresora() {return impresora;}

    public void setImpresora(Impresora impresora) {this.impresora = impresora;}

    public List<Productos> getProductos() {return productos;}

    public void setProductos(List<Productos> productos) {this.productos = productos;}


    public void agregarProducto(Productos product){
        productos.add(product);
    }

    public void mostrarLista(){
        for (Productos Oficina :productos) {
            if(Oficina instanceof Notebook){
                System.out.println("Instancia de Notebook");
                System.out.println(Oficina.toString());
            }else if (Oficina instanceof Sillas){
                System.out.println("Instancia de Silla");
                System.out.println(Oficina.toString());
            }else if (Oficina instanceof Escritorios){
                System.out.println("Instancia de Escritorio");
                System.out.println(Oficina.toString());
            }else {
                System.out.println("Instancia de Impresora");
                System.out.println(Oficina.toString());
            }
        }
    }

    public void actualizarPrecioListadeProductos(){
        for (Productos Oficina: productos) {
            if(Oficina instanceof Notebook){
                System.out.println("El Precio de la " + Oficina.getNombre() + " antes de actualizar : " + Oficina.getPrecio());
                Oficina.setPrecio((Oficina.getPrecio() + Oficina.getPrecio() * 20/100));
                System.out.println("El Precio de la " + Oficina.getNombre() + " antes de actualizar : " + Oficina.getPrecio());
            } else if (Oficina instanceof Impresora){
                System.out.println("El Precio de la " + Oficina.getNombre() + "antes de actualizar : " + Oficina.getPrecio());
                Oficina.setPrecio((Oficina.getPrecio() + Oficina.getPrecio() * 15/100));
                System.out.println("El Precio de la " + Oficina.getNombre() + " antes de actualizar : " + Oficina.getPrecio());
            }else if (Oficina instanceof Sillas){
                System.out.println("El Precio de la " + Oficina.getNombre() + " antes de actualizar : " + Oficina.getPrecio());
                Oficina.setPrecio((Oficina.getPrecio() + Oficina.getPrecio() * 5/100));
                System.out.println("El Precio de la " + Oficina.getNombre() + " antes de actualizar : " + Oficina.getPrecio());
            }else{
                System.out.println("El Precio de la " + Oficina.getNombre() + " antes de actualizar : " + Oficina.getPrecio());
                Oficina.setPrecio((Oficina.getPrecio() + Oficina.getPrecio() * 10/100));
                System.out.println("El Precio de la " + Oficina.getNombre() + " antes de actualizar : " + Oficina.getPrecio());
            }
        }
    }

    public void ofertasActuales(double descuento){
        for (Productos Oficina : productos) {
            if(Oficina instanceof Sillas){
                System.out.println("El precio de la " +Oficina.getNombre() + " con el descuento es de : " + ((Sillas) Oficina).ofertasDisponibles(descuento));
            } else if (Oficina instanceof Impresora){
                System.out.println("El precio de la " +Oficina.getNombre() + " con el descuento es de : " + ((Impresora) Oficina).ofertasDisponibles(descuento));
            }
        }
    }


}
