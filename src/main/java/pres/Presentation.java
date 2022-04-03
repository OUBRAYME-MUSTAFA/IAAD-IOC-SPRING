package pres;

import ext.daoImpl2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] arg)
    {
        /**
         * Injection de dependance par
         * instanciation statique => new
         */
        daoImpl2 dao = new daoImpl2();
        MetierImpl metier = new MetierImpl(dao);
        //metier.setDao(dao);

        System.out.println("*********instanciation Statique******");
        System.out.println("res = "+metier.calcul());
    }
}