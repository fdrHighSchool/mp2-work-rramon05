class Main {
  public static void main(String[] args) {
    System.out.println(leapYear(2022));
    System.out.println(leapYear(2000));
    System.out.println(leapYear(1900));
    System.out.println(leapYear(1600));
  }
  public static Boolean leapYear(int year){
    boolean result = false;
    if ( (year % 4) == 0 ){
      if( (year % 100) == 0){
        if( (year % 400) == 0){
          return result = true;
        }//Closes mod 400
        else{
          return result;
        }
      }//Closes mod 100
      else{
        return result = true;
      }
    }//Closes mod 4
    else{
      return result;
    }
  }
}
