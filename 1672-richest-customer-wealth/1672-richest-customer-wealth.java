class Solution {
    public int maximumWealth(int[][] accounts) {
        int size1=accounts.length;
        int size2=accounts[0].length;
        ArrayList<Integer>aathi=new ArrayList<Integer>();
        for(int i=0;i<size1;i++){
            int sum=0;
            for(int j=0;j<size2;j++){
                //int sum=0;
                sum+=accounts[i][j];
            }
            aathi.add(sum);
        }
        int answer=Collections.max(aathi);
        
    
    return answer;
    }
}