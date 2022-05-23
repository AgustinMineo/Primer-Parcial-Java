public abstract class Productos {
    protected int stock;
    protected String nombre;
    protected double precio;

    public Productos(int stock, String nombre, double precio) {
        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getStock() {return stock;}

    public void setStock(int stock) {this.stock = stock;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public double getPrecio() {return precio;}

    public void setPrecio(double precio) {this.precio = precio;}

    @Override
    public String toString() {
        return "Productos{" +
                "stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
