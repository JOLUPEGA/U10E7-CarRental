/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuxuryCarRental;

import CarRental.CarRental;

/**
 *
 * @author Jose Luis Perez
 */
public class LuxuryCarRental extends CarRental{
    private boolean conChorfer;
    
    public LuxuryCarRental(boolean conChorfer, String name, int codigo, TamAutoEnum tamanioAuto, int duracion){
        super(name, codigo, tamanioAuto, duracion);
        this.conChorfer = conChorfer;
        if(conChorfer){
            setTarifa(79.99+200.00);
        }else{
            setTarifa(79.99);
        }
    }

    public String Display(){
        String palabra;
        if(conChorfer){
            palabra = super.Display() + " costo con chofer: " + 200.00;
        }else{
            palabra = super.Display();
        }
        return palabra;  
    }
}