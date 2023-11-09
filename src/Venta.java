import java.util.ArrayList;

public class Venta {

    public Integer id;
    public String fechaVenta;

    public String formaPago;
    public String precioVenta;
   private ArrayList<Cliente>usuarioComprador;
   private ArrayList<Vehiculo>vehiculoComprado;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(String precioVenta) {
        this.precioVenta = precioVenta;
    }


    public ArrayList<Cliente> getUsuarioComprador() {
        return usuarioComprador;
    }

    public void setUsuarioComprador(ArrayList<Cliente> usuarioComprador) {
        this.usuarioComprador = usuarioComprador;
    }

    public ArrayList<Vehiculo> getVehiculoComprado() {
        return vehiculoComprado;
    }

    public void setVehiculoComprado(ArrayList<Vehiculo> vehiculoComprado) {
        this.vehiculoComprado = vehiculoComprado;
    }
}
