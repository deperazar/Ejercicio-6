/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animhosp;
import java.util.ArrayList;
/**
 *
 * @author PERSONAL
 */
public class Vet {
    private ArrayList<Pet> animales;
    
    public Vet(){
        animales=new ArrayList<>();
    }
    
    public void addpetv(Pet p){
        this.animales.add(p);
    }
    
    public void removepet(Pet p){
        this.animales.remove(p);
    }

    public String showpetsv(){
        String a="";
        for(int i=0;i<3;i++){
            a="\n|Nombre: "+animales.get(i).namea+" |ID: "+animales.get(i).ida+" |Color de Pelo: "+animales.get(i).haircolor+a;
        }
        return a;
    }
    
    
    public String showpetsbt(){
        String a="\nPerros:\n";
        String b="\n\nGatos:\n";
        String c="\n\nHamsters:\n";
        for(int i=0;i<animales.size();i++){
            if(animales.get(i) instanceof Dog){
                a=a+"\n|Nombre: "+animales.get(i).namea+" |ID: "+animales.get(i).ida+" |Color de Pelo: "+animales.get(i).haircolor;
            }
            else if(animales.get(i) instanceof Cat){
                b=b+"\n|Nombre: "+animales.get(i).namea+" |ID: "+animales.get(i).ida+" |Color de Pelo: "+animales.get(i).haircolor;
            }
            else{
                c=c+"\n|Nombre: "+animales.get(i).namea+" |ID: "+animales.get(i).ida+" |Color de Pelo: "+animales.get(i).haircolor;
            }
            
        }
        return a+b+c;
    }
}
