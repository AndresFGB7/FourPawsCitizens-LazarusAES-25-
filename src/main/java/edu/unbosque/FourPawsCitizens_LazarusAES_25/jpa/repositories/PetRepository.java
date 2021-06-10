package edu.unbosque.FourPawsCitizens_LazarusAES_25.jpa.repositories;
import edu.unbosque.FourPawsCitizens_LazarusAES_25.jpa.entities.Pet;

import java.util.List;
import java.util.Optional;

public interface PetRepository {

    Optional<Pet> save(Pet pet);

    Optional<Pet> findById(Integer id);

    List<Pet> findAll();

    void editPet(Integer pet_id,String microship,String name,String species,String race,String size,String sex,String picture,Integer owner_id);

    void deleteById(Integer id);

}