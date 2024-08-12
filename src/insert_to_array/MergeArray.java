package insert_to_array;

import java.util.Arrays;
import java.util.List;

public class MergeArray {
    public static void main(String[] args) {

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m =3;
        int n = 3;
        merge(nums1, m, nums2, n);
    }
    //O(m+n)
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        for(int i = 0; i < m; i++){
//            nums1[i] = nums1[i];
//        }
        for(int j = 0; j < n; j++){
            nums1[m + j] = nums2[j];
        }

        Arrays.sort(nums1);
        for(int num : nums1){
            System.out.print(num + " ");
        }


    }
}
