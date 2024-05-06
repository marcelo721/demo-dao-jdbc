package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Progam {

    public static void main(String[] args) {

        Department obg = new Department(1,"Books");
        Seller seller= new Seller(21, "bob", "bob@gmail.com", new Date(), 3000.0, obg);

        SellerDao sellerDao = DaoFactory.createSellerDao();
    }
}
