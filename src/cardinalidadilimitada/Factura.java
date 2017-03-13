/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardinalidadilimitada;

import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Factura {
    private ArrayList<Producto>producto;

 
    public Factura(ArrayList<Producto> producto) {
        this.producto = producto;
    }
    
       public Factura() {
        this.producto = new ArrayList<>();
    }

    
public void adicionarProducto(Producto producto){
this.producto.add(producto);
}
    
public ArrayList<Producto> listarproductos(){
return this.producto;
}

public double calculartotal(){
double total=0;
for(Producto producto:producto){
total+=producto.getPrecio();
}
return total;
}








}
