/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Dao;

import com.Dto.Vehiculo;

/**
 *
 * @author stive
 */
public class VehiculoDao {
    
    public void verPreciosVehiculos(Vehiculo[] arrayVehiculo){
        for (Vehiculo vehiculo : arrayVehiculo) {
            System.out.println("Precio de vehiculo :"  + vehiculo.precioVehiculo());
        }
    }
}
