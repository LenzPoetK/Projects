package br.com.logic_blocks.logic_blocks_api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.logic_blocks.logic_blocks_api.DAO.IUser;
import br.com.logic_blocks.logic_blocks_api.models.User;

@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired
    private IUser dao;

    @GetMapping
    public List<User> userList(){
        return (List<User>) dao.findAll();
    }

    @CrossOrigin(origins="http://127.0.0.1:5500")
    @PostMapping
    public ResponseEntity<User> creatUser(@RequestBody User user) {
        if (user.getName() == null || user.getEmail() == null || user.getPassword() == null) {
            return ResponseEntity.badRequest().body(null);
        }
        User newUser = dao.save(user);
        return ResponseEntity.ok(newUser);
    }
}
