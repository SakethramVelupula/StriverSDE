class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0,count2=0;
        int majority1=0,majority2=0;
        for (int num : nums) {
            if (num == majority1) {
                count1++;
            } else if (num == majority2) {
                count2++;
            } else if (count1 == 0) {
                majority1 = num;
                count1++;
            } else if (count2 == 0) {
                majority2 = num;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        List<Integer>result=new ArrayList<>();
        int t=nums.length/3;
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++){
            if(majority1==nums[i]){
                count1++;
            } 
            else if(majority2==nums[i]){
                count2++;
            }
        }
        if(count1>t){
            result.add(majority1);
        }
        if(count2>t){
            result.add(majority2);
        }

        return result;
    }
}