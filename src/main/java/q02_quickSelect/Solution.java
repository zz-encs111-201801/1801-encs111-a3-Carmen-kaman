package q02_quickSelect;

public class Solution {
    public int getAtRank(int[] arr, int rank){
        if (rank > arr.length){
            return 0;
        }else {
//            ArrayList newArr = new ArrayList();
//            for (int a: arr) {
//                newArr.add(a);
//            }
            return rankRecursion(arr,0, arr.length-1, rank);
        }
//        return 0;
    }

    public int rankRecursion(int[] arr, int i, int j, int rank){
        int point = arr[i];
//        ArrayList leftArr = new ArrayList();
//        ArrayList rigthArr = new ArrayList();
        int[] leftArr = new int[arr.length];
        int[] rigthArr = new int[arr.length];
        int r = 0;
        int l = 0;
        for (int k = i+1; k <arr.length ; k++) {
            if (arr[k] < point){
                leftArr[l] = arr[k];
                l++;
            }else {
                rigthArr[r] = arr[k];
                r++;
            }
        }
        if (l == rank){
            return point;
        }else if (l < rank){
            return rankRecursion(rigthArr,0, r-1, rank);
        }else {
            return rankRecursion(leftArr,0, l-1, rank);
        }

//        return 0;
    }
}
