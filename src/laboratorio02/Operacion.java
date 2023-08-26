/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio02;

/**
 *
 * @author ESTUDIANTE
 */
public class Operacion {
    float elemento01;
    float elemento02;
    
    public Operacion(){}

    public Operacion(float elemento01, float elemento02) {
        this.elemento01 = elemento01;
        this.elemento02 = elemento02;
    }
    
    public float getElemento01() {
        return elemento01;
    }

    public void setElemento01(float elemento01) {
        this.elemento01 = elemento01;
    }

    public float getElemento02() {
        return elemento02;
    }

    public void setElemento02(float elemento02) {
        this.elemento02 = elemento02;
    }
    
    public float Suma(){
    return this.elemento01 + this.elemento02;
    }
    
    public float Resta(){
    return this.elemento01 - this.elemento02;
    }
    
    public float Multiplicar(){
    return this.elemento01 * this.elemento02;
    }
    
    public float Dividir(){
    return this.elemento01 / this.elemento02;
    }
        

}
