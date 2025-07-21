package com.project_ecommerce.model.dao;

import com.project_ecommerce.model.LocalUser;
import com.project_ecommerce.model.WebOrder;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface WebOrderDAO extends ListCrudRepository<WebOrder, Long> {

    List<WebOrder> findByUser(LocalUser user);
}
