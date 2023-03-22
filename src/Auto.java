import java.util.ArrayList;
import java.util.Scanner;

public class Auto {
    Scanner sc = new Scanner (System.in);

    private String marca;

    private String patente;

    private String color;

    private double combustible;

    private ArrayList <Rueda> ruedas;

    public Auto(String marca, String patente, String color ) {
        this.marca = marca;
        this.patente = patente;
        this.color = color;
        this.combustible = 50;
        this.ruedas = colocarRuedas ();
    }


    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }


    public double getCombustible() {
        return combustible;
    }

    public ArrayList<Rueda> colocarRuedas (  ){
        ArrayList <Rueda> ruedas= new ArrayList<> ();
        for (int i = 0; i < 4; i++) {
            ruedas.add(new Rueda() );
        }
        return ruedas;
    }



    public void avanzar() {
        //regla de tres: 10m__1 litro
        System.out.println("Cuantos metros desea avanzar?");
        double avanzar = sc.nextInt ();
        double consumo= (avanzar*1)/10;
        if ( (avanzar>0 && avanzar <=500)  & (combustible-consumo>=0)) {
            setCombustible ( this.combustible= this.combustible- consumo );
            //actualizo litros
            System.out.println("Se avanzó "+ avanzar+ "metros. El estado del combustible es: "+ getCombustible()+ " litros. \n" );
        } else {
            System.out.println("Lo lamento, no hay suficiente combustible");
        }
    }


    public void retroceder() {
        System.out.println("Cuantos metros necesita retroceder");
        double retroceder = sc.nextInt ();
        double consumo= (retroceder*1)/100;
        if ( (retroceder>0 & retroceder <=500)  & (getCombustible ()-consumo>=0)) {
            setCombustible ( this.combustible-= consumo  );
            System.out.println("Se retrocedio  "+ retroceder+ "metros. El estado del combustible es: "+ getCombustible()+ " litros." );
            //actualizo litros
        } else {
            System.out.println("Lo lamento, no hay suficiente combustible\n");
        }
    }

    public void llenarTanque() {
        System.out.println("Desea llenar el tanque de combustible? si / no \n");
        if (sc.next().equalsIgnoreCase("si")){
            setCombustible(50);
        }else {
            System.out.println("Solo se admite cargar el tanque completo\n");
        }

    }

    @Override
    public String toString() {
        return "Auto \t" + "marca=" + marca + ", \t patente=" + patente + ",\t color=" + color + ", combustible="+ combustible +'\n'   ;
    }




}
