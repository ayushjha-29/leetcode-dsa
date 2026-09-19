class Solution {

    public List<Integer> generateRow(int n){
        long result = 1 , num = n;
        List<Integer> row = new ArrayList<>();

        row.add((int)result);

        for(int i=1 ; i<=n ; i++){
            result*=num;
            result/=i;
            row.add((int)result);
            num--;
        }

        return row;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        for(int i=0 ; i<numRows ; i++){
            pascalTriangle.add(generateRow(i));
        }

        return pascalTriangle;
    }
}