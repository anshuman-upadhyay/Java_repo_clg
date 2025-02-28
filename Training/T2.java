class bubSort{
    int[] arr;
    bubSort(int[] a1){
        arr=a1;
    }
    void Sortarr(){
         for(int i=0;i<arr.length;i++){
                for(int j=i;j<arr.length;j++){
                    if(arr[i]>arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
          
    }
    void printarr(){
          for(int num: arr){
                System.out.println(num);
            }
    } 
}
class avge{
    int[] arr;
    avge(int []a){
        arr=a;
    }
    int avger(){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int average=sum/arr.length;
        return average;
    }
}

class T2{ 
        public static void main(String args[]){
            int[] arr={3,7,8,2,5,6,4}; 
            int[] arr1={3,7,8,2,5,6,4}; 
            bubSort b=new bubSort(arr);
            b.Sortarr();
            b.printarr();
            avge av=new avge(arr);
            int ave=av.avger();
            System.out.println("The average of all element in the array is "+ave);
            //print the elements greater than average
            for(int num: arr){
                if(num>ave){
                    System.out.println("The element in arr :" +num);
                }

            }
    }
}
