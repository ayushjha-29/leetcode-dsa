class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circle = 0;
        int square = 0;

        for(int i=0 ; i<students.length ; i++){
            if(students[i] == 0){
                circle++;
            }else{
                square++;
            }
        }

        for(int i=0 ; i<sandwiches.length ; i++){
            if(sandwiches[i] == 0 && circle == 0 || sandwiches[i] == 1 && square == 0){
                break;
            }
            
            if(sandwiches[i] == 0 && circle != 0){
                circle--;
            }else if(sandwiches[i] == 1 && square != 0){
                square--;
            }
        }

        return circle + square;
    }
}