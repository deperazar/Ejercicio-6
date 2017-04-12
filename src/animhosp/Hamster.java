/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animhosp;

/**
 *
 * @author PERSONAL
 */
public class Hamster extends Pet{
    private double weight;
    
    public Hamster(String ida,String namea,String haircolor, double weight){
        super(ida,namea,haircolor);
        this.weight=weight;
    }
    
    @Override
    public String sound(){
        return "Hiiii";
    }
}
