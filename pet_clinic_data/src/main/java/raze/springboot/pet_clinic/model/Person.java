package raze.springboot.pet_clinic.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person  extends BaseEntity{


    private Long Id;
    private  String firstName;
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

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
