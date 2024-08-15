package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program1 {

	public static void main(String[] args) {
				
		SellerDao sellerDao = DaoFactory.createSellerDao(); 
		
		System.out.println("----TEST 1: seller findById----- ");
		Seller seller = sellerDao.findById(2);		
		System.out.println(seller);
		
		System.out.println("\n----TEST 2: seller findByDepartmentId ----- ");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.finByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n----TEST : seller findByAll ----- ");		
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
	} 
}
