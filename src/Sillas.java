public class Sillas extends Muebles implements OfertasDisponibles{
    private boolean ruedas;

    public Sillas(int stock, String nombre, double precio, boolean ruedas) {
        super(stock, nombre, precio);
        this.ruedas = ruedas;
    }

    public boolean isRuedas() {return ruedas;}

    public void setRuedas(boolean ruedas) {this.ruedas = ruedas;}

    @Override
    public double ofertasDisponibles(double descuento) {
        double nuevoPrecio = getPrecio()-(getPrecio()*descuento/100);
        return nuevoPrecio;
    }
}
