package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void testDosqrt() {
		Scanner sc = new Scanner("4");
		DemoApplication.dosqrt(sc);
		assertEquals(2.0, Math.sqrt(4));
	}
	@Test
	void testDofact() {
		Scanner sc = new Scanner("5");
		DemoApplication.dofact(sc);
		assertEquals(120, 5*4*3*2*1);
	}
	@Test
	void testDolog() {
		Scanner sc = new Scanner("5");
		DemoApplication.dolog(sc);
		assertEquals(1.6094379124341003, Math.log(5));
	}
	@Test
	void testDopow() {
		Scanner sc = new Scanner("2\n3");
		DemoApplication.dopow(sc);
		assertEquals(8.0, Math.pow(2, 3));
	}
}
