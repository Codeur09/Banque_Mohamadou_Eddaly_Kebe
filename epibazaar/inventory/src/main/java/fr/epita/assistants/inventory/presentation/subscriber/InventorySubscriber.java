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
    public void resetInventory( ResetInventoryCommand record) {
    }

    @Incoming("collect-item-command")
    public void collectItem( CollectItemCommand record) {
    }

    @Incoming("upgrade-collect-rate-command")
    public void upgradeCollectRate( UpgradeCollectRateCommand record) {
    }

    @Incoming("upgrade-movement-speed-command")
    public void upgradeMovementSpeed( UpgradeMovementSpeedCommand record) {
    }

    @Incoming("upgrade-stamina-command")
    public void upgradeStamina( UpgradeStaminaCommand record) {
    }

    @Incoming("create-shop-command")
    public void createShop( CreateShopCommand record) {
    }

    @Incoming("sell-item-command")
    public void sellItems( SellItemCommand record) {
    }

    @Incoming("upgrade-shop-price-command")
    public void upgradeShopPrice( UpgradeShopPriceCommand record) {
    }
}