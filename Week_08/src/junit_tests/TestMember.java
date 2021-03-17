package junit_tests;
import model.Facility;
import model.Member;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import model.Member;
class TestMember {

	@Test
	void test_1a() {
		
		Facility f1 = new Facility("Spinning Class", 2.5,1);
		Facility f2 = new Facility("Gym", 2.0,2);
		Facility f3 = new Facility("Locker", 1.5,3);
		
		Member heeyeon = new Member("Heeyeon");
		assertEquals(0,heeyeon.getNumberOfFacilities() );
		heeyeon.addFacility(f1);
		assertEquals(1,heeyeon.getNumberOfFacilities() );
		heeyeon.addFacility(f2);
		assertEquals(2,heeyeon.getNumberOfFacilities() );
		heeyeon.addFacility(f3);
		assertEquals(3,heeyeon.getNumberOfFacilities() );
		
		
	}
	


@Test
void test_1b() {
	
//	Facility f1 = new Facility("Spinning Class", 2.5,1);
//	Facility f2 = new Facility("Gym", 2.0,2);
//	Facility f3 = new Facility("Locker", 1.5,3);
	
	Member heeyeon = new Member("Heeyeon");
	assertEquals(0,heeyeon.getNumberOfFacilities() );
	heeyeon.addFacility(new Facility("Spinning Class", 2.5,1));//passing the address of an object being created on the fly (without first storing its address in a variable)
	assertEquals(1,heeyeon.getNumberOfFacilities() );
	heeyeon.addFacility(new Facility("Gym", 2.0,2));
	assertEquals(2,heeyeon.getNumberOfFacilities() );
	heeyeon.addFacility(new Facility("Locker", 1.5,3));
	assertEquals(3,heeyeon.getNumberOfFacilities() );
	//Cons of anonymous objects: we can not use variables such at f1, f2, f3 to refer to the objects.
	//Instead, we need to get access to the underlying private 'facilities' array.
	//heeyeon.facilities() this is not correct because we can not access facilities because its private
}
@Test
void test_1c() {//Overloaded methods
	
	Facility f1 = new Facility("Spinning Class", 2.5,1);
	Facility f2 = new Facility("Gym", 2.0,2);
	Facility f3 = new Facility("Locker", 1.5,3);
	
	Member heeyeon = new Member("Heeyeon");
	assertEquals(0,heeyeon.getNumberOfFacilities() );
	heeyeon.addFacility("Spinning Class", 2.5,1);//passing the address of an object being created on the fly (without first storing its address in a variable)
	assertEquals(1,heeyeon.getNumberOfFacilities() );
	heeyeon.addFacility("Gym", 2.0,2);
	assertEquals(2,heeyeon.getNumberOfFacilities() );
	heeyeon.addFacility("Locker", 1.5,3);
	assertEquals(3,heeyeon.getNumberOfFacilities() );
}

@Test
void test_2() {
	Facility f1 = new Facility("Spinning Class", 2.5,1);
	Facility f2 = new Facility("Gym", 2.0,2);
	Facility f3 = new Facility("Locker", 1.5,3);
	
	Member heeyeon = new Member("Heeyeon");
	
	heeyeon.addFacility(f1);
	heeyeon.addFacility(f2);
	heeyeon.addFacility(f3);
	
	assertEquals(2.5 * 1 + 2.0 * 2 + 1.5 * 3, heeyeon.getPaymentDue(), 0.01);
	
	
}
@Test
void test_3() {
	
	Facility f1 = new Facility("Spinning Class", 2.5,1);
	Facility f2 = new Facility("Gym", 2.0,2);
	Facility f3 = new Facility("Locker", 1.5,3);
	
	Member heeyeon = new Member("Heeyeon");
	assertEquals(0,heeyeon.getNumberOfFacilities() );
	heeyeon.addFacility(f1);
	assertEquals(1,heeyeon.getNumberOfFacilities() );
	heeyeon.addFacility(f2);
	assertEquals(2,heeyeon.getNumberOfFacilities() );
	heeyeon.addFacility(f3);
	assertEquals(3,heeyeon.getNumberOfFacilities() );
	int units = heeyeon.getFacilityUnits("Gym");
	assertEquals(2, units);
	
	heeyeon.extendFacilityUnits("Gym", 2);
	assertEquals(4, heeyeon.getFacilityUnits("Gym"));
	assertEquals(2.5 * 1 + 2.0 * 4 + 1.5 * 3, heeyeon.getPaymentDue(), 0.01);

	
	
	
	
}






}
