class Fraction {
    int num;
    int den;
}

class IntroToObjects {
    public static void main(String[] args) {
        Fraction f = new Fraction();

        f.num = 3;
        f.den = 4;
        f.test = 7;
        
        System.out.println(f.num + " " + f.den );

        f.num--;
        f.den = f.den + 5;

        System.out.println(f.num + " " + f.den);
    }
}