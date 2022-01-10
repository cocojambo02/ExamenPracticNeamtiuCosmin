package exercitiu2.repository;

import exercitiu2.model.Produkte;


import java.util.ArrayList;
import java.util.List;

public class RepositoryCRUDImplementation implements RepoCRUD<Produkte>{

    List<Produkte> alleProdukte;

    public RepositoryCRUDImplementation() {
        this.alleProdukte = new ArrayList<>();
    }

    /**
     * Adds a new object to the database.
     *
     * <br>
     * <br>
     * <p>
     * PRE:
     * <br>
     * Receives an object of given type
     * <br>
     * <br>
     * <p>
     * EXECUTION:
     * <br>
     * Gets a list of all object, appends the new object to the list, and rewrites the whole list
     *
     * <br>
     * <br>
     * <p>
     * POST:
     * <br>
     * Returns the inserted object
     *
     * @param obj is an Object of given type
     * @return returns the newly inserted object
     */
    @Override
    public Produkte create(Produkte obj){
        alleProdukte.add(obj);
        return obj;
    }

    /**
     * Returns all objects from the database of the given type
     *
     * <br>
     * <br>
     * <p>
     * PRE:
     * <br>
     * None
     * <br>
     * <br>
     * <p>
     * EXECUTION:
     * <br>
     * Gets a list of all objects of type T and returns them.
     * <br>
     * <br>
     * <p>
     * POST:
     * <br>
     * Returns a list containing all objects of type T.
     *
     * @return returns a list containing all objects of type T
     */
    @Override
    public List<Produkte> getAll(){
        return alleProdukte;
    }

    /**
     * Updates a given object from the repo by ID.
     *
     * <br>
     * <br>
     * <p>
     * PRE:
     * <br>
     * <p>
     * <p>
     * Both parameters are of the same given object type(either course, student or teacher)
     *
     *
     * <br>
     * <br>
     * <p>
     * EXECUTION:
     * <br>
     * If the object exists, it is deleted and replaced by the new correct copy by reinsertion, else error is
     * thrown.
     *
     * <br>
     * <br>
     * <p>
     * <p>
     * <p>
     * POST:
     * <br>
     * Object is updated.
     *
     * @param oldVersion is an Object of given type
     * @param newVersion is an Object of given type
     * @return null, if the given ID does not exist, else the new, updated version is returned
     */
    @Override
    public Produkte update(Produkte oldVersion, Produkte newVersion){
        alleProdukte.remove(oldVersion);
        alleProdukte.add(newVersion);
        return null;
    }

    /**
     * Deletes an object of type T from the database.
     *
     * <br>
     * <br>
     * <p>
     * PRE:
     * <br>
     * Receives the object, that has to be deleted.
     * <br>
     * <br>
     * <p>
     * EXECUTION:
     * <br>
     * Gets the list of all objects of type T, deletes the object passed as parameter and rewrites the new list.
     * <br>
     * <br>
     * <p>
     * POST:
     * <br>
     * The object passed as parameter is deleted from the Database.
     *
     * @param obj is an Object of given type
     */
    @Override
    public void delete(Produkte obj){
        alleProdukte.remove(obj);
    }
}
