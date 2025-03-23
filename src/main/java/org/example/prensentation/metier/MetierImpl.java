package org.example.prensentation.metier;

import org.example.prensentation.dao.IDao;
import org.example.prensentation.metier.IMetier;
public class MetierImpl implements IMetier {
    private IDao dao;
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {}

    @Override
    public  double calcul()
    {
        double t= dao.getData();
        return t*976;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
