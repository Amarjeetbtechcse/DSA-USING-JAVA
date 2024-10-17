public class spiralMatrix {
    public static printSpiral(int matrix[][]){
        int matrix[][] = new int[4][4];
        int m = matrix.length, n= matrix[0].length;
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j= startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+ " ");
            }

            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            //bottom
            for(int j=endCol -1; j>=startCol; j--){
                System.out.print(matrix[endRow][j]+" ");
            }

            //left
            for(int i=endRow-1; i>=startRow +1; i--){
                System.out.print(matrix[i][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] =    {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
    }
}
// if n= odd then SR<ER AND SC<EC MEANS CENTER PART NOT PRINT SO WE KEEP EQUAL TO SIGN AND LESS THAN IN CODE 

// YAHA PAR && LAGANA PADA KYUKI HM N*M MATRIX BHI KAR SAKE 

// WHEN N*N IS ODD THEN POSSIBLE IF WE NOT EQUAL TO USE THEN NOT PRINT OR SOME TIME 
