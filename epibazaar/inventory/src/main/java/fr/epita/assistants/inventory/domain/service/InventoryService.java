package fr.epita.assistants.inventory.domain.service;

import fr.epita.assistants.common.command.*;
import fr.epita.assistants.common.aggregate.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import fr.epita.assistants.inventory.data.repository.ItemRepository;
@ApplicationScoped
public class InventoryService {

    @Inject
    ItemRepository itemRepository;

    public void resetInventory(ResetInventoryCommand command) {}

    public ItemAggregate collectItem(CollectItemCommand command) {
        return null;
    }

    public UpgradeItemProducerAggregate upgradeCollectRate(UpgradeCollectRateCommand command) {
        return null;
    }

    public UpgradeItemProducerAggregate upgradeMovementSpeed(UpgradeMovementSpeedCommand command) {
        return null;
    }

    public UpgradeItemProducerAggregate upgradeStamina(UpgradeStaminaCommand command) {
        return null;
    }

    public ItemAggregate createShop(CreateShopCommand command) {
        return null;
    }

    public SellItemAggregate sellItems(SellItemCommand command) {
        return null;
    }

    public UpgradeShopAggregate upgradeShopPrice(UpgradeShopPriceCommand command) {
        return null;
    }
}