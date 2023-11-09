import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Vehiculo>vehiculos= new ArrayList<>();
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setId(65465455);
        vehiculo.setMatricula("YWFWF54S");
        vehiculo.setMarca("BMW");
        vehiculo.setModelo("I3");
        vehiculo.setColor("Azul");
        vehiculo.setTipoCombustible("electrico");
        vehiculo.setMotor("250 NM");
        vehiculo.setCaballos("170 CV");




        ArrayList<Cliente>clientes = new ArrayList<>();
        Cliente cliente = new Cliente();
        cliente.setDni("R32323423P");
        cliente.setNombre("Martin Diego");
        cliente.setApellidos("Herrrera Mendez");
        cliente.setDireccion("Avila");



        clientes.add(cliente);
        vehiculos.add(vehiculo);
        Venta venta = new Venta();
        venta.setId(65465455);
        venta.setFechaVenta("19/05/23");
        venta.setUsuarioComprador(clientes);
        venta.setVehiculoComprado(vehiculos);
        venta.setFormaPago("Metalico");
        venta.setPrecioVenta(" 35.500 " + "€");



         System.out.println( "Vehiculo(1) \n"
                 + " codigo: " + vehiculo.getId()
                 + "      Matricula: " + vehiculo.getMatricula()
                 + "      Marca: " + vehiculo.getMarca()
                 + "      Modelo: " + vehiculo.getModelo()
                 + "      Color: " + vehiculo.getColor()
                 + "      Tipo de combustible: " + vehiculo.getTipoCombustible()
                 + "      Motor: " + vehiculo.getMotor()
                 + "      Caballos: " + vehiculo.getCaballos() );


         System.out.println( "cliente(1) \n"
                 + "dni" + cliente.getDni()
                 + "      Nombre del cliente: " + cliente.getNombre()
                 + "      Apellidos del cliente: " + cliente.getApellidos()
                 + "      Direccion del cliente: " + cliente.getDireccion());


         System.out.println( "Venta (1) \n"
                 +"codigo de venta: " + venta.getId()
                 + "      fecha de venta: " + venta.getFechaVenta()
                 + "      Cliente Comprador: " + venta.getUsuarioComprador()
                 + "      Vehiculo Comprado: " + venta.getVehiculoComprado()
                 + "      Forma de Pago: " + venta.getFormaPago()
                 + "      Precio de la venta: " + venta.getPrecioVenta());
    }



}