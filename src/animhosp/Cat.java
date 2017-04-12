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
public class Cat extends Pet{
    private Boolean isHunter;
    
    public Cat(String ida,String namea,String haircolor, Boolean isHunter){
        super(ida,namea,haircolor);
        this.isHunter=isHunter;
    }
    
    @Override
    public String sound(){
        return "Miau Miau";
    }
}
