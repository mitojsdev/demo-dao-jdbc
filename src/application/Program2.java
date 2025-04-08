package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

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
		
		System.out.println("\n=== TESTE 3: department Insert ===");
		Department newDepartment = new Department(null,"Music");
		departmentDao.insert(newDepartment);
		System.out.println("Done! New Id = " + newDepartment.getId());
		
		/*System.out.println("\n=== TESTE 5: seller Update ===");
		seller = sellerDao.findById(1);
		seller.setName("Marta Whaine");
		sellerDao.update(seller);
		System.out.println("Update Complete");
		
		System.out.println("\n=== TESTE 6: seller Delete ===");
		System.out.print("Entre com o ID para deleção: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");
		sc.close();*/
	}

}

