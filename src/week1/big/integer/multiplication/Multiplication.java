package week1.big.integer.multiplication;

import java.math.BigInteger;

public class Multiplication {

  private BigInteger ten = BigInteger.valueOf(10);

  public BigInteger multiplyBigInteger(BigInteger x, BigInteger y) {
    int x1 = x.toString().length();
    int y1 = y.toString().length();
    if (x1==1 && y1==1) {
      return x.multiply(y);
    }

    int l = Math.max(x1, y1);

    BigInteger pow = ten.pow(l/2);
    BigInteger a = x.divide(pow);
    BigInteger b = x.mod(pow);
    BigInteger c = y.divide(pow);
    BigInteger d = y.mod(pow);


    BigInteger ac = multiplyBigInteger(a,c);
    BigInteger bd = multiplyBigInteger(b,d);
    BigInteger abcd = multiplyBigInteger(a.add(b),c.add(d));
    BigInteger mid = abcd.subtract(ac).subtract(bd);

    System.out.println("ac="+ac+", bd="+bd+", abcd="+abcd+", mid="+mid );

   BigInteger result = ac.multiply(pow.pow(2)).add(mid.multiply(pow)).add(bd);
   return result;

  }


}
