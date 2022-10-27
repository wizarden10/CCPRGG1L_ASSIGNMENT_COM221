public class Exercise {
  public static void main(String[] args) throws Exception {

      int[][] mdArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15 ,16}};
  

      // PATTERN 1
      int pattern_one = mdArray[0][0] + mdArray[0][1] + mdArray[0][2]  + mdArray[0][3]; 
      System.out.println("1. SUM OF PATTERN 1 " + " " + pattern_one);
      
      // PATTERN 2
      int pattern_two = mdArray[1][0] + mdArray[1][1] + mdArray[1][2]  + mdArray[1][3]; 
      System.out.println("");
      System.out.println("3. SUM OF PATTERN 2 " + " "  + pattern_two);
      
      // PATTERN 3
      int pattern_three = mdArray[2][0] + mdArray[2][1] + mdArray[2][2]  + mdArray[2][3]; 
      System.out.println("");
      System.out.println("3. SUM OF PATTERN 3 " + " "  + pattern_three);
      
      // PATTERN 4
      int pattern_four = mdArray[3][0] + mdArray[3][1] + mdArray[3][2]  + mdArray[3][3]; 
      System.out.println("");
      System.out.println("4. SUM OF PATTERN 4 " + " "  + pattern_four);
      
      // PATTERN 5
      int pattern_five = mdArray[1][1] + mdArray[1][2] + mdArray[2][1]  + mdArray[2][2]; 
      System.out.println("");
      System.out.println("5. SUM OF PATTERN 5 " + " "  + pattern_five);
    

      // PATTERN 6
      int pattern_six = mdArray[0][0] + mdArray[0][3] + mdArray[1][1]  + mdArray[1][2] + mdArray[2][1] + mdArray[2][2] + mdArray[3][0] + mdArray[3][3] ; 
      System.out.println("");
      System.out.println("6. SUM OF PATTERN 6 " + " "  + pattern_six );
  }
}
