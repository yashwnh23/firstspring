package first_package;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class SecondClass {

    @RequestMapping(value = "/username",method = RequestMethod.GET)

    public ResponseEntity<String> fun(){
        return ResponseEntity.ok("hello yashwanth");
    }
}
