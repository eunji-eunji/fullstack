package a0328.homeword;

import java.io.File;

public class BookFile {
    private File file;
    private String dir;
    private String fileName;

    public BookFile(){  //기본생성자
        file=new File("d:\\");
    }

    // 생성자
    public BookFile(String dir, String fileName) {
        file=new File("d:\\"+dir+"\\"+fileName+".txt");
        this.dir = "d:\\"+dir;
        this.fileName = fileName+".txt";
    }

private boolean check(File file){
    if(file.exists()){
        return true;
    }else{
        return false;
    }
}

    // 파일 생성
    public void create() {
        boolean exist = check(file);
        if(exist){
            
        }
    }



}
