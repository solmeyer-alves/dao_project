package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDAO departmentDAO = DaoFactory.creatDepartmentDAO();

		System.out.println("=== Test 1: Department findById ===");
		Department dep = departmentDAO.findById(3);
		System.out.println(dep);
		
		System.out.println("\n=== Test 2: Department listAll ===");
		List<Department> list = departmentDAO.findAll();
			for(Department d : list) {
				System.out.println(d);
			}
		
	}

}
