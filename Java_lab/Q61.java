import java.util.Scanner;
class Box{
    int  height;
    int  width;
    int  depth;

    Box(int  height,int  width,int  depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
    }
    int  volume(){
        int  volume=height*width*depth;
        return volume;
    }
}
class Boxweight extends Box{
    int  distance;
    int  costKM;
    int  COS;
    int  vol;
    Boxweight(int  height,int  width,int  depth,int  distance,int  costKM){
        super(height,width,depth);
        this.distance=distance;
        this.costKM=costKM;
        this.vol=volume();
    }
    int  CostShipping(){
        COS=distance*vol*costKM;
        System.out.println("The cost of shipping for this item will be :");
        return COS;
    }
}
class Q61{
    public static void main(String args[]){
        Boxweight b=new Boxweight(33,44,55,123,4);
        int  x=b.CostShipping();
        System.out.println(x);
    }

}






// Q1
// A class 'Box' which contains methods and other details(width, height, depth) to calculate
// volume.
// Another class ‘Boxweight’ contains method for finding cost for shipping the box using weight
// of the box (formula to find cost of shipping= distance in km * volume * cost per km)
// Take cost per KM by the user.
// WAP to find the volume of box and cost to ship using a single object
