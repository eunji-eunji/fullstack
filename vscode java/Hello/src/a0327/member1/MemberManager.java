package a0327.member1;

import java.util.ArrayList;

public class MemberManager {
    // private ArrayList<Member> members = new ArrayList<>();
    private ArrayList<Member> members;

    public MemberManager() {
        members = new ArrayList<>();
    }

    public void addMember(String name, int age, String email) {
        Member new1 = new Member(name, age, email);
        members.add(new1);
        System.out.println("추가 완료");
    }

    public void displayAllMembers() {
        for (Member s : members) {
            System.out.println(s);
        }
    }

    public Member findMember(String searchName) {
        for (Member s : members) {
            if (s.getName().equalsIgnoreCase(searchName)) {
                return s;
            }
        }
        System.out.println("해당 이름 없음");
        return null;
    }

    // public void updateMember(String updateName, int newage, String newemail) {
    // Member member=findMember(updateName);
    // if(member != null){
    // // new Member(updateName, newage, newemail);
    // member.setAge(newage);
    // member.setEmail(newemail);
    // System.out.println("수정 완료");
    // }else{
    // System.out.println("찾을 수 없음");
    // }
    // }

    public void updateMember(String updateName, int newage, String newemail) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getName().equals(updateName)) {
                members.set(i, new Member(updateName, newage, newemail));
                return;
            }
        }
        System.out.println("찾을 수 없음");

    }

    public void removeMember(String removeName) {
        Member m = findMember(removeName);
        members.remove(m);
        System.out.println("삭제 완료");
    }

}
