/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Estudiante
 */
public class Cardinalidadilimitada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Factura1 factura =new Factura1();
 
   Producto1 p1=new Producto1();
   p1.setNombre("papas2");
   p1.setPrecio(45.6);
           
 
   
   Producto1 p2=new Producto1();
   p2.setNombre("papas2");
   p2.setPrecio(45.67);
   
  factura.adicionarProducto1(p1);
  factura.adicionarProducto1(p2);
  
   
HashMap <String,Producto1> lista = factura.listarproductos();
   for (String clave:lista.keySet()){
   Producto1 p=lista.get(clave);
   System.out.println(p.getNombre()+" "+p.getPrecio());
             }
    
    for(Producto1 p: lista.values()){
    System.out.println(p.getNombre()+" "+p.getPrecio() );
    }
     
    
}}
