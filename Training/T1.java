import java.util.Scanner;
class printZero{
     int n;
    printZero(int n1){
        this.n=n1;
    }
    void printsZero(){
            for(int i=0;i<=n;i++){
                for(int j=0;j<=n;j++){
                    if(i==0|| i==n||j==0||j==n){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");

                    }
                }
                    System.out.println();
            }
                    System.out.println();
    }
};
class printOne{
     int n;
    printOne(int n1){
        this.n=n1;
    }
    void printsOne(){
            for(int i=0;i<=n;i++){
                for(int j=0;j<=n;j++){
                    if(j==n/2||i==n||i+j==n/2 && i<=n/3){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");

                    }
                }
                    System.out.println();
            }
        System.out.println();
    }
};
class printTwo{
     int n;
printTwo(int n1){
        this.n=n1;
    }
    void printsTwo(){
            for(int i=0;i<=n;i++){
                for(int j=0;j<=n;j++){
                    if(i==0||i==n/2|| i==n || j==n&& i<n/2 || j==0 && i>n/2 ){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");

                    }
                }
                    System.out.println();
            }
        System.out.println();
    }
};
class printThree{
     int n;
printThree(int n1){
        this.n=n1;
    }
    void printsThree(){
            for(int i=0;i<=n;i++){
                for(int j=0;j<=n;j++){
                    if(i==0||i==n/2|| i==n || j==n&& i<n/2 || j==n && i>=n/2 ){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");

                    }
                }
                    System.out.println();
            }
        System.out.println();
    }
};
class printFour{
     int n;
printFour(int n1){
        this.n=n1;
    }
    void printsFour(){
            for(int i=0;i<=n;i++){
                for(int j=0;j<=n;j++){
                    if(j==(n-n/3)||i==n/2||i+j==n/2 && i<=n/2){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");

                    }
                }
                    System.out.println();
            }
        System.out.println();
    }
};
class printFive{
     int n;
printFive(int n1){
        this.n=n1;
    }
    void printsFive(){
            for(int i=0;i<=n;i++){
                for(int j=0;j<=n;j++){
                    if(i==0||i==n/2|| i==n || j==0&& i<n/2 || j==n && i>n/2 ){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");

                    }
                }
                    System.out.println();
            }
        System.out.println();
    }
};
class printSix{
     int n;
printSix(int n1){
        this.n=n1;
    }
    void printsSix(){
            for(int i=0;i<=n;i++){
                for(int j=0;j<=n;j++){
                    if(i==0||j==0||i==n/2|| i==n || j==0&& i<n/2 || j==n && i>n/2 ){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");

                    }
                }
                    System.out.println();
            }
        System.out.println();
    }
};
class printSeven{
     int n;
printSeven(int n1){
        this.n=n1;
    }
    void printsSeven(){
            for(int i=0;i<=n;i++){
                for(int j=0;j<=n;j++){
                    if(i==0||(i+j)-1==n-1){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");

                    }
                }
                    System.out.println();
            }
        System.out.println();
    }
};
class printEight{
     int n;
printEight(int n1){
        this.n=n1;
    }
    void printsEight(){
            for(int i=0;i<=n;i++){
                for(int j=0;j<=n;j++){
                    if(i==0||j==0||i==n/2|| i==n|| j==n){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");

                    }
                }
                    System.out.println();
            }
        System.out.println();
    }
};
class printNine{
     int n;
printNine(int n1){
        this.n=n1;
    }
    void printsNine(){
            for(int i=0;i<=n;i++){
                for(int j=0;j<=n;j++){
                    if(j==0 && i<n/2||i==0||j==n||i==n/2|| i==n || j==n&& i<n/2){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");

                    }
                }
                    System.out.println();
            }
        System.out.println();
    }
};
class T1{
    public static void main(String arg[]){
         Scanner s=new Scanner(System.in);
            int n=s.nextInt();
        printZero z=new printZero(n);
        z.printsZero();
        printOne o=new printOne(n);
        o.printsOne();
        printTwo t=new printTwo(n);
        t.printsTwo();
        printThree th=new printThree(n);
        th.printsThree();
        printFour f=new printFour(n);
        f.printsFour();
        printFive fi=new printFive(n);
        fi.printsFive();
        printSix S=new printSix(n);
        S.printsSix();
        printSeven Se=new printSeven(n);
        Se.printsSeven();
        printEight E=new printEight(n);
        E.printsEight();
        printNine N=new printNine(n);
        N.printsNine();
        
            
    }
}
