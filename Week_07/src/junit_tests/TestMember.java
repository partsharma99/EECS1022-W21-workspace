package junit_tests;
import model.Member;
import model.Trainer;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Member;
import model.Member;
class TestMember {

	@Test
	void test_aliasing_01a() {
		Member alan = new Member(85, 175);
		Member mark = new Member(101, 181);
		assertEquals(85, alan.getWeight(), 0.1);
		assertEquals(101, mark.getWeight(), 0.1);
		assertEquals("Overweight (27.8)", alan.getBMIReport());
		assertEquals("Obese (30.8)", mark.getBMIReport());
		//Change measures
		
		mark.changeWeightBy(-13);
		assertEquals("Normal (23.5)", alan.getBMIReport());
		assertEquals("Obese (30.8)", mark.getBMIReport()); // Mark's BMI remains the same
	}
	
	@Test
	void test_aliasing_01b() {
		Member alan = new Member(85, 175);
		Member mark = new Member(101, 181);
		assertEquals(85, alan.getWeight(), 0.1);
		assertEquals(101, mark.getWeight(), 0.1);
		assertEquals("Overweight (27.8)", alan.getBMIReport());
		assertEquals("Obese (30.8)", mark.getBMIReport());
		
		mark = alan;
		//Change measures
		
		mark.changeWeightBy(-13);
		assertEquals("Normal (23.5)", alan.getBMIReport());
		assertEquals("Normal (23.5)", mark.getBMIReport()); // Mark's BMI remains the same
	}
	@Test
	void test_aliasing_02() {
		Member alan = new Member();
		Member mark = new Member();
		
		Member oldAlan = alan;
		Member oldMark = mark;
		Member tom = alan;
		alan = mark;
		mark = tom;
		
		assertTrue(alan == oldMark);
		assertTrue(mark == oldAlan);
	}
	
	@Test
	public void test_MemberTrainer_01() {
		Member alan = new Member("Alan");
		Member mark = new Member("Mark");
		Member tom = new Member("Tom");
		assertTrue(alan.getTrainer() == null);
		assertNull(mark.getTrainer());
		assertFalse(tom.getTrainer() != null);
		
		Trainer jared = new Trainer("Jared");
		Trainer jon = new Trainer("Jon");
		
		alan.registerTrainer(jared);
		mark.registerTrainer(jon);
		assertTrue(alan.getTrainer() != null && alan.getTrainer() == jared);
		assertTrue(mark.getTrainer() != null & mark.getTrainer() == jon);
		assertFalse(tom.getTrainer() != null);
		
		tom.referTrainer(mark);
		assertTrue(tom.getTrainer() != null && tom.getTrainer() == jon);
		
		tom.referTrainer(alan);
		assertTrue(tom.getTrainer() != null && tom.getTrainer() == jared);
		
		mark.swapTrainer(alan);
		assertTrue(mark.getTrainer() == jared && alan.getTrainer() == jon);
		
		
	}


}
