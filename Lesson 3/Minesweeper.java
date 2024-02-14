public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        int mines = 0;

        boolean[][] contains_mine = new boolean[m + 2][n + 2];
        int[][] neighbour_mine = new int[m + 2][n + 2];

        //Places mines in boolean array
        while (mines < k) {
            int random_x = (int) (1+Math.random() * m);
            int random_y = (int) (1+Math.random() * n);
            if(!contains_mine[random_x][random_y]){
                contains_mine[random_x][random_y] = true;
                mines++;
            }
        }

        // calculates the amount of mines within 1 cell range
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if(!contains_mine[i][j]){
                    int temp_mines = 0;
                    //checks diagonal left and diagonal right
                    for(int check_x = i - 1; check_x <= i + 1; check_x++){
                        //checks 1 row above to 1 row below
                        for(int check_y = j - 1; check_y <= j + 1; check_y++){
                            if(contains_mine[check_x][check_y]){
                                temp_mines++;
                            }
                        }
                    }
                    neighbour_mine[i][j] = temp_mines;
                }
                else{
                    neighbour_mine[i + 1][j + 1] = -1;
                }
            }
        }

        //prints the output
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (contains_mine[i][j]) {
                    System.out.print("*" + "  ");
                }
                else {
                    System.out.print(neighbour_mine[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
}
