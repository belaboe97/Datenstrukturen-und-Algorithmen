package Auto; 

public class Audi extends Auto {

    public Audi(int geschwindigkeit){
        super("Audi", geschwindigkeit, 0); 
       
    }

    public void beschleunigen(){
        int geschwindigkeit = this.getGeschwindigkeit() + 1; 

        this.setGeschwindigkeit(geschwindigkeit);
    }

    public void bremsen(){
        int geschwindigkeit = this.getGeschwindigkeit() - 2; 
        if(geschwindigkeit <= 0){
            geschwindigkeit = 0; 
        }

        this.setGeschwindigkeit(geschwindigkeit);
    }
    
}
