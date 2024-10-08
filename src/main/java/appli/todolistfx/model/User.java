package appli.todolistfx.model;

import java.util.Objects;

public class User {
    private int id;
    private String mail;
    private String password;
    private String name;
    private String first_name;


    public User(int id, String mail, String password){
        this.id = id;
        this.mail = mail;
        this.password = password;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getMail(){
        return this.mail;
    }

    public void setMail(String mail){
        this.mail = mail;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mail, password);
    }
}
