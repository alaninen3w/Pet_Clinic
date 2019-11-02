package raze.springboot.pet_clinic.services.map;

import raze.springboot.pet_clinic.model.Vet;
import raze.springboot.pet_clinic.services.VetCrudService;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet,Long>
    implements VetCrudService
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
        return super.save(object);
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
