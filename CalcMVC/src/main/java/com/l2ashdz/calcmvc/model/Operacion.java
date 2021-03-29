package com.l2ashdz.calcmvc.model;

/**
 *
 * @date 28/03/2021
 * @time 17:46:44
 * @author asael
 */
public class Operacion {
    
    private float numero1;
    private float numero2;
    private float resultado;

    public Operacion() {
    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    
    public void sumar() {
        this.resultado = this.numero1 + numero2;
    }
    
    public void restar() {
        this.resultado = this.numero1 - numero2;
    }
    
    public void multiplicar() {
        this.resultado = this.numero1 * numero2;
    }
    
    public void dividir() {
        this.resultado = this.numero1 / numero2;
    }
}
