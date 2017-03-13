/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardinalidadilimitada;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Cardinalidadilimitada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Factura factura =new Factura();
 
   Producto p1=new Producto();
   p1.setNombre("papas");
   p1.setPrecio(45.6);
           
    Producto p2=new Producto();
   p2.setNombre("papas2");
   p2.setPrecio(45.67);
  factura.adicionarProducto(p1);
  factura.adicionarProducto(p2);
   
 ArrayList<Producto>  lista=factura.listarproductos();
   for (int i=0;i<lista.size();i++){
   Producto p=lista.get(i);
   System.out.println(p.getNombre()+" "+p.getPrecio());
             }
          }
    
}
