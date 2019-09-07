package PinkFloyed;
public class Bugatti extends Car {
    private int Price;
    
  public Bugatti(String Color, String Model, int Engin_no, int Horse_Power,int Price){
  super(Color,Model,Engin_no,Horse_Power);
  this.Price = Price;
  }
  
   @Override
     void display (){
        
         System.out.println("Price : "+Price);
          System.out.println("Color: "+Color);
         System.out.println("Mode : "+Model);
         System.out.println("Engin number : "+Engin_no);
         System.out.println("Horse Power : "+Horse_Power);
     }  
     
}
