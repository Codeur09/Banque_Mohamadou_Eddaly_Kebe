package fr.epita.assistants.item_producer.domain.entity;

import java.time.LocalDateTime;

public class PlayerEntity {
    public Integer posX;
    public Integer posY;
    public LocalDateTime lastMove;
    public LocalDateTime lastCollect;
    public Float moveSpeedMultiplier;
    public Float staminaMultiplier;
    public Float collectRateMultiplier;
}