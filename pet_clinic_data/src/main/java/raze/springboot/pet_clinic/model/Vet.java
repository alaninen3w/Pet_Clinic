package raze.springboot.pet_clinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Vet extends Person {


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="vet_specialties",
            joinColumns = {@JoinColumn(name = "vet_id")},
            inverseJoinColumns = {@JoinColumn(name = "spciality_id")}
    )
    private Set<Speciality> specialities=new HashSet<>();


    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
