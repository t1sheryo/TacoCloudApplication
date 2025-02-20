package com.tacocloud.impl.repository.interfaces;

import com.tacocloud.impl.model.TacoOrder;

public interface OrderRepositoryInterface {
    TacoOrder save(TacoOrder order);
}
