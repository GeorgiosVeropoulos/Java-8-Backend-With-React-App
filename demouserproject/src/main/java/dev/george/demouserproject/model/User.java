package dev.george.demouserproject.model;




import javax.persistence.*;

@Entity
@Table(name = "newtesttable")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    @Column(length = 20)
    private String firstName;

    @Column(length = 20)
    private String lastName;

    @Column(length = 45)
    private String email;

    public long getId(){
        return userId;
    }
    public void setUserId(long userId){
        this.userId = userId;
    }

    public String  getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String  getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String  getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

}
