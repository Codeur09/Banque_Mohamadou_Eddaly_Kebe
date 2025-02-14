package fr.epita.assistants.inventory.presentation.subscriber;

import fr.epita.assistants.common.api.request.ItemRequest;
import fr.epita.assistants.common.api.response.ItemResponse;
import fr.epita.assistants.common.command.*;
import fr.epita.assistants.common.aggregate.*;
import fr.epita.assistants.inventory.domain.service.InventoryService;
import io.smallrye.reactive.messaging.kafka.IncomingKafkaRecord;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class InventorySubscriber {

    @Inject
    InventoryService inventoryService;

    @Incoming("reset-inventory-command")
    public void resetInventory(IncomingKafkaRecord<String, ResetInventoryCommand> record) {
        inventoryService.resetInventory(record.getPayload());
    }

    @Incoming("collect-item-command")
    public void collectItem(IncomingKafkaRecord<String, CollectItemCommand> record) {
        inventoryService.collectItem(record.getPayload());
    }

    @Incoming("upgrade-collect-rate-command")
    public void upgradeCollectRate(IncomingKafkaRecord<String, UpgradeCollectRateCommand> record) {
        inventoryService.upgradeCollectRate(record.getPayload());
    }

    @Incoming("upgrade-movement-speed-command")
    public void upgradeMovementSpeed(IncomingKafkaRecord<String, UpgradeMovementSpeedCommand> record) {
        inventoryService.upgradeMovementSpeed(record.getPayload());
    }

    @Incoming("upgrade-stamina-command")
    public void upgradeStamina(IncomingKafkaRecord<String, UpgradeStaminaCommand> record) {
        inventoryService.upgradeStamina(record.getPayload());
    }

    @Incoming("create-shop-command")
    public void createShop(IncomingKafkaRecord<String, CreateShopCommand> record) {
        inventoryService.createShop(record.getPayload());
    }

    @Incoming("sell-item-command")
    public void sellItems(IncomingKafkaRecord<String, SellItemCommand> record) {
        inventoryService.sellItems(record.getPayload());
    }

    @Incoming("upgrade-shop-price-command")
    public void upgradeShopPrice(IncomingKafkaRecord<String, UpgradeShopPriceCommand> record) {
        inventoryService.upgradeShopPrice(record.getPayload());
    }
}