
public class Notebook extends productosInformaticos{
    private int ram;

    public Notebook(int stock, String nombre, double precio, String fabricante, int ram) {
        super(stock, nombre, precio, fabricante);
        this.ram = ram;
    }

    public int getRam() {return ram;}

    public void setRam(int ram) {this.ram = ram;}

    @Override
    public String toString() {
        return "Notebook{" +
                "ram=" + ram +
                ", stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
