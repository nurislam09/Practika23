package Company.Service.Impl;

import Company.Dao.UserDao;
import Company.Gender;
import Company.Model.User;
import Company.Service.Userservice;

import java.util.ArrayList;

public class UserServiceImpl implements Userservice {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;

    }


    @Override
    public void adduser(ArrayList<User> ar) {
        ar.add(new User("Nurislam", 1, 16, Gender.MALE));
        ar.add(new User("Elena", 2, 17, Gender.FEMALE));
        ar.add(new User("Bakai", 3, 31, Gender.MALE));
        ar.add(new User("Ayimka", 4, 17, Gender.FEMALE));
        ar.add(new User("Bermet", 5, 17, Gender.FEMALE));

    }

    @Override
    public void findwithID(int id) {
        int counter = 0;
        try{
            for (int i = 0; i < userDao.getUsers().size(); i++) {
                if (userDao.getUsers().get(i).getId() == id){
                    System.out.println("-------------Пользователь с ID №" +
                            userDao.getUsers().get(i).getId() +"------------"+ userDao.getUsers().get(i));
                    counter++;
                }

                if (counter==0){
                    throw new RuntimeException();
                }
            }
        }catch (RuntimeException e){
            System.out.println("Пользователь не найден!");
        }






    }

    @Override
    public void erasewithID(int n) {
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (userDao.getUsers().get(i).getId() == n){
                userDao.getUsers().remove(n);
                break;
            }
        }


    }

    @Override
    public void takeollusers() {
        System.err.println("All users ");
        for (User i : userDao.getUsers()) {
            System.out.println((char) 27 + "[31m\nName: " + (char) 27 + "[0m" + i.getName());
            System.out.println((char) 27 + "[31m\nID: " + (char) 27 + "[0m" + i.getId());
            System.out.println((char) 27 + "[31m\nAge: " + (char) 27 + "[0m" + i.getAge());
            System.out.println((char) 27 + "[31m\nGender: " + (char) 27 + "[0m" + i.getGender());
            System.out.println((char) 27 + "[35m------------------- " + (char) 27 + "[0m");


        }
    }
}
