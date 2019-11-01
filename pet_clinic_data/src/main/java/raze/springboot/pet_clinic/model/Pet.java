package raze.springboot.pet_clinic.model;

public class Pet  extends BaseEntity {
    private Long id;

    private PetType petType;
    private Owner owner;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Long getId(){
        return this.id;
    }
}
