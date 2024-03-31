import java.util.*;
class ElementsFrequencyInArray{


 public static void main(String args[]){
 int arr[]={2,3,2,1,3,3,1,3};
 Arrays.sort(arr);

    for(int i=0;i<arr.length;i++){
        int count=1;
        while(i<arr.length-1 && arr[i]==arr[i+1]){
            i++;
            count++;
        }
        System.out.println("The Freq of "+arr[i]+" is "+count++);
    }
   }
}

