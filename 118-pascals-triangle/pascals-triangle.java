class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        if(numRows==0){
            return result;
        }
        ArrayList<Integer>firstrow=new ArrayList<>();
        firstrow.add(1);
        result.add(firstrow);
        if(numRows==1){
            return result;
        }
        for(int i=1;i<numRows;i++){
            List<Integer>prevrow=result.get(i-1);
            ArrayList<Integer>newrow=new ArrayList<>();
            newrow.add(1);
            for(int j=0;j<i-1;j++){
                newrow.add(prevrow.get(j)+prevrow.get(j+1));
            }
            newrow.add(1);
            result.add(newrow);
        }
        return result;
    
    }
}