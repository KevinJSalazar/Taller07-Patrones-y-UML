/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronescomportamiento.Strategy;

/**
 *
 * @author agome
 */
public abstract class DistribucionAerea implements EstrategiaDistribucion {
    protected String route;
    protected String vehicle;
    protected String time;
    protected String airport;
    
    public abstract void crearDistribucionAerea();
}
