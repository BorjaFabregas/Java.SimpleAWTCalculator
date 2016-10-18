package modelo;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabregas
 */
public class Operaciones implements IOperaciones{
    
    @Override
    public float suma(float a, float b){
        return a + b;
    }
    
    @Override
    public float resta(float a, float b){
        return a - b;
    }
    
    @Override
    public float multiplicacion(float a, float b){
        return a * b;
    }
    
    @Override
    public float division(float a, float b){
        return a / b;
    }
    
}
