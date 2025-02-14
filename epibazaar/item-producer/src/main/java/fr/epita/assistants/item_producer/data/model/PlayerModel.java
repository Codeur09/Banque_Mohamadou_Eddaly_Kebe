package fr.epita.assistants.item_producer.data.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

import java.time.LocalDateTime;

@Entity
public class PlayerModel extends PanacheEntity {
    public Integer posX;
    public Integer posY;
    public LocalDateTime lastMove;
    public LocalDateTime lastCollect;
    public Float moveSpeedMultiplier;
    public Float staminaMultiplier;
    public Float collectRateMultiplier;
}