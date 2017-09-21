class SwitchDemo {

    static void switchExample() {
    System.out.println("\nInside switchExample ...");
    int month = 3;
    switch (month) {
        case 1: System.out.println("January");
                break;
        case 2: System.out.println("February");
                break;
        case 3: System.out.println("March");
                break;
        default: System.out.println("April");
    }
  }

  static int min(int x, int y) {
    return (x<y) ? x : y;
   
  }

  public static void main(String[] args) {  
      // Language Basics 1
      //print();                
      //primitives();
      //typeCasting();
      //arrays();   
      //threeDimensionalArrays();   
      /*varargsOverload(true, 1, 2, 3);
      varargsOverload(true, 1, 2, 3, 4, 5, 6, 7, 8);      
      varargsOverload(true);*/
      //charTypePromotion();
      //bitwiseOperators();
      int min = min(9,8);
      System.out.println(min);
      switchExample();
    } 
    
}