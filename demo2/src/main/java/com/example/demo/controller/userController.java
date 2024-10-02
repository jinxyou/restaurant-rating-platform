package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user")
public class userController {
    @Autowired
    private userService ss;
    @RequestMapping("queryAll")
    public String queryAll(Model model){
        List<User> list = ss.queryAll();
        model.addAttribute("list", list);
        return "showAll";
    }

    @RequestMapping("removeByUsername")
    public String removeByUsername(String username){
        try {
            ss.removeByUsername(username);
            return "redirect:/user/queryAll";
        }catch (Exception e){
            System.out.println(e);
            return "Remove Error";
        }
    }

    @RequestMapping("addUser")
    public String addStudent(User user){
        try {
            ss.addUser(user);
            return "redirect:/login.jsp";
        }catch (Exception e){
            e.printStackTrace();
            return "Register error";
        }
    }


    @RequestMapping("login")
    public String login(String username, String password){
        User curr = ss.Login(username);
        if (curr != null & curr.getPassword().equals(password)){
            if (curr.getUsername().equals("root")){
                return "redirect:/user/queryAll";
            }else{
                return "redirect:/restaurant.jsp";
            }
        }
        return "redirect:/login.jsp";
    }

    @RequestMapping("updatePassword")
    public String getUserInfo(String username, ModelMap mm){
        User curr = ss.Login(username);
        mm.addAttribute("user",curr);
        return "updateUserPassword";
    }

    @RequestMapping("performUpdate")
    public String performUpdate(String username, String password){
        User temp = new User(username, password);
        try {
            ss.changePassword(temp);
            return "redirect:/user/queryAll";
        }catch (Exception e){
            e.printStackTrace();
            return "Update Error";
        }
    }
}
