/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denisse;

/**
 *
 * @author Alexander
 */
public class Circulo {
     private double radio;
  public Circulo(){
     this.radio=radio ;
  }
  
  public Circulo (double radioParam){
     this.radio=radioParam;
  }
  
  public void SetRadio(double radioParam){
     this.radio=radioParam;
  }

  public double getRadio(){
     return this.radio;
  }


  public double getArea(){
     return Math.PI*radio*radio;
  } 
}
