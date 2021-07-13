package todoList.controller;

import org.springframework.stereotype.Controller;
import todoList.service.UserService;

@Controller
public class UserController {

    UserService userService;

    public UserController (UserService userService) {
        this.userService = userService;
    }
}
