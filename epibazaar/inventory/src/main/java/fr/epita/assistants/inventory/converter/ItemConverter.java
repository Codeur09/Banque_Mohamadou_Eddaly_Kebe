package fr.epita.assistants.inventory.converter;

import fr.epita.assistants.inventory.domain.entity.ItemEntity;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ItemConverter {

    public ItemEntity toItemEntity(){
        ItemEntity itemEntity = new ItemEntity();
        return itemEntity;
    }

}
