/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.luis.calculadora;

import java.math.BigDecimal;

/**
 *
 * @author lll
 */
public class Operaciones {
    BigDecimal cache = null;
    BigDecimal cache2 = null;
    BigDecimal result;
    Boolean cached;
    
    Boolean add = false;
    Boolean sub = false;
    Boolean mul = false;
    Boolean div = false;
    
    public BigDecimal suma(){
        result = cache.add(cache2);
        return result;
    }
    
    public BigDecimal resta(){
        result = cache.subtract(cache2);
        return result;
    }
    
    public BigDecimal multiplicacion(){
        result = cache.multiply(cache2);
        return result;
    }
    
    public BigDecimal division(){
        result = cache.divide(cache2);
        return result;
    }
}
