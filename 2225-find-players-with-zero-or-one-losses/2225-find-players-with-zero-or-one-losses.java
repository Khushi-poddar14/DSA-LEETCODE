class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i < matches.length; i++){
            int loser = matches[i][1];
            mp.put(loser,mp.getOrDefault(loser,0)+1);
        }
        ArrayList<Integer> notLost = new ArrayList<>();
        ArrayList<Integer> lostOnce = new ArrayList<>();
        for(int i = 0; i < matches.length; i++){
            int winner = matches[i][0];
            int loser = matches[i][1];
            if(!mp.containsKey(winner)){
                notLost.add(winner);
                mp.put(winner,2);
            }
            if(mp.get(loser)==1){
                lostOnce.add(loser);
            }
        }
        Collections.sort(notLost);
        Collections.sort(lostOnce);
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(notLost);
        arr.add(lostOnce);
        return arr;
    }
}