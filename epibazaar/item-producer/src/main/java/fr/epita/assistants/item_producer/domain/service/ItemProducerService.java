package fr.epita.assistants.item_producer.domain.service;

import fr.epita.assistants.common.command.*;
import fr.epita.assistants.common.utils.Direction;
import fr.epita.assistants.item_producer.data.repository.ItemRepository;
import fr.epita.assistants.item_producer.data.repository.PlayerRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ItemProducerService {

    @Inject
    ItemRepository itemRepository;

    @Inject
    PlayerRepository playerRepository;

    public void startGame(String mapPath) {}

    public Object getResources() {
        return itemRepository.listAll();
    }

    public Object getPlayer() {
        return playerRepository.listAll();
    }

    public Object getUpgrades() {
        return null;
    }

    public Object move(Direction direction) {
        return null;
    }

    public void collect() {}

    public void upgradeCollectRate() {}

    public void upgradeMovementSpeed() {}

    public void upgradeStamina() {}
}