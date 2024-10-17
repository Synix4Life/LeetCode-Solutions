/*
* Runtime: 2ms -> Beats 19.39% of users with Java
* Memory: 45.54MB -> Beats 50.44% of user with Java
*/

class Solution {
    private boolean hasZero(int[] in){
        for(int i=0; i<in.length; i++){
            if(in[i] == 0){
                return true;
            }
        }
        return false;
    }

    public void setZeroes(int[][] matrix) {
        LinkedList<Integer> store = new LinkedList<>();
        for(int i=0; i<matrix.length; i++){
            if(hasZero(matrix[i])){
                for(int j=0; j<matrix[i].length; j++){
                    if(matrix[i][j] == 0){
                        store.add(j);
                    }
                    matrix[i][j]=0;
                }
            }
        }
        for(int k=0; k<store.size(); k++){
            for(int q=0; q<matrix.length; q++){
                matrix[q][store.get(k)]=0;
            }
        }
    }
}