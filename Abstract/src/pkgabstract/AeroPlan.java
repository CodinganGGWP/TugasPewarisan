/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;




public class AeroPlan extends Vehicle{
    
    @Override
    public void walk (){
        System.out.println("Aeroplan Flying");
    }
    public static void main(String []args) {
        AeroPlan Garuda = new AeroPlan();
        Garuda.function();
        Garuda.fuel();
        Garuda.walk();
    }
}