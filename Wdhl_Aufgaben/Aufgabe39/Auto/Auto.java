package Auto; 

abstract class Auto{

    private String hersteller; 
    private int geschwindigkeit; 
    private int gelaufeneKm; 

    //Konstruktor 

    public Auto(String hersteller, int geschwindigkeit, int gelaufeneKm){

        this.hersteller =  hersteller;
        this.geschwindigkeit =  geschwindigkeit;
        this.gelaufeneKm = gelaufeneKm; 
    }

    public Auto(String hersteller){
        this.hersteller = hersteller; 
        this.geschwindigkeit =  0;
        this.gelaufeneKm = 0; 
    }

    // Getter 

    public String getHersteller() {
        return hersteller;
    }
    
    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public int getGelaufeneKm() {
        return gelaufeneKm;
    }

    //Setter

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }
    
    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }
    
    public void setGelaufeneKm(int gelaufeneKm) {
        this.gelaufeneKm = gelaufeneKm;
    }

    abstract void beschleunigen(); 

    abstract void bremsen(); 

    public int  fahren(int zeit){

        return this.geschwindigkeit *  zeit; 

    }

    @Override
    public String toString(){
        return "Das Auto der Marke " + this.hersteller + " hat eine Geschwindigkeit von " + String.valueOf(this.geschwindigkeit) + " und bisher einen Weg von " + String.valueOf(this.gelaufeneKm)  + " zurueckgelegt "; 
    }

}