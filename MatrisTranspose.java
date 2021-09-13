public class MatrisTranspose {
    public static void main(String[] args) {
        int[][] orji = new int[2][3];
        int number = 2;
        int tempNumber = 2;
        int[][] transpose = new int[3][2];

        System.out.println("Matris : ");

        //ASIL diziyi yazdıran>
        for (int i = 0; i < orji.length; i++){
            for (int j = 0; j < orji[i].length; j++){
                orji[i][j] = number++;
                System.out.print(orji[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------");
        
        System.out.println("Transpose : ");

        //TRANSPOSE diziyi yazdıran>
        for (int i = 0; i < transpose.length; i++){
            for (int j = 0; j < transpose[i].length; j++){
                transpose[i][j] = orji[j][i];
                transpose[i][j] = tempNumber++;
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }


    }
}
