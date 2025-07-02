import java.util.Arrays;
//This is Default sorting Method
class sample{
    public static void main(String[] args){
        int[] arr={7,9,20,15,3};
        String[] arr_1={"C","Python","Java","C++","JS","HTML","Css"};
        System.out.println("Original Array:"+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted Array:"+Arrays.toString(arr));
        System.out.println("Original Array:"+Arrays.toString(arr_1));
        Arrays.sort(arr_1);
        System.out.println("Original Array:"+Arrays.toString(arr_1));
    }
}
