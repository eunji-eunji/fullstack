package a0324.agoda;

import java.util.ArrayList;

public class AgodaManager {
    ArrayList<Agoda> agodas;
    ArrayList<Agoda> agodaDatas;

    public AgodaManager() {
        agodas = new ArrayList<>();
        agodaDatas = new ArrayList<>();
        agodas.add(new Agoda("Hotel A", "Seoul", 100.0));
        agodas.add(new Agoda("Hotel B", "Busan", 80.0));
        agodas.add(new Agoda("Hotel C", "Jeju", 120.0));
    }

    // 1번 예약 가능한 숙소 보기
    public void allAgoda() {
        for (Agoda a : agodas) {
            if(a.isAvailable())
                System.out.println(a);
        }
    }

    // 2번 숙소 예약하기
    public boolean agodaBook(String name) {
        for (Agoda a:agodas) {
            if(a.getName().equalsIgnoreCase(name)){
                agodaDatas.add(a);
                a.setAvailable(false);
                return true;
            }
        }
        return false;
    }

    // 3번 예약한 숙소 보기
    public void agodaData() {
        for(Agoda a:agodaDatas){
            System.out.println(a);
        }
    }

    // 4번 숙소 추가하기
    public void addAgoda(String newname, String newlocation, double newprice) {
        agodas.add(new Agoda(newname, newlocation, newprice));
    }

    // 5번 숙소 삭제하기
    // public void removeAgoda(String remove) {
    //     for(Agoda a:agodas){
    //         if(a.getName().equalsIgnoreCase(remove)){
    //             a.remove();
    //         }
    //     }
    // }   


}
