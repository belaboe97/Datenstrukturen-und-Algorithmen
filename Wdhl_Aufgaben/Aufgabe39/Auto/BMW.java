package Auto;
import java.lang.Math; 

public class BMW extends Auto{

    public BMW(int geschwindigkeit){
        super("BMW", geschwindigkeit, 0); 
       
    }

    public void beschleunigen(){
        double geschwindigkeit = this.getGeschwindigkeit() * 1.1; 

        if(geschwindigkeit < 1){
            geschwindigkeit = 1; 
        }
        this.setGeschwindigkeit((int) Math.round(geschwindigkeit));
    }

    public void bremsen(){
        double geschwindigkeit = this.getGeschwindigkeit() * 0.9; 

        if(geschwindigkeit < 1){
            geschwindigkeit = 1; 
        }
        this.setGeschwindigkeit((int) Math.round(geschwindigkeit));
    }
    
}
