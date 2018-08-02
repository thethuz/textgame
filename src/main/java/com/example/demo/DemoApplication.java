package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		Game game = new Game();
		game.setTuong1(game.khoiTaoTuong());
		game.setTuong2(game.khoiTaoTuong());
		// Tuong t1 = khoiTaoTuong();
		// Tuong t2 = khoiTaoTuong();
		// while (!ketThuc){
		// 	dieukhienT1();
		// 	dieukhienT2();
		// 	ketThuc=kiemTraKetThuc();
		// }
		// ketThuc();
	}


}
