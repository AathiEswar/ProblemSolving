package ProblemSolving.BinarySearch;

public class CountOfOccurence {
    public int countOfOccurence(int[] arr , int x ){
        int[] res = {-1 , -1};

        res[0] = countHelper(arr , x , true);

        if(res[0] != -1){
            res[1] = countHelper(arr , x , false);
        }else{
            return 0;
        }

        return res[1] - res[0] + 1;
    }

    public int countHelper(int[] arr , int target , boolean isFirst){
        int start = 0;
        int end = arr.length-1;

        int ans = -1;

        while(start <= end ){
            int mid = start + (end - start ) /2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if ( arr[mid] < target){
                start = mid + 1;
            }
            else{
                ans = mid ;

                if(isFirst){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
