package homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class FileC {
    private MovieManager manager = new MovieManager();

    // 예매 내역 저장
    public void ticketSaveFile(Map<String, Movie> reservationMap, String name) {
        try {
            // 폴더가 존재하지 않으면 폴더 생성
            // File folder = new File("d:\\movie");
            File folder = new File("C:\\Users\\user\\Desktop");

            if (!folder.exists()) {
                if (folder.mkdirs()) {
                    System.out.println("폴더가 생성되었습니다.");
                } else {
                    System.out.println("폴더 생성 실패");
                    return;
                }
            }

            // File file = new File("d:\\movie\\movieTicket.txt");
            File file = new File("C:\\Users\\user\\Desktop\\movieTicket.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true)); // 이어쓰기 가능
            if (!file.exists()) {
                System.out.println("파일이 생성되었습니다.");
            }
            bufferedWriter.write(manager.ticketPrint(reservationMap, name));
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("파일 저장 실패");
        }
    }

    // 파일에서 영화 목록 가져오기
    public void upload() {
        try {
            // File file = new File("d:\\movie\\list.txt");
            File file = new File("C:\\Users\\user\\Desktop\\list.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("===========================");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                String[] movie = line.split("/");
                MovieManager.getMovies()
                        .add(new Movie(movie[0], movie[1], Integer.parseInt(movie[2])));
            }
        } catch (FileNotFoundException e) {
            System.out.println("list.txt 파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("파일 읽기 실패");
        }
    }

    // 영화 목록을 list.txt에 저장
public void saveMovieList() {
    try {
        File file = new File("C:\\Users\\user\\Desktop\\list.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file, false)); // false로 하면 덮어쓰기 모드

        for (Movie m : MovieManager.getMovies()) {
            // 형식: 제목/시간/시청가능연령령
            String line = m.getMovieName() + "/" + m.getTime() + "/" + m.getViewableAge();
            writer.write(line);
            writer.newLine();
        }

        writer.close();
        System.out.println("영화 목록이 list.txt에 저장되었습니다.");
    } catch (IOException e) {
        System.out.println("영화 목록 저장 중 오류 발생: " + e.getMessage());
    }
}
}
