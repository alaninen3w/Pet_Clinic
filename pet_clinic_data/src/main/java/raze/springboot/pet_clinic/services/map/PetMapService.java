package raze.springboot.pet_clinic.services.map;

import raze.springboot.pet_clinic.model.Pet;
import raze.springboot.pet_clinic.services.PetCrudService;

import java.util.Set;

public class PetMapService extends AbstractMapService<Pet,Long>
    implements PetCrudService
{

    @Override
    public Pet getById(Long id) {
        return super.getById(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
