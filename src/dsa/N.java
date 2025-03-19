package dsa;

public class N {
    public static void main(String[] args) {
        int [][] matrix =  {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        String bag ="";
        int N=matrix.length;
        for (int i=N-1; i>=0; i--){
            bag += matrix[i][0] + "";
        }

        for (int i=1; i<N; i++){
            bag += matrix[i][i] + "";
        }

        for (int i=N-2; i>=0; i--){
            bag += matrix[i][N-1] + "";
        }

        System.out.println(bag);
    }
}
