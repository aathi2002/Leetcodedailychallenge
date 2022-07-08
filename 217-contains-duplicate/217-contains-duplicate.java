class Solution {
    public boolean containsDuplicate(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     return true;
//                     //break;
//                 }
//             }
//         }
        
//         return false;
        LinkedHashSet<Integer>aathi=new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            aathi.add(nums[i]);
            
        }
        if(aathi.size()==nums.length){
            return false;
        }
        return true;
    }
}