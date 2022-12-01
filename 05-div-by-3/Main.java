class Main {
  public static void main(String[] args) {
    divBy3("123456765432");
  }

  public static void divBy3 (String num){
    int len = num.length();
    int sum = 0;
    for(int i = 0; i <len; i ++){
      String one = num.substring(i, i+1);
      sum += Integer.parseInt(one);
      
    }
    if( (sum%3) == 0){
        System.out.println(" Number is divisable by zero");
      }
      else{
        System.out.println("Number is not divisable by zero");
      }
  }
}
