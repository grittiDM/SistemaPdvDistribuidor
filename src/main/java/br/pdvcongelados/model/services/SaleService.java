/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pdvcongelados.model.services;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import br.pdvcongelados.model.dao.ProductDao;
import br.pdvcongelados.model.dao.SaleDao;
import br.pdvcongelados.model.entities.Product;
import br.pdvcongelados.model.entities.Sale;
import br.pdvcongelados.model.entities.SaleItem;

/**
 *
 * @author silas
 */
public class SaleService {
    
    public static void confirmSale(Sale sale) {
        sale.getItems().forEach(x -> {
            Product product = x.getProduct();
            product.setQuantity(product.getQuantity() - x.getQuantity());
            ProductDao.update(product);
        });
        sale.setMoment(new Date());
        SaleDao.insert(sale);
    }
    
    public static Double ticketMedio() {
        Long totalSales = SaleDao.size();
        Double revenues = SaleDao.revenues(0);
        
        Double result = 0.0;
        result = revenues / totalSales;
        
        return (totalSales != 0) ? result : 0.0;
    }
    
    public static Double receitaLiquida() {
        Double revenues = SaleDao.revenues(0);
        Double receitaLiquida = 0.0;
        List<SaleItem> items = new LinkedList<>();
        
        SaleDao.findAll().forEach(s -> {
            items.addAll(s.getItems());
        });
        
        for (SaleItem item : items) {
            Double subTotal = item.getSubTotal();
            Integer quantity = item.getQuantity();
            Double totalCost = item.getProduct().getCostPrice() * quantity;
            
            receitaLiquida += subTotal - totalCost;
        }
        return receitaLiquida;
    }
}
