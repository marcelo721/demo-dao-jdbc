package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Progam {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("                      === TEST 1 : seller findById ===");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
        System.out.println();

        Department department = new Department(2, null);

        System.out.println("                      === TEST 1 : seller findByDepartment ===");
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller sellers : list){
            System.out.println(sellers);
        }

    }
}
