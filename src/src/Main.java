package src;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] id = {1,2,3};
        String[] nombre = {"Luis","Carlos","María"};
        double[] estatura = {1.72,1.73,1.65};
        
        Object[] objeto = new Object[3];
        
        List<Object[]> alumnos_al = new ArrayList<Object[]>();//JPA-JPQL
        
        for(int i=0; i<id.length; i++) {
            objeto[0] = id[i];
            objeto[1] = nombre[i];
            objeto[2] = estatura[i];
            alumnos_al.add(objeto);
        }
        
        for(int j=0; j<alumnos_al.size(); j++) {
            objeto = alumnos_al.get(j);
            System.out.println("Alumno   : " + (j+1));
            System.out.println("Id       : " + objeto[0]);
            System.out.println("Nombre   : " + objeto[1]);
            System.out.println("Estatura : " + objeto[2]);
        }
    }
    
}
