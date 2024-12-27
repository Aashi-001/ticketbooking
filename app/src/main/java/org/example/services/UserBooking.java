package org.example.services;

import org.example.entities.User;
// import org.example.util.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.*;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserBooking {
    private User user;

    private static final String USERS_PATH = "/Users/aashi/Desktop/projects/PRACTICE - CODE/JAVA/IRCTC/app/src/main/java/org/example/localDB/users.json";
    private ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private List<User> userList;

    public UserBooking(User u) throws JsonParseException, JsonMappingException, IOException{
        this.user = u;
        File users = new File(USERS_PATH);
        // System.out.println(users);
        userList = OBJECT_MAPPER.readValue(users, new TypeReference<List<User>>() {});
    }

    public Boolean UserLogin() {
        // Optional<User> foundUser = userList.stream().filter(user1 -> {
        //     return user1.getUserName().equals(user.getUserName()) && UserServiceUtil.checkPassword(user.getUserPassword(), user1.getUserHashedPassword());
        // }).findFirst();

        // return foundUser.isPresent();
        // System.out.println(userList);
        for (User user : userList) {
            System.out.println(user.getUserName());
        }
        return true;
    }
}
