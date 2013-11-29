package tests;

import static org.junit.Assert.*;
import main.Lift;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test_go_to_EC_PW {

	private Lift lift;

	@Before
	public void Setup() {
		lift = new Lift();
	}

	@Test
	public void TestCase1() {
		lift.setFloor(1);
		lift.go_to(2);
		assertEquals(2, lift.getFloor());
	}

	
	@After
	public void TearDown() {
		lift = null;
	}

}
