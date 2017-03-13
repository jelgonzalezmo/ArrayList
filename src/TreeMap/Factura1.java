/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeMap;

import Hashmap.*;
import cardinalidadilimitada.Producto;
import java.util.*;
import java.util.ArrayList;
import java.util.TreeMap;
/**
 *
 * @author Estudiante
 */
public class Factura1 {
    private TreeMap <String ,Producto1> producto;

 
       public Factura1() {
        this.producto = new TreeMap<>();
    }

    
public void adicionarProducto1(Producto1 producto){
this.producto.put(producto.getNombre(),producto);
}
    
public TreeMap <String ,Producto1> listarproductos(){
return this.producto;
}

public double calculartotal(){
double total=0;
for(Producto1 producto:producto.values()){
total+=producto.getPrecio();
}
return total;
}








}
