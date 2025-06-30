//check if the array is  sorted or not? if the array is sorted return true else print false
class Sample{
  static boolean isSorted(int[] arr,int n){
    for(int i=1;i<n;i++){        //we initialize i=1 because we want to check the previous element
      if(arr[i]<arr[i-1]){       //in this case i=1 we compare 1<0 this is wrong so the loop traversed and we checked each element is smaller than the previous element if yes return false else true
        return false;
      }
    }
    return false;
  }
  public static void main(String[] args){
    int[] arr={1,2,3,4,5};
    int n=5;
    System.out.println(isSorted(arr,n));
      }
}
