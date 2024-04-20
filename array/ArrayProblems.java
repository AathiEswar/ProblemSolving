package ProblemSolving;

import java.util.*;

public class ArrayProblems {
    public static void halfsort(int[] a){
        int len = a.length;
       for(int i=0;i<len;i++){
            if(i<=len/2){
                System.out.println(a[i]+" ");
            }
            else{
                System.out.println(a[len+(len/2)-i]+" ");
            }
            //output :  0 1 2 3 6 5 4
        }
    }

    public static void reverse(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }}
    public static void freqCount(int[] a) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (count.containsKey(a[i])) {
                count.put(a[i], count.get(a[i]) + 1);
            } else {
                count.put(a[i], 1);
            }
        }
        for (Integer I : count.keySet()) {
            System.out.println(I + " : "+ count.get(I));
        }
    }

    public static int BinarySearchArray(int[] a,int searchValue){
        Arrays.sort(a);
        reverse(a);
        System.out.println("Sorted array:" + Arrays.toString(a));
        int low =0;
        int high = a.length-1;
        while(low<=high){
            int middle = (low+high)/2;
            int middleValue = a[middle];

            if(a[low]<a[high]&&searchValue < middleValue  || a[low]>a[high]&&searchValue>middleValue) high = middle-1;
            else if(searchValue == middleValue) return middle;
            else low = middle+1;


        }
        return -1;
    }

    public static int inerpolationSearch(int[] a , int value){
        //best for uniformly distributed values
        //better than binary search if UDV
        Arrays.sort(a);
        int low = 0;
        int high = a.length-1;
        while(low<=high && a[low]<=value && a[high]>=value){
            int probe = low + (high- low) * (value-a[low]) / (a[high] - a[low]);
            System.out.println("The probe is "+probe);

            if(a[probe] == value){
                return probe;
            }
            else if(a[probe]<value){
                low = probe+1;
            }
            else{
                high = probe-1;
            }
        }
        return -1;
    }

    public static void bestFriendPair(){
        int[] a = {0,2,1,3,4,5,7,6};
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=i && i == a[a[i]]){
                count++;
            }
        }
        System.out.println(count/2);
    }
    public static void main(String[] args) {
        int[] a = {2,4,6,7,10,12};
//        halfsort(a);
//        freqCount(a);
//        System.out.println(BinarySearchArray(a,6));
//        System.out.println(inerpolationSearch(a,7));
        bestFriendPair();
    }
}
