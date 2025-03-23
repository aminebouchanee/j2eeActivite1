package org.example.prensentation.ext;

import org.example.prensentation.dao.IDao;

public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("WebService");
        return 41;
    }
}
