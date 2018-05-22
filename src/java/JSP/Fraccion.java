/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP;

/**
 *
 * @author kevin
 */
public class Fraccion {
    private int num;
    private int denom;

    public Fraccion() {
    }

    public Fraccion(int num, int denom) {
        this.num = num;
        this.denom = denom;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDenom() {
        return denom;
    }

    public void setDenom(int denom) {
        this.denom = denom;
    }
    
    public Fraccion suma(Fraccion fraccion){
        Fraccion result = new Fraccion();
        result.denom = this.denom*fraccion.denom;
        result.num = fraccion.denom*this.num;
        result.num+= this.denom*fraccion.num;
        return result.simplificar();
    }
    
    public Fraccion resta(Fraccion fraccion){
        Fraccion result = new Fraccion();
        result.denom = this.denom*fraccion.denom;
        result.num = fraccion.denom*this.num;
        result.num-= this.denom*fraccion.num;
        return result.simplificar();
    }
    
    public Fraccion multiplicacion(Fraccion fraccion){
        Fraccion result = new Fraccion();
        result.denom = this.denom*fraccion.denom;
        result.num = fraccion.num*this.num;
        return result.simplificar();
    }
    
    public Fraccion division(Fraccion fraccion){
        Fraccion result = new Fraccion();
        result.denom = this.denom*fraccion.num;
        result.num = fraccion.denom*this.num;
        return result.simplificar();
    }
    
    public Fraccion simplificar(){
        Fraccion auxiliar = new Fraccion(num, denom);
        if(auxiliar.num==1||auxiliar.denom==1){
            if(auxiliar.denom<0){
            auxiliar.denom*=-1;
            auxiliar.num*=-1;
            }
            return auxiliar;
        }
        if(auxiliar.num%2==0&&auxiliar.denom%2==0){
            auxiliar.denom/=2;
            auxiliar.num/=2;
            return auxiliar.simplificar();
        }
        if(auxiliar.num%3==0&&auxiliar.denom%3==0){
            auxiliar.denom/=3;
            auxiliar.num/=3;
            return auxiliar.simplificar();
        }
        if(auxiliar.num%auxiliar.denom==0&&auxiliar.denom%auxiliar.denom==0){
            auxiliar.denom/=auxiliar.denom;
            auxiliar.num/=auxiliar.denom;
            return auxiliar.simplificar();
        }
        if(auxiliar.num%auxiliar.num==0&&auxiliar.denom%auxiliar.num==0){
            auxiliar.denom/=auxiliar.num;
            auxiliar.num/=auxiliar.num;
            return auxiliar.simplificar();
        }
        if(auxiliar.denom<0){
            auxiliar.denom*=-1;
            auxiliar.num*=-1;
        }
        return auxiliar;
    }
    
    @Override
    public String toString(){
        return this.num+"/"+this.denom;
    }
}
