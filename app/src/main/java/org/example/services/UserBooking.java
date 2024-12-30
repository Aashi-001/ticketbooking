package org.example.services;

import org.example.entities.Ticket;
import org.example.entities.User;
// import org.example.util.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserBooking {
    // private User user;

    private static final String USERS_PATH = "/Users/aashi/Desktop/projects/PRACTICE - CODE/JAVA/IRCTC/app/src/main/java/org/example/localDB/users.json";
    private ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private List<User> userList;
    private Map<String, String> userMap = new HashMap<>();
    private Map<String, User> usernameMap = new HashMap<>();

    public UserBooking() throws JsonParseException, JsonMappingException, IOException{
        // this.user = u;
        File users = new File(USERS_PATH);
        // System.out.println(users);
        userList = OBJECT_MAPPER.readValue(users, new TypeReference<List<User>>() {});
        for (User user : userList) {
            String uname = user.getUserName();
            String pass = user.getUserPassword();
            userMap.put(uname, pass);
            usernameMap.put(uname, user);
        }

    }

    public User UserLogin(String userName, String password) {
        // Optional<User> foundUser = userList.stream().filter(user1 -> {
        //     return user1.getUserName().equals(user.getUserName()) && UserServiceUtil.checkPassword(user.getUserPassword(), user1.getUserHashedPassword());
        // }).findFirst();

        // return foundUser.isPresent();
        // System.out.println(userList);
        // for (User user : userList) {
        //     System.out.println(user.getUserName());
        // }
        // for (User user : userList) {
        //     System.out.println(user.getUserID() + " " + userMap.get(user.getUserID()));
        // }
        // System.out.println(userid + " " + password);
        if(userMap.containsKey(userName) && userMap.get(userName).equalsIgnoreCase(password)){
            // login user
            return usernameMap.get(userName);
            // return true;
        }
        else return null;
    }

    public Boolean userSignup(String userid, String password, String username) throws JsonGenerationException, JsonMappingException, IOException{
        try{
            File users = new File(USERS_PATH);
            User newUser = new User();
            newUser.setUserID(userid);
            newUser.setUserName(username);
            newUser.setUserPassword(password);
            userList.add(newUser);
            OBJECT_MAPPER.writeValue(users, userList);
            return true;
        } catch(Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public void fetchBookings(User user){
        List<Ticket> tempList = user.getBookingList();
        for (Ticket ticket : tempList) {
            ticket.displayInfo();
        }
        return ;
    }
}
