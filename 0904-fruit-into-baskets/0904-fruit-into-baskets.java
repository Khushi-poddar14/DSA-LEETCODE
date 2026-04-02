class Solution {
    public int totalFruit(int[] fruits) {
        int maxfruits = 0;
        int l = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int r = 0; r < fruits.length; r++){
            mp.put(fruits[r], mp.getOrDefault(fruits[r],0)+1);
            while(mp.size() > 2){
                mp.put(fruits[l], mp.get(fruits[l])-1);
                if(mp.get(fruits[l])==0){
                    mp.remove(fruits[l]);
                }
                l++;
            }
            maxfruits = Math.max(maxfruits, r-l+1);
        }
        return maxfruits;
    }
}