class Main {
  public static void main(String[] args) {
    fizzBuzz(15);
  }
  public static void fizzBuzz(int num){
    String result = "";
    if((num%3 == 0) && (num %5 ==0)){
      result += "FizzBuzz";
      }
    else{
      if( num%3 ==0){
        result+= "Fizz";
      }
      else{
        if(num%5 ==0){
          result += "Buzz";
        }
        else{
          result+= num;
        }
      }
    }
    System.out.println(result);
  }
}
