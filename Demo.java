//Find the Maximum Number
public class Demo {
    public static void main(String[] args) {
        int[] arr={9,8,25,35,6};
        System.out.println(Max(arr,1,3));
    }
    static int Max(int[] arr,int start,int end){
       int maxVal=start;
       for(int i=start;i<end;i=i+1){
        if(arr[i]>maxVal){
            maxVal=arr[i];
        }
       }
        return maxVal;
    }
