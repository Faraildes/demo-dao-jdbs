package application;

import java.util.Date;

import model.entities.Teacher;

public class Program {

	public static void main(String[] args) {
		Teacher obj = new Teacher(1, "Francisco", new Date(), "45612378945", "987456123", 12000.00);
		System.out.println(obj);

	}

}
