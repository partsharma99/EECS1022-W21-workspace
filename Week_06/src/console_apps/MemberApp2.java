package console_apps;

import model.Member;

public class MemberApp2 {

	public static void main(String[] args) {
		System.out.println("Before creating two members...");
		Member suyeon = new Member(12345, 's', 100.0); //defau;t constructor
		System.out.println("After creating member 1");
		Member yuna = new Member(12346, 'b', 200.0 );
		System.out.println("After creating member 2");
		System.out.println("Member1 and Member2 are the same objects: " + (suyeon == yuna));
		System.out.println("Member1 and Member2 are distinct objects: " + (suyeon != yuna));
		
		Member jihye = new Member("Jihye", 123589, 'g', 300.0);

	}

}
