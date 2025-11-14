package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		
		
		SellerDAO sellerDAO = DaoFactory.createSellerDAO();
		
		System.out.println("=== TEST 1: findById ===");
		Seller seller = sellerDAO.findById(2);
		System.out.println(seller);

		System.out.println("\n=== TEST 2: findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDAO.findByDepartment(department);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
	}

}
