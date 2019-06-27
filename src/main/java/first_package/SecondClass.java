package first_package;

import first_package.db.repository.User;
import first_package.db.repository.users;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class SecondClass {
    private users users1;
    public User user;
    @RequestMapping(value = "/username/{name}",method = RequestMethod.GET)

    public List<User> fun(@PathVariable String name){

        return (List<User>) users1.findAll();
    }
}
