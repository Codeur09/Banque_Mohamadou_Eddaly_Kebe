package fr.epita.assistants.shop.presentation.subscriber;
import fr.epita.assistants.shop.domain.service.ShopService;
import fr.epita.assistants.common.aggregate.*;
import io.smallrye.reactive.messaging.kafka.IncomingKafkaRecord;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class ShopSubscriber {

    @Inject
    ShopService shopService;

    @Incoming("reset-inventory-aggregate")
    public void resetInventory(IncomingKafkaRecord<String, ResetInventoryAggregate> record) {}

    @Incoming("collect-item-aggregate")
    public void collectItem(IncomingKafkaRecord<String, ItemAggregate> record) {}

    @Incoming("upgrade-collect-rate-aggregate")
    public void upgradeCollectRate(IncomingKafkaRecord<String, UpgradeItemProducerAggregate> record) {}

    @Incoming("upgrade-movement-speed-aggregate")
    public void upgradeMovementSpeed(IncomingKafkaRecord<String, UpgradeItemProducerAggregate> record) {}

    @Incoming("upgrade-stamina-aggregate")
    public void upgradeStamina(IncomingKafkaRecord<String, UpgradeItemProducerAggregate> record) {}

    @Incoming("create-shop-aggregate")
    public void createShop(IncomingKafkaRecord<String, ItemAggregate> record) {}

    @Incoming("sell-item-aggregate")
    public void sellItems(IncomingKafkaRecord<String, SellItemAggregate> record) {}

    @Incoming("upgrade-shop-price-aggregate")
    public void upgradeShopPrice(IncomingKafkaRecord<String, UpgradeShopAggregate> record) {}
}