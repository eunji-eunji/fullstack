package Lotto;

// 데이터 저장을 위한 FileManager 클래스
class FileManager {
    private static final String MEMBERS_FILE = "members.dat";
    private static final String ADMIN_FILE = "admin.dat";
    
    // 회원 정보 저장
    public static void saveMembers(List<Member> members) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(MEMBERS_FILE))) {
            oos.writeObject(members);
        } catch (IOException e) {
            System.out.println("회원 정보 저장 중 오류 발생: " + e.getMessage());
        }
    }
    
    // 회원 정보 로드
    @SuppressWarnings("unchecked")
    public static List<Member> loadMembers() {
        List<Member> members = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(MEMBERS_FILE))) {
            members = (List<Member>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("회원 정보 파일이 없습니다. 새로 생성합니다.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("회원 정보 로드 중 오류 발생: " + e.getMessage());
        }
        return members;
    }
    
    // 관리자 정보 저장
    public static void saveAdmin(Admin admin) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(ADMIN_FILE))) {
            oos.writeObject(admin);
        } catch (IOException e) {
            System.out.println("관리자 정보 저장 중 오류 발생: " + e.getMessage());
        }
    }
    
    // 관리자 정보 로드
    public static Admin loadAdmin() {
        Admin admin = null;
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(ADMIN_FILE))) {
            admin = (Admin) ois.readObject();
        } catch (FileNotFoundException e) {
            admin = new Admin("관리자", "admin", "1234");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("관리자 정보 로드 중 오류 발생: " + e.getMessage());
        }
        return admin;
    }
}
