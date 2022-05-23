
public abstract class productosInformaticos extends Productos{

    private String Fabricante;

    public productosInformaticos(int stock, String nombre, double precio, String fabricante) {
        super(stock, nombre, precio);
        Fabricante = fabricante;
    }

    public String getFabricante() {return Fabricante;}

    public void setFabricante(String fabricante) {Fabricante = fabricante;}

    @Override
    public String toString() {
        return "productosInformaticos{" +
                "stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", Fabricante='" + Fabricante + '\'' +
                '}';
    }
}
