package raze.springboot.pet_clinic.services.map;

import raze.springboot.pet_clinic.model.Vet;
import raze.springboot.pet_clinic.services.CrudService;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet,Long>
    implements CrudService<Vet,Long>
{

    @Override
    public Vet getById(Long id) {
        return super.getById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
