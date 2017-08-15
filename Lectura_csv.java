import java.io.FileNotFoundException;
import java.io.IOException;
import com.csvreader.CsvReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
//import com.csvreader.CsvReader;

public class Lectura_csv {
    
    ArrayList<Cliente> listaCliente = new ArrayList<Cliente>(); 
    
    
    public void agregarLista()throws FileNotFoundException, IOException{
        CsvReader mi_csv = new CsvReader("C:\\Users\\Rogelio Alcantar\\Documents\\NetBeansProjects\\FBD_Practica01\\src\\P1.csv"); //Cambien a la ruta de su archivo
        mi_csv.readHeaders(); // Leemos las Cabeceras, las cuales nos dan informacion de cada campo
        while (mi_csv.readRecord()){
            String nombre = mi_csv.get(0);
            String telefono = mi_csv.get(1);
            String direccion = mi_csv.get(2);
            String correo = mi_csv.get(3);
            String m2 = mi_csv.get(4);
            int metrosCuadrados = Integer.parseInt(m2);
            String val_prop = mi_csv.get(5);
            double valorPropiedad = Double.parseDouble(val_prop);
            String val_venta = mi_csv.get(6);
            double valorVenta = Double.parseDouble(val_venta);
            double margenGanancia = valorVenta - valorPropiedad;
            Cliente cliente = new Cliente(nombre, telefono, direccion, correo, metrosCuadrados, valorPropiedad, valorVenta, margenGanancia);
            listaCliente.add(cliente);
        }
    }
    
    public void primerPunto(){
        System.out.println("____________Propiedades de menos de 200_____________");
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        Iterator<Cliente> it = listaCliente.iterator();
        while (it.hasNext()) {
            Cliente cliente = (Cliente) it.next();
            if(cliente.getMetrosCuadrados() < 200){
                System.out.print(cliente.toString()+" \n ");
                lista.add(cliente);
                    
            }
        }
        System.out.println("____________Aqui los que cuestan menos de medio millon_____________");
        ArrayList<Cliente> lista1 = new ArrayList<Cliente>();
        Iterator<Cliente> itt = lista.iterator();
        while(itt.hasNext()){
            Cliente elemento = (Cliente) itt.next();
            double medio = 500000.00;
            if(elemento.getPrecioVenta() <= medio){
                System.out.print(elemento.toString()+" \n ");
                lista1.add(elemento);
            }
            
        }
        
        System.out.println("__________Aqui los que estan en rango_______________");
        ArrayList<Cliente> lista2 = new ArrayList<Cliente>();
        Iterator<Cliente> ir = lista1.iterator();
        while(ir.hasNext()){
            Cliente elemento = (Cliente) ir.next();
            double cin = 50000.00;
            if(elemento.getPrecioVenta() > cin){
                System.out.print(elemento.toString()+" \n ");
                lista2.add(elemento);
            }
            
        }
        
    }
    
    
    public void segundoPunto(){
        
        for (int k = 0 ; k <listaCliente.size() ; k++){ 
            int c = 1;
            for (int l = k + 1 ; l <listaCliente.size(); l++){
                if (listaCliente.get(k).getNombre().equals(listaCliente.get(l).getNombre()) ){
                    c++;
                    }
                }
            if ( listaCliente.get(k)!= null && c > 1){
            System.out.println ();
            System.out.println ("El uuario " + listaCliente.get(k).getNombre() + " " + "tiene " + c + " casas");
                }
        }
    }
    
    public void tercerPunto(){
        Collections.sort(listaCliente, new Comparator<Cliente>(){

			@Override
			public int compare(Cliente o1, Cliente o2) {
                            return Double.compare(o1.getPrecioVenta(), o2.getPrecioVenta());
			}
			
			
		});
        
        for (int i = 0; i <= 9; i++) {
            System.out.println(listaCliente.get(i));
        }
        
        }
        
    
    public void cuartoPunto(){
        Collections.sort(listaCliente, new Comparator<Cliente>(){

			@Override
			public int compare(Cliente o1, Cliente o2) {
                            return Double.compare(o2.getPrecioVenta(), o1.getPrecioVenta());
			}
			
			
		});
        
            for (int i = 0; i <= 4; i++) {
                System.out.println(listaCliente.get(i));
            }

        }
    
    
    public void quintoPunto(){
        Collections.sort(listaCliente, new Comparator<Cliente>(){

			@Override
			public int compare(Cliente o1, Cliente o2) {
                            return Double.compare(o2.getMargenGanancia(), o1.getMargenGanancia());
			}
			
			
		});
        for (int i = 0; i <= 4; i++) {
                System.out.println(listaCliente.get(i));
            }
        
    }
    
    
    public void primerExtra(String n){
        System.out.println("____________Propiedades que le pertenecen a " + n + "_____________");
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        Iterator<Cliente> it = listaCliente.iterator();
        while (it.hasNext()) {
            Cliente cliente = (Cliente) it.next();
            if(cliente.getNombre().equals(n) ){
                lista.add(cliente);
            }
        }
        
        
        Iterator<Cliente> itt = lista.iterator();
        while (itt.hasNext()) {
            Cliente cliente = (Cliente) itt.next();
                System.out.print(cliente.toString()+" \n ");    
            }
    }
    
    public void segundoExtra(double p){
        System.out.println("____________Propiedades de menores o iguales a  " + p + "_____________");
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        Iterator<Cliente> it = listaCliente.iterator();
        while (it.hasNext()) {
            Cliente cliente = (Cliente) it.next();
            if(cliente.getMetrosCuadrados() <= p){
                
                lista.add(cliente);
                    
            }
        }
        
        Iterator<Cliente> itt = lista.iterator();
        while (itt.hasNext()) {
            Cliente cliente = (Cliente) itt.next();
                System.out.print(cliente.toString()+" \n ");    
            }
    }
        
    
        
    public static void main(String[] args) throws FileNotFoundException, IOException {
            Lectura_csv n = new Lectura_csv();
            n.agregarLista();
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe el nombre del usuario que quieras buscar: ");
            String t = sc.nextLine();
            n.primerExtra(t);
            
            
            System.out.println("Escribe el precio que desee: ");
            double g = sc.nextDouble();
            n.segundoExtra(g);
        }
    
    
}
    




