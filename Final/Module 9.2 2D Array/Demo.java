public class Demo {
    public static void main(String[] args) {
        // 1. declaring 2d array
        //double[][] sales = new double[6][5];

        // 2.accessing array elements
        // sales[0][1];

        // 3.assigning value to array elements
        // sales[0][1] = 25.75;
        // sales[0][2] = 56.1;

        // 4. getting the size of the array
        //System.out.println(sales.length);
        //System.out.println(sales[0].length);

        // int sizeOfTheArray = sales.length;

        // int sizeOfTheFirstRowArray = sales[0].length;

        // System.out.println(sales[1].length);

        // 5. Special cases
        // int[][] board = new int[5][];

        // board[0] = new int[6];
        // board[1] = new int[2];
        // board[2] = new int[5];
        // board[3] = new int[3];
        // board[4] = new int[4];

        // System.out.println(board[0][0]);

        // 6. Array initialization during declaration
        // int[][] board = {
        // {2,3,1},
        // {15, 25,13},
        // {20,4,7},
        // {11,18,14}
        // };

        String[][] kasparovMoves = {
                { "d4", "c4", "c3", "e4" },
                { "h3", "e3", "d5", "e2" },
                { "h5", "d2", "e2", "f3" },
                { "b1", "g4", "h4", "f5" }
        };

        // for (int i = 0; i < kasparovMoves.length; i++) {
        //     System.out.println();
        //     for (int j = 0; j < kasparovMoves[i].length; j++) {
        //         System.out.print(kasparovMoves[i][j] + ", ");
        //     }
        // }

        // System.out.println(kasparovMoves[0][0]);

    }
}