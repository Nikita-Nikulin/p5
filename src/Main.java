public class Main {
    public static void main(String[] args) {
        int a ;
        Dishes.Plate WhiteWooden = new Dishes.Plate("White","Wooden",10.2);
        System.out.println(WhiteWooden.toString());

        Dishes.Knife BlackPlastic = new Dishes.Knife("Black", "Plastic",13.3);
        System.out.println(BlackPlastic.toString());

        Dogs.Pitbul Boss = new Dogs.Pitbul(4,43,"adult", "Boss");
        System.out.println(Boss.toString());
        a = Boss.AgeCalc() ;
        System.out.println("Human equal age of Boss = " + a);

        Dogs.Huskie Zeus = new Dogs.Huskie(1,33,"teen","Zeus", "Happy");
        System.out.println(Zeus.toString());
        
    }
}
