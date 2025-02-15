package fr.epita.assistants.item_producer.presentation.subscriber;
import fr.epita.assistants.item_producer.domain.service.ItemProducerService;
import fr.epita.assistants.common.aggregate.*;
import io.smallrye.reactive.messaging.kafka.IncomingKafkaRecord;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class ItemProducerSubscriber {

    @Inject
    ItemProducerService itemProducerService;

    @Incoming("reset-inventory-aggregate")
    public void resetInventory(ResetInventoryAggregate record) {}

    @Incoming("collect-item-aggregate")
    public void collectItem( ItemAggregate record) {}

    @Incoming("upgrade-collect-rate-aggregate")
    public void upgradeCollectRate( UpgradeItemProducerAggregate record) {}

    @Incoming("upgrade-movement-speed-aggregate")
    public void upgradeMovementSpeed( UpgradeItemProducerAggregate record) {}

    @Incoming("upgrade-stamina-aggregate")
    public void upgradeStamina( UpgradeItemProducerAggregate record) {}

    @Incoming("create-shop-aggregate")
    public void createShop( ItemAggregate record) {}

    @Incoming("sell-item-aggregate")
    public void sellItems( SellItemAggregate record) {}

    @Incoming("upgrade-shop-price-aggregate")
    public void upgradeShopPrice( UpgradeShopAggregate record) {}
}