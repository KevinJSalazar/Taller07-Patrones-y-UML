/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronescomportamiento.Iterator;
/**
 *
 * @author agome
 */
public class Producto implements Iterable{
    private int productId;
    private String productName;
    private String category;
    private String location;
    
    
    //Implementar getters correspondientes
    
    @Override
    public Iterator createIterator(){
        //Implementar código correspondiente que devuelve un objeto de la clase ProductoIterator
        return new ProductoIterator();
    }
    
}
