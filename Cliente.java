/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rogelio Alcantar
 */
public class Cliente{
    
    private String nombre;
    private String telefono;
    private String direccion;
    private String correo; 
    private int metrosCuadrados;
    private double precioInmueble;
    private double precioVenta;
    private double margenGanancia;

    public Cliente(String nombre, String telefono, String direccion, String correo, int metrosCuadrados, double precioInmueble, double precioVenta, double margenGanancia) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.metrosCuadrados = metrosCuadrados;
        this.precioInmueble = precioInmueble;
        this.precioVenta = precioVenta;
        this.margenGanancia = margenGanancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public double getPrecioInmueble() {
        return precioInmueble;
    }

    public void setPrecioInmueble(double precioInmueble) {
        this.precioInmueble = precioInmueble;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getMargenGanancia() {
        return margenGanancia;
    }

    public void setMargenGanancia(double margenGanancia) {
        this.margenGanancia = margenGanancia;
    }

    @Override
    public String toString() {
        return  "Nombre " + nombre + ", Telefono " + telefono + ", Direccion " + direccion + ", Correo " + correo + ", Metros Cuadrados " + metrosCuadrados + ", Precio Inmueble " + precioInmueble + ", PrecioVenta " + precioVenta + ", Margen Ganancia " + margenGanancia ;
    }
    
    
    
}
