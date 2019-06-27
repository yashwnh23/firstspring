package first_package.db.repository;


import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Builder
@Entity
@Table(name = "user")
public class User {

    private String id;
    private String userName;
    private String firstName;
    private String lastName;

    public String getId(){
        return id;
    }
    public String getUserName(){
        return userName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

}
