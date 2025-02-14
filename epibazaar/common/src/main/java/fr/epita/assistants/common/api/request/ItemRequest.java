package fr.epita.assistants.common.api.request;

import lombok.Value;

@Value
public class ItemRequest {
    String type;
    Float quantity;
}