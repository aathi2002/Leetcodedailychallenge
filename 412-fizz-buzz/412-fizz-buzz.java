class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String>aathi=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0&& i%5==0){
                aathi.add("FizzBuzz");
            }
            else if(i%3==0){
                aathi.add("Fizz");
            }
            else if(i%5==0){
                aathi.add("Buzz");
            }
            else{
                String s=Integer.toString(i);
                aathi.add(s);
            }
            
        }
        return aathi;
        
    }
}