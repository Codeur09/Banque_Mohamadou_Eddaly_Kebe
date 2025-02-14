package fr.epita.assistants.shop.data.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class ItemModel extends PanacheEntity {
    public String type;
    public Float quantity;
}