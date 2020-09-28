/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Dto;

/**
 *
 * @author stive
 */
public class Loro implements Ave, AveVoladora {

    @Override
    public void comer() {
        System.out.println("El loro pude comer");
    }

    @Override
    public void volar() {
        System.out.println("El loro pude volar");
    }
    
}
