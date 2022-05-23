public class Escritorios extends Muebles{
    private double altura;
    private double ancho;

    public Escritorios(int stock, String nombre, double precio, double altura, double ancho) {
        super(stock, nombre, precio);
        this.altura = altura;
        this.ancho = ancho;
    }

    public double getAltura() {return altura;}

    public void setAltura(double altura) {this.altura = altura;}

    public double getAncho() {return ancho;}

    public void setAncho(double ancho) {this.ancho = ancho;}

    @Override
    public String toString() {
        return "Escritorios{" +
                "altura=" + altura +
                ", ancho=" + ancho +
                ", stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
