package raze.springboot.pet_clinic.services.map;

import raze.springboot.pet_clinic.model.Owner;
import raze.springboot.pet_clinic.services.OwnerCrudService;

import java.util.Set;

public class OwnerMapService extends AbstractMapService<Owner,Long>
        implements OwnerCrudService {
    @Override
    public Owner getById(Long id) {
        return super.getById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
