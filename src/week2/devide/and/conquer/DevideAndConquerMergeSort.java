package week2.devide.and.conquer;

public class DevideAndConquerMergeSort {

  public static void main(String[] args) {

    // TODO Auto-generated method stub

    int[] a = new int[] {10,5,2,99,7,2,5,80,100,90,88,84,91};
    int s =0, l = a.length;
    System.out.println(" Before sorting");
    for(int x :a)
      System.out.print(x+" ");
    System.out.println(" ");
    int [] c = sort(a,s,l-1);
    System.out.println(" After sorting");
    for(int y :c)
      System.out.print(y+" ");
  }
  /* index i is the begin point, index e is the end point
   * */
  private static int[] sort(int[] a, int i, int e) {
    // TODO Auto-generated method stub
    if(e-i==1) {
     return a[e]>a[i]?new int[] {a[i], a[e]}:new int[] {a[e], a[i]};
    }else if(e-i==0) {
      return new int[] {a[i]};
    }

    int[] x = sort(a,i,(i+e)/2);
    int[] y = sort(a,(i+e)/2+1,e);

    return merge(x,y);
  }

  private static int[] merge(int[] x, int[] y) {
    // TODO Auto-generated method stub
    int x_len = x.length;
    int y_len = y.length;
    int d_len = x_len + y_len;
    int []d = new int[d_len];
    int l =0, m=0;

    for(int j=0;j<d_len ;j++) {

        if(l<x_len && m<y_len && x[l]<=y[m] ) {
          d[j] = x[l];
          l++;
        }else if(m<y_len && l<x_len && x[l]>y[m]) {
          d[j] = y[m];
          m++;
        } else if(l==x_len && m<y_len ) { //&& x[l-1]<y[m]
          d[j] = y[m];
          m++;
        } else if(l<x_len && m==y_len ) { // && x[l]>y[m-1]
          d[j] = x[l];
          l++;
        }

      }

    return d;
  }

}
