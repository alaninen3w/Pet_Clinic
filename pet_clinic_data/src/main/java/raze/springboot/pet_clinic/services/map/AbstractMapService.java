package raze.springboot.pet_clinic.services.map;

import raze.springboot.pet_clinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Long> {

    protected Map<Long,T> map = new HashMap<>();


    Set<T>  findAll(){
        return new HashSet<>(map.values());
    }

    T getById(ID id){
        return map.get(id);
    }


    T save(T object){

        if(object!=null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }

            map.put(object.getId(),object);

        }else throw new RuntimeException("Object is null");



        return object;
    }


    void delete(T object){
        map.entrySet().removeIf(a->a.getValue().equals(object));
    }

    void deleteById(ID id){
        map.remove(id);
    }

    protected Long getNextId(){
        Long nextId;

        try {
            nextId = Collections.max(map.keySet()) + 1;
        }catch (NoSuchElementException e){
            nextId = 1L;
        }

        return  nextId;
    }


}
