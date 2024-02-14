public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] morse = new int[n];

        //calculate Thue-Morse code
        for(int i = 0; i < n; i++){
            morse[0] = 0;
            if ((i%2) == 0){
                morse[i] = morse[i/2];
            }
            else{
                morse[i] = 1 - morse[i-1];
            }
        }
        //Print n-by-n grid
        //Column
        for(int j = 0; j < n; j++){
            //Row
            for(int i =0; i < n; i++){
                if(morse[i] == morse[j]){
                    System.out.print("+  ");
                }
                else{
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}
