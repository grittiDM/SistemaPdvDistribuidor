/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tobjlate file, choose Tools | Tobjlates
 * and open the tobjlate in the editor.
 */
package br.pdvcongelados.model.dao;

import java.util.List;

import org.dizitart.no2.FindOptions;
import org.dizitart.no2.SortOrder;
import org.dizitart.no2.exceptions.NitriteException;
import org.dizitart.no2.objects.ObjectRepository;
import org.dizitart.no2.objects.filters.ObjectFilters;

import br.pdvcongelados.db.DB;
import br.pdvcongelados.db.DBException;
import br.pdvcongelados.model.entities.Customer;

/**
 *
 * @author vfdes
 */
public class CustomerDao {

    private static ObjectRepository<Customer> repCustomer;

    static {
        repCustomer = DB.getDB().getRepository(Customer.class);
    }

    public static void insert(Customer obj) {
        try {
            repCustomer.insert(obj);
        } catch (NitriteException e) {
            throw new DBException("Já existe um cliente com este CPF no sistema.");
        }
    }

    public static void update(Customer obj) {
        Customer temp = repCustomer.find(ObjectFilters.eq("cpf", obj.getName()))
                .firstOrDefault();
        
        if (obj.equals(temp) || temp == null) {
            repCustomer.update(obj);          
        }
        else {
            throw new DBException("Já existe um cliente com este CPF no sistema.");
        }
    }

    public static List<Customer> findAll() {
        FindOptions fo = FindOptions.sort("name", SortOrder.Ascending);
        List<Customer> listClient = repCustomer.find(fo).toList();
        return listClient;

    }

    public static Customer findByCpf(String cpf) {
        Customer obj = repCustomer.find(ObjectFilters.eq("cpf", cpf)).firstOrDefault();
        return obj;
    }

    public static void remove(Customer obj) {
        repCustomer.remove(obj);
    }

    public static List<Customer> search(String searchClient) {
        String str = searchClient.toUpperCase();

        List<Customer> list = repCustomer.find(ObjectFilters.or(
                ObjectFilters.regex("name", str),
                ObjectFilters.eq("cpf", str)),
                FindOptions.sort("name", SortOrder.Ascending))
                .toList();
        return list;
    }

}
