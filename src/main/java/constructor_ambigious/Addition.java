package constructor_ambigious;

public class Addition {
    private int a;
    private int b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("constructor int,int");
    }

    public Addition(double a, double b) {
        this.a =(int) a;
        this.b =(int) b;
        System.out.println("constructor double,double");
    }

    public Addition(String a, int b) {
        this.a =Integer.parseInt(a);
        this.b =b;
        System.out.println("constructor String,int");
    }

    public Addition(String a, String b) {
        this.a =Integer.parseInt(a);
        this.b =Integer.parseInt(b);
        System.out.println("constructor String,String");
    }

    public void dosum() {
        System.out.println( "value of a : " + this.a);
        System.out.println( "value of b : " + this.b);
        System.out.println(this.a + this.b);
    }
}