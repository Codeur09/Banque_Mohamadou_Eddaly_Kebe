package fr.epita.assistants.shop.domain.service;

import fr.epita.assistants.common.command.*;
import fr.epita.assistants.shop.data.repository.ItemRepository;
import fr.epita.assistants.shop.data.repository.ShopRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ShopService {

    @Inject
    ShopRepository shopRepository;

    @Inject
    ItemRepository itemRepository;

    public void startShop() {}

    public Object getShop(Long id) {
        return shopRepository.findById(id);
    }

    public Object getAllShops() {
        return shopRepository.listAll();
    }

    public Object getResources() {
        return itemRepository.listAll();
    }

    public Object getShopPrice() {
        return null;
    }

    public void createShop() {}

    public void sellItems(SellItemCommand sellItemCommand) {}

    public void upgradeShopPrice(Long id) {}
}