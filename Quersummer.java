//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Quersummer {
    public static boolean primzahl(int zahl1){

        if(zahl1<=1) {
            return false;
        }
        if(zahl1>2){
            for(int i =2;i<zahl1;i++){
                if(zahl1%i==0){
                    return false;
                }
            }

        }










        return true;
    }
    public static int q1(int zahl){
        int summe=0;
        while(zahl!=0){
            summe += zahl%10;
            zahl/=10;

        }
        return summe;


    }
    public static void main(String[]args){
        int zahl= Integer.parseInt(args[0]);
        int summe= q1(zahl);
        System.out.println(summe);

        System.out.println("Prüfen ob die zahl primzahl ist oder nicht?");
        int zahl2= Integer.parseInt(args[1]);
        boolean prim = primzahl(zahl2);
        System.out.println(prim? "ja":"nein");


    }
}