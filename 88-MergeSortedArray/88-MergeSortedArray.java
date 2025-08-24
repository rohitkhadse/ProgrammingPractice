// Last updated: 8/24/2025, 12:32:36 PM
class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int copyStartIndex = 0, j = 0;


        if (nums2.length != 0) {
            System.out.println(true);

            for (int i = m; i < nums1.length; i++) {
                nums1[i] = nums2[j];
                j++;
            }
        }

        Arrays.sort(nums1);

        System.out.println(Arrays.toString(nums1));
    }
}
