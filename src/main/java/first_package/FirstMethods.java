package first_package;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/admin")
public class FirstMethods {

    @RequestMapping( value = "/hii" , method = RequestMethod.GET)
    public ResponseEntity<String> followUser(){
        return ResponseEntity.ok("hii");
    }

}
