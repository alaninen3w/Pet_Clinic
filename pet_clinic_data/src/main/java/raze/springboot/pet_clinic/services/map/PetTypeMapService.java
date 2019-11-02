package raze.springboot.pet_clinic.services.map;

import raze.springboot.pet_clinic.model.PetType;
import raze.springboot.pet_clinic.services.PetTypeCrudService;

import java.util.Set;

public class PetTypeMapService extends AbstractMapService<PetType,Long>
    implements PetTypeCrudService
{

    @Override
    public PetType getById(Long id) {
        return super.getById(id);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
