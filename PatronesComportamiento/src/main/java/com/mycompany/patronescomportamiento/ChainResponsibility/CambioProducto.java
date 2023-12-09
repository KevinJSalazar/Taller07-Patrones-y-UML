/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronescomportamiento.ChainResponsibility;

/**
 *
 * @author agome
 */
public abstract class CambioProducto {
    
    protected CambioProducto m_sucesor;
    
    public void setSucesor(CambioProducto sucesor){
	m_sucesor = sucesor;
    }
    
    public abstract void decidirCambio(Solicitud solicitud);
    
}
