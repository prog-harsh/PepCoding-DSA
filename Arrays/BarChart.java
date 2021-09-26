/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print a bar chart representing value of arr a. 

Input -->
4
1
1
3
2

Output -->

                *
                *       *
*       *       *       *

*/

import java.util.*;

class BarChart{

    static int maximum(int n,int[] arr){
        int max = arr[0];
		for(int i=0;i<n;i++){
		    if(arr[i] > max){
		        max = arr[i];
		    }
		}
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int max = maximum(n,arr);
        for(int floor = max; floor >= 1; floor--){
            for (int i = 0; i < n; i++) {
                if(arr[i] >= floor){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        
    }
}