package first_package;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/admin")
public class FirstMethods {
    @RequestMapping( value = "/hii" , method = RequestMethod.POST)
    public ResponseEntity<First> user(@Valid @RequestBody LoginRequest loginRequest){
        return ResponseEntity.ok(First.builder().x(loginRequest.getEmail()).y(loginRequest.getPassword()).build());
    }
}
