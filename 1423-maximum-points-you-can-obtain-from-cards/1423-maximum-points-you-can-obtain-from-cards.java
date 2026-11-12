class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxScore = 0;

        for(int i=0 ; i<k ; i++){
            maxScore+=cardPoints[i];
        }

        int score = maxScore;
        int left = k-1;

        int n = cardPoints.length;

        for(int i=n-1 ; i>=n-k ; i--){
            score-=cardPoints[left--];
            score+=cardPoints[i];

            maxScore = Math.max(maxScore , score);
        }

        return maxScore;
    }
}