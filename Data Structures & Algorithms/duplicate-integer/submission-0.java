class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        java.util. HashMap <Integer , Boolean> map = new HashMap<>();

        for(int i: nums){

                if(map.containsKey(i))

                return true;

                map.put(i, true);
        }
        return false;

    }
}