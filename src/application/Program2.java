package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.TeacherDao;
import model.entities.Teacher;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		TeacherDao teacherDao = DaoFactory.createTeacherDao();

		System.out.println("=== TEST 1: findById =======");
		Teacher dep = teacherDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: findAll =======");
		List<Teacher> list = teacherDao.findAll();
		for (Teacher d : list) {
			System.out.println(d);
		}

		System.out.println("\n=== TEST 3: insert =======");
		Teacher newTeacher = new Teacher(null, "Maria", new Date(), "12345678965", "98756412", "12");
		teacherDao.insert(newTeacher);
		System.out.println("Inserted! New id: " + newTeacher.getId());

		System.out.println("\n=== TEST 4: update =======");
		Teacher dep2 = teacherDao.findById(1);
		dep2.setName("Food");
		teacherDao.update(dep2);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 5: delete =======");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		teacherDao.deleteById(id);
		System.out.println("Delete completed");

		sc.close();
	}
}
