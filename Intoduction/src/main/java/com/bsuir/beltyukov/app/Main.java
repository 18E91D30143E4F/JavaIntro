package main.java.com.bsuir.beltyukov.app;

import java.util.ArrayList;

import main.java.com.bsuir.beltyukov.classes.basket.Ball;
import main.java.com.bsuir.beltyukov.classes.basket.Basket;

public class Main {

	public static void main(String[] args) {		
		Ball ball1 = new Ball(15.2, "Белый");
		Ball ball2 = new Ball(4, "Красный");
		Ball ball3 = new Ball(12, "Серый");
		Ball ball4 = new Ball(3, "Черный");
		
		ArrayList<Ball> ballList = new ArrayList<Ball>();
		ballList.add(ball1);
		ballList.add(ball2);
		ballList.add(ball3);
		ballList.add(ball4);
		
		Basket basket = new Basket(ballList);
		System.out.println("Содержимое корзины: ");
		for(Ball ball : basket.getBallList()) {
			System.out.println(ball);
		}
		
		System.out.printf("Размер корзины: %f\n", basket.getBasketWeight());
	}
}
