public class Matriks {
    public static void main(String[] args) {
        int[][] matriksA = {{2, 1}, {4, 6}, };
        int[][] matriksB = {{1, 5}, {2, 3}, };
        
        for ( int i = 0; i < matriksA.length; i++){
            for ( int j = 0; j < matriksB.length; j++){
                int hasil = matriksA[i][j] + matriksB[i][j];
                System.out.print(hasil + " " + "\t");
            }
            System.out.println();
        }
    }
}