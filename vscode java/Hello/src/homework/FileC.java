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
            File folder = new File("d:\\movie");
            if (!folder.exists()) {
                if (folder.mkdirs()) {
                    System.out.println("폴더가 생성되었습니다.");
                } else {
                    System.out.println("폴더 생성 실패");
                    return;
                }
            }

            File file = new File("d:\\movie\\movieTicket.txt");
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

    // 예매 내역 가져오기
    public void uploadBookList() {
        try {
            File file = new File("d:\\movie\\movieTicket.txt");
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
            System.out.println("movieTicket.txt 파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("파일 읽기 실패");
        }
    }


    // 영화 목록 업로드
    public void upload() {
        try {
            File file = new File("d:\\movie\\list.txt");
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

}

// 파일에서 예매 내역 읽어오기
// 예매 취소
// 영화 등록, 수정, 삭제