/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author dvan2301
 */
public class LoginServices {
    List<User> userList = new ArrayList<>();

    public LoginServices() {
        UserDefault();
    }
    
    
    
    private void UserDefault(){
        userList.add(new User(1, "admin","admin"));
        userList.add(new User(2, "zzz23","12345"));
        userList.add(new User(3, "van","1"));
        
    }
//    public boolean checkLogin(String username, String password){
//        
//        for(User s: userList){
//            if(s.equals(username) && s.equals(password)){
//                return true;
//            }
//        }
//        
//        return false;
// 
//    }
      public boolean verifyLogin(String username, String password) {
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (user.getPassword().equals(password) && user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}
