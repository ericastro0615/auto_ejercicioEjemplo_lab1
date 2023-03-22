import java.util.ArrayList;

public class Rueda {
    private String marca="Pichelin";

    private double presion=28 ;

    //public Rueda() {
   // }


    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }


    public void inflar() {
        if (presion < 28 ) {
            System.out.printf("La rueda tiene una presión de ", getPresion() , "PSI\n"
                    + " Es necesario inflarla" );
            setPresion(28);
        } else {
            System.out.println("No hace falta inflar la rueda. La presion es de " + getPresion());
        }
    }

    public void desinflar() {
        System.out.println("La rueda se esta desinflando. La nueva presion de la rueda es "+ (getPresion()-0.25) + "PSI");
    }


    @Override
    public String toString() {
        return "Rueda " +
                "marca='" + marca + '\'' +
                ",\t presion=" + presion  + '\n';

    }
}
