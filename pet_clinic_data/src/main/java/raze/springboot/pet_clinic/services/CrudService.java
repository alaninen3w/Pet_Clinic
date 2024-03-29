package raze.springboot.pet_clinic.services;

import java.util.Set;

public interface CrudService<T,ID> {

    T getById(ID id);

    Set<T> findAll();

    T save(T object);

    void delete(T object);

    void deleteById(ID id);



}
