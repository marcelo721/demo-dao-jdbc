package model.dao;

import model.dao.impl.SellerDaoJDBC;
import model.entities.Seller;

import java.util.List;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }
}
