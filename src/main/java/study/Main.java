package study;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        name();
    }

    public static void name(){
        User user = new User("Angelina", "Yenakiieva");
        Gson gson = new Gson();
        String json = gson.toJson(user);
        System.out.println(json);
    }
}
