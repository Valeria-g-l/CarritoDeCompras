package java.ec.ups.CarritoCompras.Modelo;

public class Items {
    private Producto producto;
    private int cantidadSe;

    public Items(Producto producto) {
        this.producto = producto;
    }

    public Items(int cantidadSe) {
        this.cantidadSe = cantidadSe;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadSe() {
        return cantidadSe;
    }

    public void setCantidadSe(int cantidadSe) {
        this.cantidadSe = cantidadSe;
    }

    @Override
    public String toString() {
        return "Items{" +
                "producto=" + producto +
                ", cantidadSe=" + cantidadSe +
                '}';
    }
}
