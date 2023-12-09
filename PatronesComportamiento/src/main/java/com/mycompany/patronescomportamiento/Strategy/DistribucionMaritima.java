/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronescomportamiento.Strategy;

/**
 *
 * @author agome
 */
public abstract class DistribucionMaritima implements EstrategiaDistribucion {
    protected String crew;
    protected String vehicle;
    protected String time;
    protected String dock;
    
    public abstract void crearDistribucionMaritima();
}
