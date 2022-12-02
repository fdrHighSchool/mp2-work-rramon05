class Main {
  public static void main(String[] args) {
    System.out.println("Shapes!");
    square(5);
    System.out.println("");
    rectangle(2,4);
    System.out.println("");
    rightTriangle(4);
  }
  public static void square(int s){
    for ( int i = 0; i < s; i++){
      for ( int col = 0; col < s; col ++){
       System.out.print("* "); 
      }
      System.out.println("");
    }
  }
  public static void rectangle(int row, int col){
    for (int i = 0; i < row; i++ ){
      for (int t = 0; t < col; t++){
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
  public static void rightTriangle(int row){
    for(int i =1; i <= row; i++){
      for(int j = 1; j<= i; j++){
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
}
