package main.java.com.bsuir.beltyukov.app;

import java.util.ArrayList;

import main.java.com.bsuir.beltyukov.classes.basket.Ball;
import main.java.com.bsuir.beltyukov.classes.basket.Basket;

public class Main {

	public static void main(String[] args) {		
		Ball ball1 = new Ball(15.2, "�����");
		Ball ball2 = new Ball(4, "�������");
		Ball ball3 = new Ball(12, "�����");
		Ball ball4 = new Ball(3, "������");
		
		ArrayList<Ball> ballList = new ArrayList<Ball>();
		ballList.add(ball1);
		ballList.add(ball2);
		ballList.add(ball3);
		ballList.add(ball4);
		
		Basket basket = new Basket(ballList);
		System.out.println("���������� �������: ");
		for(Ball ball : basket.getBallList()) {
			System.out.println(ball);
		}
		
		System.out.printf("������ �������: %f\n", basket.getBasketWeight());
	}
}
