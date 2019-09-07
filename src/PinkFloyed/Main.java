
package PinkFloyed;
public class Main {
    public static void main(String[] args) {
        Car l = new Lamborghini("RED","Sesto",9090,1200,255000);
        Car f = new Ferrari("BLACK","Albino",2420,1500,235000);
        Car fo = new Ford("YELLOW","GTR",1920,1300,233000);
        Car b = new Bugatti("BLUE","Veron",4070,1700,435000);
        
        l.display();
        System.out.println("");
        f.display();
        System.out.println("");
        fo.display();
        System.out.println("");
        b.display();
    }
}
