//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    static int pow(int x, int p){
        int res=1;
        for(int i=0;i<p;i++){
            res*=x;
        }
        return res;

    }
    public static void arraychange(int[]a){
        a[0]=42;

    }
    public static void numberchange(int a){
        a =42;
    }

    public static void main(String[]args){
      int[]a1={1,2,3};
      int b= 1;
      arraychange(a1);
      numberchange(b);
        System.out.println(a1[0]+ " und "+ b);

        int base = Integer.parseInt(args[0]);
        int exponent= Integer.parseInt(args[1]);
        System.out.println(pow(base,exponent));


    }

}