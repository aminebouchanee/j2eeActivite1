package org.example.prensentation.dao;


public class DaoImpl implements  IDao
{

    @Override
    public  double getData()
    {
        System.out.println("Base de donnes");
        double temp=23;
        return temp;
    }



}
