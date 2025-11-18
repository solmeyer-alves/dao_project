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
		
//		System.out.println("\n=== Test 3: Department insert ===");
//		Department newDepartment = new Department(null, "Tools");
//		departmentDAO.insert(newDepartment);
//		System.out.println("Inserted! New Id = " + newDepartment.getId());
			
		System.out.println("\n=== Test 4: Department update ===");
		Department dep2 = departmentDAO.findById(8);
		dep2.setName("Food");
		departmentDAO.update(dep2);
		System.out.println("Update completed!");
			
	}

}
