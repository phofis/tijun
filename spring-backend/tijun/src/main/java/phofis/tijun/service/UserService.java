package phofis.tijun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import phofis.tijun.model.User;
import phofis.tijun.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user.password(passwordEncoder.encode(user.password())));
    }

    public User login(String username, String password) {
        User user=userRepository.findByUsername(username);
        if(user.password().equals(passwordEncoder.encode(password))) {
            return user;
        }
        return null;
    }
}
