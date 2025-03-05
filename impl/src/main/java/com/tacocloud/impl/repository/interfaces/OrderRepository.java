package com.tacocloud.impl.repository.interfaces;

import com.tacocloud.impl.model.TacoOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderRepository
        extends CrudRepository<TacoOrder, UUID> {

}
