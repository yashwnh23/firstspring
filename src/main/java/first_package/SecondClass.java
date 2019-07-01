package first_package;

import first_package.db.repository.User;
import first_package.db.repository.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class SecondClass {
    @Autowired
    private users users1;
    public User user;
    @RequestMapping(value = "/username/{name}",method = RequestMethod.GET)

    public List<User> fun(@PathVariable String name){

        return users1.findAll();
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)

    public User add(@RequestBody User user){
        return users1.save(user);
    }
    @RequestMapping(value = "/add",method = RequestMethod.PUT)

    public User update(@RequestBody User user){
        return users1.save(user);
    }
}
