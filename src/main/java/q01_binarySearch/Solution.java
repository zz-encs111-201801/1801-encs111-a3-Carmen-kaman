package q01_binarySearch;

public class Solution {
    public boolean contains(int[] arr, int value){
        if (arr.length == 0){
            return false;
        }else if (arr.length == 1){
            return arr[0] == value ? true : false;
        }else if (arr.length == 2){
            int flag = 0;
            for (int a : arr) {
                if (a == value){
                    flag++;
                }
            }
            return flag == 0 ? false : true;
        }else {
            return binarySearch(arr,0,arr.length-1,value);
        }
    }
    public boolean binarySearch (int[] arr, int i, int j, int value){
        if (j-i == 0){
            return arr[j] == value ? true : false;
        }else if (j-i == 1){
            int flag = 0;
            for (int a : arr) {
                if (a == value){
                    flag++;
                }
            }
            return flag == 0 ? false : true;
        }else {
            int mid = (i + j)/2;
            if (arr[mid] == value){
                return true;
            }else if (arr[mid] > value){
                return binarySearch(arr, i, mid, value);
            }else {
                return binarySearch(arr, mid+1, j, value);
            }
        }
//        return  false;
    }
}
