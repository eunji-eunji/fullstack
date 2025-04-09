import java.text.DecimalFormat;
import java.util.ArrayList;

public class CarManager {
    private ArrayList<Car> cars = new ArrayList<>();
    private DecimalFormat priceFormat = new DecimalFormat("#,###원");
    public void parkCar(String number, int inTime) {
        for (Car c : cars) {
            if (c.getCarNumber().equals(number)) {
                System.out.println("중복된 차량 번호입니다.");
                return;
            }
        }
        Car car = new Car(number, inTime);
        cars.add(car);
        System.out.printf("%s 입차 완료\n", number);
    }

    public void exitCar(String number, int outTime) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getCarNumber().equals(number)) {
                int price = 100 * (outTime - cars.get(i).getInTime());
                String priceFM=priceFormat.format(price);
                // 1000 * (출차시간 - 입차시간)
                System.out.printf("요금: %s\n", priceFM);
                cars.remove(i);
                return;
            }
        }
        System.out.println("해당 차량이 없습니다.");
        return;
    }

    public void showCars() {
        for(Car c:cars){
            System.out.printf("차량번호: %s, 입차시간: %d\n", c.getCarNumber(), c.getInTime());
        }
    }

}
