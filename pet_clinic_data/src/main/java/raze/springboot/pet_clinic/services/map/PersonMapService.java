package raze.springboot.pet_clinic.services.map;

import raze.springboot.pet_clinic.model.Person;
import raze.springboot.pet_clinic.services.CrudService;

import java.util.Set;

public class PersonMapService extends AbstractMapService<Person,Long>
    implements CrudService<Person,Long>
{
    @Override
    public Person getById(Long id) {
        return super.getById(id);
    }

    @Override
    public Set<Person> findAll() {
        return super.findAll();
    }

    @Override
    public Person save(Person object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Person object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
