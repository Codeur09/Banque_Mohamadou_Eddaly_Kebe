package fr.epita.assistants.item_producer.data.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class ItemModel extends PanacheEntity {
    public String type;
    public Float quantity;
}