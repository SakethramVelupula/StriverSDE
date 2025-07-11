class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a, b)->{
            if(a[0]!=b[0])return a[0]-b[0];
            else return a[1]-b[1];
        });
        List<int[]>result=new ArrayList<>();
        for(int[] interval:intervals) {
            if(result.isEmpty()||result.get(result.size()-1)[1]<interval[0]){
                result.add(interval);
            } 
            else{
                result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1],interval[1]);
            }
        }
        return result.toArray(new int[result.size()][]);

    }
}
