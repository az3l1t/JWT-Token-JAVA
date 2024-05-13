package net.az3l1t.JWT.service;

import net.az3l1t.JWT.model.AuthenticationResponse;
import net.az3l1t.JWT.model.User;
import net.az3l1t.JWT.repository.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private final UserRepository repository;
    private final PasswordEncoder encoder;
    private final JWTService service;

    private final AuthenticationManager manager;

    public AuthenticationService(UserRepository repository, PasswordEncoder encoder, JWTService service, AuthenticationManager manager) {
        this.repository = repository;
        this.encoder = encoder;
        this.service = service;
        this.manager = manager;
    }

    public AuthenticationResponse register(User request){
        User user = new User();
        user.setFirstname(request.getFirstname());
        user.setLastname(request.getLastname());
        user.setUsername(request.getUsername());
        user.setPassword(encoder.encode(request.getPassword()));
        user.setRole(request.getRole());

        user = repository.save(user);
        String token = service.generateToken(user);
        return new AuthenticationResponse(token);
    }

    public AuthenticationResponse authenticate(User request){
        manager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()
                )
        );

        User user = repository.findByUsername(request.getUsername()).orElseThrow();
        String token = service.generateToken(user);

        return new AuthenticationResponse(token);
    }
}
