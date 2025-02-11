// Use the protected access modifier in a class and its subclasses. Demonstrate how it allows access within the same package and by subclasses.
// Implement a class hierarchy with multiple constructors in each class. 
class hierarchy{
    protected int data;
    protected String input;
    hierarchy(int data){
        this.data=data;
    }
    hierarchy(){}
    hierarchy(int data,String input){
        this.data=data;
        this.input=input;
    }
    void show(){
        System.out.println("Integer value: "+data+" String value: "+input);
    }
    
}
class Q54{
    public static void main(String args[]){
        hierarchy h=new hierarchy();
        hierarchy i=new hierarchy(20);
        hierarchy j=new hierarchy(100,"Piyush");
        h.show();
        i.show();
        j.show();
    }
}