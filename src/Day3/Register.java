package Day3;

public class Register extends DeleteUser{
    public User register(int id, String name, String email, String password){
        User user = new User(id,name,email,password);
        return user;
    }
}
