package javaoop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import chapter5.Quadrilateral;

class QuadrilateralTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void calculateAreaTest() {
		Quadrilateral sqr = new Square(4);
		Quadrilateral rec = new Rectangle(3, 4);
		Quadrilateral par = new Parallelogram(3, 5);
		Quadrilateral trap = new Trapezium(3, 5, 7);

		List<Quadrilateral> quads = new ArrayList();
		quads.add(sqr);
		quads.add(rec);
		quads.add(par);
		quads.add(trap);
		
		for(Quadrilateral quad : quads) {
			if(quad instanceof Square) {
				System.out.println("A square");
			}
			quad.getClass().componentType().getTypeName();
		}
		
		
	}

}
