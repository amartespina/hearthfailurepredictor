/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;



/**
 *
 * @author angel
 */
public class Principal{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Modelo modelo = new Modelo();
       modelo.aprenderModelo();
       GenerarARFF generar = new GenerarARFF();
      //generar.GenerarInstanciaTest(49,F,160,180,0,156
       
      System.out.println("El resultado tras aplicar a los datos es " + modelo.GenerarInstanciaTest(50,"F",160,180,0,156));   }

}
