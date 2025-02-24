// Use the protected access modifier in a class and its subclasses. Demonstrate how it allows access within the same package and by subclasses.
// Implement a class hierarchy with multiple constructors in each class. 
class hell{
    protected int data;
    protected String input;
    hell(int data){
        this.data=data;
    }
    hell(){}
    hell(int data,String input){
        this.data=data;
        this.input=input;
    }
    void show(){
        System.out.println("Integer value: "+data+" String value: "+input);
    }
    
}
class Q54{
    public static void main(String args[]){
        hell h=new hell();
        hell i=new hell(20);
        hell j=new hell(100,"Piyush");
        h.show();
        i.show();
        j.show();
    }
}