class Solution {
    public int reverse(int x) {
        String s=""+x;
        StringBuilder res=new StringBuilder();
        res.append("");
        if(s.charAt(0)=='-')
        {
            res.append("-");
            for(int i=s.length()-1;i>=1;i--)
                res.append(s.charAt(i));
        
        }
        else
        {
            for(int i=s.length()-1;i>=0;i--)
                res.append(s.charAt(i));
           
        }
        try{
        return Integer.parseInt(res.toString());
        }
        catch(Exception e)
        {
            return 0;
        }
        
        }
}