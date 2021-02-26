package junit_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Member;

class TestMember {

	@Test
	void test_Member_01() {
		Member member1 = new Member(); //defau;t constructor
		Member member2 = new Member();
		assertEquals(false, member1 == member2);
		assertFalse(member1 == member2);
	}
	@Test
	void test_Member_02() {
		Member member1 = new Member(); //defau;t constructor
		Member member2 = new Member();
		assertEquals(true, member1 != member2);
		assertTrue(member1 != member2);
	}
	void test_Member_03() {
		Member suyeon = new Member(12345, 's', 100.0); //customised constructor
		Member yuna = new Member(12346, 'b', 200.0 );
		Member jihye = new Member("Jihye", 123589, 'g', 300.0);
		assertFalse(suyeon == yuna);
		assertFalse(suyeon == jihye);
		assertFalse(jihye == yuna);
	}
	
	@Test
	public void testMember_04() {
		Member alan = new Member(85, 175);
		Member mark = new Member(101, 181);
		assertEquals(85, alan.getWeight(), 0.1);
		assertEquals(101, mark.getWeight(), 0.1);
		assertEquals("Overweight (27.8)", alan.getBMIReport());
		assertEquals("Obese (30.8)", mark.getBMIReport());
		//Change measures
		alan.changeWeightBy(-13);
		mark.changeWeightBy(-13);
		assertEquals("Normal (23.5)", alan.getBMIReport());
		assertEquals("Overweight (26.9)", mark.getBMIReport());
	}

}
