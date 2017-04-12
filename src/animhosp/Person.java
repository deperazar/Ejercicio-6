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
public class Person {
    private String name;
    private String id;
    private ArrayList<Pet> mascotas;
    
    public Person(String name,String id){
        this.name=name;
        this.id=id;
        this.mascotas=new ArrayList<>();
    }
    
    public void addpetp(Pet p){
        this.mascotas.add(p);
    }
    
    public String showpetsp(){
        String a="";
        for(int i=0;i<mascotas.size();i++){
            a=a+"\nNombre: "+mascotas.get(i).namea+" ID: "+mascotas.get(i).ida+" Color de Pelo: "+mascotas.get(i).haircolor;
        }
        return a;
    }
    
}
