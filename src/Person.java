import java.io.Serializable;
public class Person implements Serializable {
     private static final long serialVersionUID = 3L;
    String name,ic,email;

    public Person(String name, String ic, String email) {
        this.name = name;
        this.ic = ic;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "Name: "+name +"\nIC: "+ ic +"\nEmail: "+ email;
    }   
}
