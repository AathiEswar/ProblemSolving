package ProblemSolving.array;

public class NandDoubleExist {
    public class Solution {
        static boolean check(int[] arr,int x,int i){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[j]==x){
                    return true;
                }
            }
            return false;
        }
        public boolean checkIfExist(int[] arr) {

            for(int i=0;i<arr.length;i++){
                if(arr[i]%2==0){
                    if(check(arr,arr[i]/2,i)){
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
