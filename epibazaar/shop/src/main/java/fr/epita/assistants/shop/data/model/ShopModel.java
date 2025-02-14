package fr.epita.assistants.shop.data.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class ShopModel extends PanacheEntity {
    public Float priceMultiplier;
    public Float upgradePrice;
}