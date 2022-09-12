package Company;

import Company.Dao.UserDao;
import Company.Model.User;
import Company.Service.Impl.UserServiceImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        User user1 = new User("Nurislam",1,16,Gender.MALE);
        User user2 = new User("Elena",2,17,Gender.FEMALE);
        User user3 = new User("Bakai",3,31,Gender.MALE);
        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(user1);
        arrayList.add(user2);
        arrayList.add(user3);


        UserDao userDao = new UserDao(arrayList);

        UserServiceImpl userService = new UserServiceImpl(userDao);

        userService.findwithID(1);

        userService.adduser(arrayList);

        userService.erasewithID(2);

        userService.takeollusers();


    }
}