package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MovieManager {
    private static ArrayList<Movie> movies; //영화 정보
private static ArrayList<Customer> customers;   //고객 정보
private static Map<String, Movie> resevationMap=new HashMap<>();    //Map<고객, 고객이 예매한 영화>
private static FileC fc=new FileC();
Scanner sc=new Scanner(System.in);

public MovieManager(){
    movies=new ArrayList<>();
    movies.add(new Movie("승부", "9:50", 0));
    movies.add(new Movie("로비", "11:30", 12));
    movies.add(new Movie("미키17", "15:10", 15));
}





}
