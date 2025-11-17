package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDAO departmentDAO = DaoFactory.creatDepartmentDAO();

		System.out.println("=== Test 1: Department findById ===");
		Department dep = departmentDAO.findById(3);
		System.out.println(dep);
		

	}

}
