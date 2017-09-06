package za.co.dims.library.domain;


import javax.persistence.Entity;

/**
 * Created by dims on 2017/09/01.
 */
@Entity
public class Author extends BaseEntity {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
