package Company.Service;

import Company.Model.User;

import java.util.ArrayList;

public interface Userservice {

       void adduser(ArrayList<User> ar );
       void findwithID(int id);
       void erasewithID(int n);
       void takeollusers();
}
