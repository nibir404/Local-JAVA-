
package PinkFloyed;
public class Car {
    String Color;
    String Model;
    int Engin_no;
    int Horse_Power;

    public Car(String Color, String Model, int Engin_no, int Horse_Power) {
        this.Color = Color;
        this.Model = Model;
        this.Engin_no = Engin_no;
        this.Horse_Power = Horse_Power;
        
    }
    

       void display (){
           
         System.out.println("Color: "+Color);
         System.out.println("Mode : "+Model);
         System.out.println("Engin number : "+Engin_no);
         System.out.println("Horse Power : "+Horse_Power);
        
     }   
}
