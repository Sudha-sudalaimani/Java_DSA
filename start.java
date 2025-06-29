//2D Array
import java.util.*;
public class start{
    public static void main(String[] args){
        /*
          int[][] arr={ {1,2,3},
                        {4,5,6},
                        {7,8,9}
          }
         */
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        
        for(int row=0;row<arr.length;row=row+1){ 
            for(int col=0;col<arr[row].length;col=col+1){
                arr[row][col]=sc.nextInt();
            }
        }
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
