package first_package;

import first_package.db.repository.RedisRepo;
import first_package.db.repository.RedisRepository;
import first_package.db.repository.User;
import first_package.db.repository.model.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class SecondClass {
    @Autowired
    private users users1;
    public User user;
    private RedisRepository redisRepository;

    @RequestMapping(value = "/username/{name}", method = RequestMethod.GET)

    public List<User> fun(@PathVariable String name) {

        return users1.findAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)

    public User add(@RequestBody User user) {
        return users1.save(user);
    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT)

    public User update(@RequestBody User user) {
        Optional<User> s = users1.findById(user.getId());
        User k = null;
        if (s.isPresent()) {
            k = s.get();
            k.setName(user.getName());
            k.setPassword(user.getPassword());

        }
        return users1.save(k);
    }

    @RequestMapping(value = "/rem/{id}", method = RequestMethod.DELETE)

    public String del(@PathVariable String id) {

        users1.deleteById(id);
        return "Rows deleted";
    }
    @RequestMapping(value = "/find/{id}/{name}", method = RequestMethod.GET)

    public List<User> fin(@PathVariable("id") final String id, @PathVariable("name") final String name) {

        return users1.findTopByNameContainingOrderByIdAsc(name);
    }

    @PostMapping("/insert")
    public RedisRepo insert(@RequestBody RedisRepo rp){
        return redisRepository.save(rp);
    }
    @GetMapping("/findall")
    public List<RedisRepo> findAll(){
        List<RedisRepo> students = new ArrayList<>();
        redisRepository.findAll().forEach(students::add);
        return students;
    }

}
