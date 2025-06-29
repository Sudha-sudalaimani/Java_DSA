//Move the Zeros ex:[12,3,4,0,0]
class one{
    public static void main(String[] args){
        int[] nums={0,1,0,3,12};
        moveZeros(nums);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
    public static void moveZeros(int[]arr){
        int index=0;//pointing the first element of the array
        for(int i=0;i<arr.length;i=i+1){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
         for(int i=index;i<arr.length;i++){
            arr[i]=0;
         }
    }
}
