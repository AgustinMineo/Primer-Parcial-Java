
public class Impresora extends productosInformaticos implements OfertasDisponibles{
    private int impresiones;

    public Impresora(int stock, String nombre, double precio, String fabricante, int impresiones) {
        super(stock, nombre, precio, fabricante);
        this.impresiones = impresiones;
    }

    public int getImpresiones() {return impresiones;}

    public void setImpresiones(int impresiones) {this.impresiones = impresiones;}


    @Override
    public String toString() {
        return "Impresora{" +
                "impresiones=" + impresiones +
                ", stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public double ofertasDisponibles(double descuento) {
        double nuevoPrecio = getPrecio()-(getPrecio()*descuento/100);
        return nuevoPrecio;
    }
}
