class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>mp=new HashMap<>();
        int i=0,j=0,maxi=0;
        while(j<s.length()){
            char c=s.charAt(j);
            if(mp.containsKey(c)){
                i=Math.max(i,mp.get(c)+1);
                // maxi=Math.max(maxi,j-i+1);
            }
            mp.put(c,j);
            maxi=Math.max(maxi,j-i+1);
            j++;
        }
        return maxi;
    }
}