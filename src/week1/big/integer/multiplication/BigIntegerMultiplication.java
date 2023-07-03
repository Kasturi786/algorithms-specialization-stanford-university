package week1.big.integer.multiplication;

import java.math.BigInteger;

public class BigIntegerMultiplication {

  public static void main(String[] args) {

    String x = "3141592653589793238462643383279502884197169399375105820974944592";
    String y = "2718281828459045235360287471352662497757247093699959574966967627";
    Multiplication multiplication = new Multiplication();
    BigInteger result = multiplication.multiplyBigInteger(new BigInteger(x), new BigInteger(y));
    System.out.println(">>Required result>>,"+result);


  }

}
