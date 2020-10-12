

public class runElement{

    
    static void ausgebenArray(Element [] elements){

        for(Element element : elements)
        {
            System.out.println("\n"+element.toString());
        }
    }

    public static void main(String [] args){
        

    
    
        // c) -> 5 beliebige Klassen erstellen 

        Element calcium =  new Element(76, "Calcium", "Ca", 12 , 1); 

        Element magnesium =  new Element(5,"Magnesium","Mg"); 

        Element kohlenstoff =  new Element(14, "Kohlenstoff" , "C" , 12 , 2); 

        Element stickstoff =  new Element(15, "Stickstoff", "N", 15, 2); 
        
        Element sauerstoff =  new Element(15, "Sauerstoff", "O", 16, 2); 

        Element[] elementArr = { calcium, magnesium,kohlenstoff,stickstoff,sauerstoff}; 

        System.out.println("Das Element an der Stelle 0 heisst: " + elementArr[0].getElementname()); 
        
        System.out.println( magnesium.getElementname()+ " und wiegt : " + String.valueOf(magnesium.getAtommasse()));
        System.out.print(calcium.getElementname() + " hat den Aggregatzustand " + calcium.getAggregatzustand()); 

        ausgebenArray(elementArr);
    
    }
}