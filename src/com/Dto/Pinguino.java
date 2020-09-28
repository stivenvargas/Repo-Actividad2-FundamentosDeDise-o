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
public class Pinguino implements Ave, AveNadadora{

    @Override
    public void comer() {
        System.out.println("El pinguino esta comiendo");
    }

    @Override
    public void nadar() {
        System.out.println("El pinguino esta nadando");
    }
    
}
