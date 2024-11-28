package threed_array;

public class Main {

    public static void main(String[] args){
        
        int num[][][] = new int[3][4][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 2; k++) {
                    num[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        System.out.println("\nUsing enhanced for loop:");
        // Display the 3D array using an enhanced for loop
        for (int[][] matrix : num) {
            for (int[] row : matrix) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
