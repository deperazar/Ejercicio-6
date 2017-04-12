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
public class Dog extends Pet {
    private String breed;
    
    public Dog(String ida,String namea,String haircolor, String breed){
        super(ida,namea,haircolor);
        this.breed=breed;
    }
    
    @Override
    public String sound(){
        return "Guau Guau";
    }
}
