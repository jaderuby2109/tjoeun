package Chapter012.Ex04_collection.list;

import Chapter012.Ex04_collection.Member;

public class MemberLinkedListTest {

	public static void main(String[] args) {

		MemberLinkedList memberArrayList = new MemberLinkedList();

		Member memberLee  = new Member(1001, "이지원");
		Member memberSon  = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		Member memberHong = new Member(1004, "홍길동›");

		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		memberArrayList.showAllMember();

		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember();
	}
}
