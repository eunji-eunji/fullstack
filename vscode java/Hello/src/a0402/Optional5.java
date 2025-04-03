package a0402;

import java.util.Optional;

public class Optional5 {
    public static void main(String[] args) {
        Optional<String> optionalName = findname("mark");
        System.out.println(optionalName.orElse("name not found"));
    }

    private static Optional<String> findname(String string) {
        if("John".equalsIgnoreCase(string)){
            return Optional.of(string);
        }else{
            return Optional.empty();
        }

    }
}
