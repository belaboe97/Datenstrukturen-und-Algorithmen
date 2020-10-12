public class Element {

    private int ordnungszahl ; 
    private String elementname; 
    private String elementsymbol ;  
    private float atommasse ;  
    private int aggregatzustand ; 


    public Element(int ordnungszahl, String elementname, String elementsymbol, float atommasse , int aggregatzustand){

        this.ordnungszahl = ordnungszahl; 
        this.elementname  =  elementname; 
        this.elementsymbol = elementsymbol;  
        this.atommasse = atommasse ;  
        this.aggregatzustand  = aggregatzustand; 
    
    }; 

    public Element(int ordnungszahl, String elementname, String elementsymbol){

        this.ordnungszahl = ordnungszahl; 
        this.elementname  =  elementname; 
        this.elementsymbol = elementsymbol;  
        this.atommasse = 0 ;  
        this.aggregatzustand  = 1; 

    }; 

    // Getter 

    public int getOrdnungszahl() {
        return ordnungszahl;
    }

    public String getElementname() {
        return elementname;
    }

    public String getElementsymbol() {
        return elementsymbol;
    }

    public float getAtommasse() {
        return atommasse;
    }


    public String getAggregatzustand() {

        switch(aggregatzustand){
            case 0: 
                return "gasfoermig"; 
            case 1: 
                return "fluessig";
            case 2:  
                return "fest"; 
            default: 
                return "Es handelt sich um eine unbekannten Aggregtszustand"; 
        }
    }

    // Setter 

    public void setAtommasse(float atommasse) {
        this.atommasse = atommasse;
    }

    public void setAggregatzustand(String aggregatzustand) {

        if (aggregatzustand == "gasfoermig"){

            this.aggregatzustand = 0;
        }
        if (aggregatzustand == "fluessig"){

            this.aggregatzustand = 1;
        }
        if (aggregatzustand == "fest"){

            this.aggregatzustand = 2;
        }
        else{
            this.aggregatzustand = 100; 
        }
    }

    @Override
    public String toString(){

        return this.elementname + " dem Elementsymbol " +  this.elementsymbol + " mit der Ordnungszahl: " + String.valueOf(this.ordnungszahl) + " der Atommasse " +  String.valueOf(this.atommasse)  + " sowie dem Aggregatzustand "+  this.getAggregatzustand(); 
    }

}

