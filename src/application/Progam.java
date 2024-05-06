package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Progam {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("                      === TEST 1 : seller findById ===");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
        System.out.println();

        Department department = new Department(2, null);

        System.out.println("                      === TEST 2 : seller findByDepartment ===");
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller sellers : list){
            System.out.println(sellers);
        }

        System.out.println("                      === TEST 3 : seller findAll ===");
        List<Seller> list2 = sellerDao.findAll();

        for (Seller sellers : list2){
            System.out.println(sellers);
        }

        System.out.println("                      === TEST 4 : seller insert ===");

        Seller newSeller = new Seller(null, "greg", "greg@gmail.com", new Date(),4000.0, department);

        sellerDao.insert(newSeller);
        System.out.println("Inserted ! new Id : " + newSeller.getId());

        System.out.println("                      === TEST 5 : seller update ===");

        seller = sellerDao.findById(1);
        seller.setName("martha wayne");

        list2 = sellerDao.findAll();

        for (Seller sellers : list2){
            System.out.println(sellers);
        }

        System.out.println("                      === TEST 6 : seller delete ===");
        System.out.println("enter id for delete test :");
        int id = scanner.nextInt();

        sellerDao.deleteById(id);

        System.out.println("Deleye completed !");
        scanner.close();
    }
}
