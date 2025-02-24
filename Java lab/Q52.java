// Create a base class Vehicle with attributes like model and year. Create a subclass Car that inherits from Vehicle and has additional attributes like numDoors and fuelTypeType.
//THis is the parent class Vehicle jo car ka model aur year ko allocate karega 
class Vehicle{
    String Model;
    int year;

    Vehicle(String Model,int year ){
        this.Model=Model;
        this.year=year;
    };
    //agar humko bas model aur year print karna hia tho
    void show(){
        System.out.println("The model of the car is : "+Model+".\nThe year in which this brand was released is : "+year);

    }
}
//this is the child class jo Vehicle class se Basic properties like Year aur Model inherit karega 
class Cars extends Vehicle{
    int numDoors;
    String fuelType;

    Cars(String Model,int year,int numDoors,String fuelType){
        super(Model,year);
        this.numDoors= numDoors;
        this.fuelType=fuelType;
    }
        
        //Ye meko allow karega ki jab Show of car ka need hoga tab woh function override ho jayega aur run karega nahi tho show of Vehicle chalega
    @Override
    void show(){
            System.out.println("The Car Model is : " + Model +"\nThe year of release for this car is : " + year +"\nThe No of Door in this car is : "+ numDoors +"\nThe type of fuelType for this car is : "+ fuelType);
        }
    
    
}
class Q52{
    public static void main(String args[]){
        Cars gaari= new Cars("Mazerrati",2009,4,"Diesel");
        gaari.show();
    }
}