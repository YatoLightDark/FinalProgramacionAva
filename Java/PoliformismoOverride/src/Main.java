class Padre {
    private   void m1() {
        System.out.println("Desde el padre el m1()!");
    }
    protected    void m2() {
        System.out.println("Desde el padre el m2()!");
    }
}
class Hija extends Padre{
    @Override
    protected void m2(){
        System.out.println("Desde la Hija m2()");
    }
}

public class Main{
    public static void main(String[] args){
        Padre padre= new Padre();
        Padre hija = new Hija();
        padre.m2();
        hija.m2();
    }
}