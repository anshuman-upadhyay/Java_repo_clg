import java.util.Scanner;
class Shape{
    int length;
    int width;
    Shape(int length,int width){
        this.length=length;
        this.width=width;
    }
    int find_area(){
        System.out.println("The area for the given shape is :");
        return length*width;
    }

}
class Square extends Shape{
    Square(int length){
        super(length,length);
    }

}
class Rectangle extends Shape{
    Rectangle(int length,int width){
        super(length,width);
    }

}

class Q63{
    public static void main(String args[]){
            Scanner s=new Scanner(System.in);
    System.out.println("Enter the length");
    int length=s.nextInt();
    System.out.println("Enter the width");
    int width=s.nextInt();
    int area;
    if (length == width){
        Square sq=new Square(length);
        area=sq.find_area();
    }
    else{
        Rectangle rec=new Rectangle(length,width);
        area= rec.find_area();
}
System.out.println(area);






    }
    
}




// Shape is the super class for square and rectangle. Write a program to find areas of square
// and rectangle by inheriting shape.
// Method-find_Area() should be declared in shape. Parameters could be changed as per
// needed.
