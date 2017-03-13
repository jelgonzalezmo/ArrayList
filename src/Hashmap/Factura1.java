/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashmap;

import cardinalidadilimitada.Producto;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Estudiante
 */
public class Factura1 {
    private HashMap <String ,Producto1> producto;

 
       public Factura1() {
        this.producto = new HashMap<>();
    }

    
public void adicionarProducto1(Producto1 producto){
this.producto.put(producto.getNombre(),producto);
}
    
public HashMap <String ,Producto1> listarproductos(){
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
