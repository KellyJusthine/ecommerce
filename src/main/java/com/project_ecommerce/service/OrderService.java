package com.project_ecommerce.service;

import com.project_ecommerce.model.LocalUser;
import com.project_ecommerce.model.WebOrder;
import com.project_ecommerce.model.dao.WebOrderDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private WebOrderDAO webOrderDAO;

    public List<WebOrder> getOrders(LocalUser user) {
        return webOrderDAO.findByUser(user);
    }

}