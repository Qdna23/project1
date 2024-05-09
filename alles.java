//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int count(String s){
        if(s==null|| s.trim().isEmpty()){
            return 0;
        }
        String[] word= s.trim().split("\\s+");

     return word.length;
    }
    public static String sentence(String s){
        if(s==null|| s.isEmpty()){
            return null;
        }
       String count="";
        for(int i = s.length()-1; i>=0; i--){
            count += s.charAt(i);

        }
        return count;
    }
    public static int vowel(String s ){
        if(s==null|| s.isEmpty()){
            return 0;
        }
        int count=0;
        s= s.toLowerCase();
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='a'|| c=='e'|| c=='i'|| c== 'o'|| c=='u'){
                count++;
            }

        }
        return count;
    }
    public static int quersumme(int zahl){
        int summe=0;
        for(int i =0; i<zahl;i++){
            while(zahl!=0){
                summe+= zahl%10;
                zahl/=10;

            }

        }
        return summe;
    }
    public static boolean primzahl(int zahl){
        if(zahl<=1){
            return false;

        }
        for(int i =2; i<zahl;i++){
            if(zahl%i==0){
                return false;
            }
        }
        return true;
    }
    public static void teiler(int zahl){
        boolean primzahl= false;
        if(zahl<=1){
            System.out.println("Die " +zahl+ " hat nur eine teiler 1 ");
        }
        else if(zahl>=2){
            for(int i =2;i<zahl; i++){
                if(zahl%i==0){
                    System.out.println("Die " + zahl + " hat "+ i+ " teiler ");
                }
                else {
                    primzahl= true;

                }

            }
            if(primzahl){
                System.out.println( zahl+ " ist eine Primzahl");
            }


        }

    }
    public static void main(String[]args){
        System.out.println(count(args[0])+ " worter");
        System.out.println(sentence(args[0])+ " reverse ");
        System.out.println(vowel(args[0])+ " vowel");
       int zahl= Integer.parseInt(args[1]);
        System.out.println(quersumme(zahl));
        boolean primza= primzahl(zahl);
        System.out.println(primza? "ja ": "nein");
        teiler(zahl);
    }


}