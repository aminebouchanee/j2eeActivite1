
package org.example.prensentation.pres;

import org.example.prensentation.dao.DaoImpl;
import org.example.prensentation.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        System.out.println("RES="+metier.calcul());
    }
}
