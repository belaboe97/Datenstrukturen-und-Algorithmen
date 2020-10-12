import Auto.BMW;
import Auto.Audi; 
import java.util.Scanner; 

public class Autobahn {


    public static void main(String [] args)
    {   

        BMW dreierBmw = new BMW(30);
        Audi a6 = new Audi(50); 
        
        Scanner scan = new Scanner(System.in);
        

        boolean geschVergl = true; 
        int audi_speed = 0;
        int bmw_speed = 0 ; 


        while(geschVergl){

            int eingabe = scan.nextInt(); 

            if (eingabe == 1){
                audi_speed += a6.fahren(1); 
                bmw_speed += dreierBmw.fahren(1); 
                System.out.println("Audi Speed: " + audi_speed + " BMW Speed: " + bmw_speed); 
            }

            if(bmw_speed > audi_speed){
                
                break; 
            }

            else{
                System.out.println("Bitte 1 eingeben zum beschleunigen !"); 
            }
        
        }
        
        while(true){
            int eingabe = scan.nextInt(); 

            if (eingabe == 1){
                
                a6.beschleunigen();
                audi_speed += a6.fahren(1); 
                dreierBmw.beschleunigen();
                bmw_speed += dreierBmw.fahren(1); 
                System.out.println("Audi Speed: " + audi_speed + " BMW Speed: " + bmw_speed); 
            }

            if(bmw_speed > audi_speed){
                
                break; 
            }

            else{
                System.out.println("Bitte 1 eingeben zum beschleunigen !"); 
            }
        }
    }
}
