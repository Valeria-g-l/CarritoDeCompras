package java.ec.ups.CarritoCompras.Modelo;

public class Producto {
    private int Codigo;
    private String Nombre;
    private double Precio;


    public Producto(int codigo) {
        Codigo = codigo;
    }

    public Producto(String nombre) {
        Nombre = nombre;
    }

    public Producto(Double precio) {
        Precio = precio;
    }


    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "Codigo=" + Codigo +
                ", Nombre='" + Nombre + '\'' +
                ", Precio=" + Precio +
                '}';
    }
}
