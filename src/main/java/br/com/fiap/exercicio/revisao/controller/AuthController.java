package br.com.fiap.exercicio.revisao.controller;

import br.com.fiap.exercicio.revisao.dto.UserDto;
import br.com.fiap.exercicio.revisao.entity.User;
import br.com.fiap.exercicio.revisao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("userDto", new UserDto("", ""));
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute UserDto userDto) {
        if (userRepository.findByLogin(userDto.login()) != null) {
            return "redirect:/register?error";
        }

        User user = new User();
        user.setLogin(userDto.login());
        user.setPassword(passwordEncoder.encode(userDto.senha()));

        userRepository.save(user);

        return "redirect:/login?success";
    }
}