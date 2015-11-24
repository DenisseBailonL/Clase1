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
public class Denisse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Descuento des1=new Descuento(0.1,100);
		
des1.setTotalCompra(150);
		
		
double total=des1.getTotal();
		
System.out.println("TotalCompra:"+total);
		
System.out.println("TotalCompra:"+des1.getTotal());
Circulo cir1=new Circulo(10);
		
System.out.println("Area cr1:"+cir1.getArea());

	
}


	
}
    
    
    

