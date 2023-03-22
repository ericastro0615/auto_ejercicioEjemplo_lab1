public class Main {
    public static void main(String[] args) {
        Auto a1 = new Auto ("VNW","ABD12EF" , "gris perla\n" );
        System.out.println(a1);
        a1.avanzar();
        a1.retroceder();
        a1.llenarTanque ();

        //instanciar en menu, y colocar las 4 ruedas
        Rueda r1=new Rueda ();
        r1.desinflar ();
        r1.inflar ();



}
}