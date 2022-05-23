public abstract class Muebles extends Productos{

    public Muebles(int stock, String nombre, double precio) {
        super(stock, nombre, precio);
    }

    @Override
    public String toString() {
        return "Muebles{" +
                "stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
