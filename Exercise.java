public class App {
    public static void main(String[] args) throws Exception {

        char [][] mdArray = {{'1','1','1'},
                             {'1','1','1'},
                             {'1','1','1'}, 
                             {'1','1','1'}};
    

        // Pattern 1
        System.out.println("1. PATTERN 1");
        for (int row = 0; row < mdArray.length; row++) {
            System.out.println(" ");
            System.out.print("row " + row + ": ");
        for (int column = 0; column < 3; column++) {
              if(row %2!=0)
                System.out.print(mdArray[row][column] + " ");
            
            }
        } 
        System.out.println(" ");
        System.out.println(" ");


        // Pattern 2
        System.out.println("2. PATTERN 2");
        for (int row = 0; row < mdArray.length; row++) {

            System.out.println(" ");
            System.out.print("row " + row + ": ");
        for (int column = 0; column < 3; column++) {
            if(row %2==0)
            System.out.print(mdArray[row][column] + " ");
            }
        } 
        System.out.println(" ");
        System.out.println(" ");


        // Pattern 3
        System.out.println("3. PATTERN 3");
        for (int row = 0; row < mdArray.length; row++) {

            System.out.println(" ");
            System.out.print("row " + row + ": ");
        for (int column = 0; column < 3; column++) {
            if(row == 1 || row ==2)
              if (column == 0 || column == 2)
              {
               System.out.print("  ");
              }
              else
              {
                System.out.print(mdArray[row][column] + " ");
              }
            if (row == 0 || row ==3)
            System.out.print(mdArray[row][column] + " ");
            }
        } 
    
        System.out.println(" ");
        System.out.println(" ");


        // Pattern 4
        System.out.println("4. PATTERN 4");
        for (int row = 0; row < mdArray.length; row++) {

            System.out.println(" ");
            System.out.print("row " + row + ": ");
        for (int column = 0; column < 3; column++) {
            if(row == 0 || row == 2)
              if (column == 0 || column == 2)
              {
               System.out.print("  ");
              }
              else
              {
                System.out.print(mdArray[row][column] + " ");
              }
            if (row == 1 || row ==3)
            System.out.print(mdArray[row][column] + " ");
            }
        } 
        System.out.println(" ");
        System.out.println(" ");


        // Pattern 5


        // Get the SUM
        System.out.println("5. SUM");
        int i, j, sum = 0 ;  



        int[][] mdArrayrow = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        for(i = 0; i < mdArrayrow.length; i++)
        {
            for(j = 0; j < mdArrayrow[0].length; j++)

            {
                sum = sum + mdArrayrow[i][j];
            }
        }

            System.out.println ("THE SUM IS: " + sum);

    }

}
