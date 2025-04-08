package application;


import java.util.List;
import java.util.Scanner;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TESTE 1: department findById ===");
		Department department = departmentDao.findById(3);		
		System.out.println(department);
		
		
		
		System.out.println("\n=== TESTE 2: department findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department obj :list) {
			System.out.println(obj);
		}
		
		/*System.out.println("\n=== TESTE 3: department Insert ===");
		Department newDepartment = new Department(null,"Music");
		departmentDao.insert(newDepartment);
		System.out.println("Done! New Id = " + newDepartment.getId());
		
		System.out.println("\n=== TESTE 4: department Update ===");
		department = departmentDao.findById(6);
		department.setName("D3");
		departmentDao.update(department);
		System.out.println("Update Complete");*/
		
		System.out.println("\n=== TESTE 5: department Delete ===");
		System.out.print("Entre com o ID para deleção: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		sc.close();
	}

}

