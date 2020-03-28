package ie.gmit.single;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserController {

    //Handles incoming JSON requests that work on User resource/entity

        //Store used by controller
        private Store store = new Store();

        //Create a new user
        public String createUser(String userJson) throws IOException {
            ObjectMapper mapper = new ObjectMapper();

            User user = mapper.readValue(userJson, User.class);

            Validate validate = new Validate(user);
            if(!validate.isValidUser()) {
                return "ERROR";
            }

            store.store(user);

            return "SUCCESS";
        }
 }

// violates because it was running more than 1 operation
// more modular you could use validate user (more maintainable) (robust)
// having smaller classes is easier for maintaining clases with many different functions

