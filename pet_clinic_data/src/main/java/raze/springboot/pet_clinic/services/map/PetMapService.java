package raze.springboot.pet_clinic.services.map;

import raze.springboot.pet_clinic.model.Pet;
import raze.springboot.pet_clinic.services.CrudService;

import java.util.Set;

public class PetMapService extends AbstractMapService<Pet,Long>
    implements CrudService<Pet,Long>
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
        return super.save(object.getId(),object);
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
