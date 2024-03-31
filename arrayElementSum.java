import util.java.*;
class arrayElementSum{
  public static void main(String args[]){

   int arr[]={2,4,20,6};
   int sum=0;
   for(int num:arr){
    sum+=num;
   }
   System.out.println("Sum of the Elements of an Array is "+sum);
}
}