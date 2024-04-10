package Questions_nd_CONCEPTS.I3I_2D_Array;

public class TransposeMatrix {

    public int[][] transpose(int[][] A) {

        int R = A.length, C = A[0].length;
        int[][] B = new int[C][R];

        for(int i = 0; i < R; i++)
            for(int j = 0; j < C; j++)
                B[j][i] = A[i][j];

        return B;
    }
}
