package org.example.prensentation.pres;

import org.example.prensentation.dao.IDao;
import metier.IMetier;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName= scanner.nextLine();
        Class cDae=Class.forName(daoClassName);
        IDao dao=(IDao)cDae.newInstance();
        String metierClassName= scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier)cMetier.getConstructor(IDao.class).newInstance(dao);

        System.out.println("RES ="+ metier.calcul());
    }
}
