class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i< nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    list.add(nums1[i]);
                }
            }
        }
        int len = list.size();

        int[]nums3 = new int[len];
        for(int i=0; i<len; i++){
            nums3[i] = list.get(i);
        }

        return Arrays.stream(nums3)
                        .distinct()
                        .toArray();
    }
}