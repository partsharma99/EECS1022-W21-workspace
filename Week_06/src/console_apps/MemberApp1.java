package console_apps;

import model.Member;

public class MemberApp1 {

	public static void main(String[] args) {
		System.out.println("Before creating two members...");
		Member member1 = new Member(); //defau;t constructor
		System.out.println("After creating member 1");
		Member member2 = new Member();
		System.out.println("After creating member 2");
		System.out.println("Member1 and Member2 are the same objects: " + (member1 == member2));
		System.out.println("Member1 and Member2 are distinct objects: " + (member1 != member2));

	}

}
