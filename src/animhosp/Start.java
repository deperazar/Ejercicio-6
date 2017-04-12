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
public class Start {
    
    private ArrayList<Vet> v;
    public Start(){
        v=new ArrayList<>();
    }
    public void readPets(Vet veter){
        veter.showpetsv();
    }
    
    public void managevet(Vet veter, String name){
        v.add(veter);
    }
   
    public static void main(String[] args) {
        
        Vet zoo=new Vet();
        Pet a=new Dog("5454","Bobby","Negro","Great Danish");
        Pet b=new Cat("8475","Seth","Gris",true);
        Pet c=new Hamster("4856","Roscoe","Blanco",458.48);
        Pet d=new Dog("4215","Arlesiu","Blanco","Samoyedo");
        Pet e=new Cat("8236","Isis","Cafe",true);
        Pet f=new Hamster("4536","Phil","Naranja",542.36);
        
        Person p1= new Person("Alvaro","269784");
        Person p2= new Person("Ana","261234");
        Person p3= new Person("Clemente","478584");
        Person p4= new Person("Henry","789784");
        Person p5= new Person("Joe","2369785");
        
        p1.addpetp(a);
        p1.addpetp(b);
        p2.addpetp(c);
        p3.addpetp(d);
        p4.addpetp(e);
        p5.addpetp(f);
        
        zoo.addpetv(a);
        zoo.addpetv(b);
        zoo.addpetv(c);
        zoo.addpetv(d);
        zoo.addpetv(e);
        zoo.addpetv(f);

        System.out.println(zoo.showpetsbt());
        System.out.println(p1.showpetsp());
    }
}
