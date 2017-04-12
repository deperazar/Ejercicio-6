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
public class Pet {
    protected String ida;
    protected String namea;
    protected String haircolor;
    
    public Pet(String ida, String namea, String haircolor){
        this.ida=ida;
        this.namea=namea;
        this.haircolor=haircolor;
    }
    
    public String sound(){
        return "";
    }
}
