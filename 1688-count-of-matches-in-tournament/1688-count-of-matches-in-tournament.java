class Solution {
    public int numberOfMatches(int n) {
        // Har match → 1 team eliminate
        // Final me 1 winner bachta hai
        // Total matches = n-1;

        // Code I
        // return n-1;


        // Code II
        int matches = 0;
        while(n > 1){
            if(n % 2 == 0){
                matches += n/2;
                n = n/2;    // itni no. of teams will go to play in next round
            }
            else{
                matches += (n-1) / 2;
                n = ((n-1)/2)+1;    // itni no. of teams will go to play in next round
            }
        }
        return matches;
    }
}