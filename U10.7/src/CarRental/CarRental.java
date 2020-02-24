/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarRental;

/**
 *
 * @author Jose Luis Perez
 */
public class CarRental {

    private int codigo;
    private double tarifa;
    private int duracion;
    private double totalTarifa;
    private String name; 
    private TamAutoEnum tamanioAuto;
    
    public CarRental(String name,
                           int codigo,
                              TamAutoEnum tamanioAuto,
                                         int duracion){
        this.name = name;
        this.codigo = codigo;
        this.tamanioAuto = tamanioAuto;
        this.duracion = duracion;
        this.tarifa = 0;
        setCalculoTarifa(tamanioAuto);
    }
    
    protected void setTarifa(double tarifa){
        this.tarifa += tarifa;
        setTotlaTarifa(this.tarifa);
    }
    
    protected void setTotlaTarifa(double tarifa){
        this.totalTarifa = tarifa * this.duracion;
    }
    
    private void setCalculoTarifa(TamAutoEnum tamanioAuto){
        double costoAuto;
        if(tamanioAuto.getNum() == 1){
            costoAuto = 29.99;
        }else if(tamanioAuto.getNum() == 2){
            costoAuto = 38.99;
        }else{
            costoAuto = 43.50;
        }
        setTarifa(costoAuto);
    }
    
    public String Display(){
        return "nombre: " + this.name + " codigo: " + this.codigo + " tamaÃ±o:" + this.tamanioAuto + " dias: " + this.duracion + "\ntarifa: " + this.tarifa + " tarifa total: " + this.totalTarifa;
    }

}
