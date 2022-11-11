public class Exercise {
    public static void main(String[] args) throws Exception {
  
        int[][] mdArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15 ,16}};
    
  
        // PATTERN 1
        int sum1 = 0;
        for (int i = 0; i < mdArray.length; i++) {
            sum1 += mdArray[0][i];
        }
        System.out.println("1. SUM OF PATTERN 1: " + sum1);
    

        // PATTERN 2
        int sum2 = 0;  
        for (int i = 0; i < mdArray.length; i++) {
            sum2 += mdArray[i][0];
        }
        
        System.out.println("2. SUM OF PATTERN 2: " + sum2);
        
        // PATTERN 3
        int sum3 = 0;
        for (int row = 0; row < mdArray.length; row++) {
            for(int column = 0; column < mdArray.length; column++) {
                if(column == 0 || row == 0)
            sum3 += mdArray[row][column];
            }
        }
        System.out.println("3. SUM OF PATTERN 3: " + sum3);
        
        // PATTERN 4
        int sum4 = 0;
        for (int i = 0; i < mdArray.length; i++) {
            sum4 += mdArray[0][1];

            if(i == 1 ) {
                continue;
            }
            if(i == 2) {
                continue;
            }
            sum4 += mdArray[3][0];
        }
        System.out.println("4. SUM OF PATTERN 4: " + sum4);
        

        // PATTERN 5
        int sum5 = 0;
        for (int i = 0; i < mdArray.length; i++) {
            sum5 += mdArray[0][1];

            if(i == 0) {
                continue;
            }
            if(i == 3) {
                continue;
            }
            sum5 += mdArray[3][0];
        }
        System.out.println("5. SUM OF PATTERN 5: " + sum5);
      
        // PATTERN 6
        int sum6 = 0;
        for (int i = 0; i < mdArray.length; i++) {
            sum6 += mdArray[3][2];

            if(i == 1) {
                continue;
            }
            if(i == 2) {
                continue;
            }
            if( i == 2) {
                continue;
            }
            if ( i == 1 ) {
                continue;  
            }
            sum6 += mdArray[0][3];
        }
        System.out.println("6. SUM OF PATTERN 6: " + sum6);
    
    }
}
