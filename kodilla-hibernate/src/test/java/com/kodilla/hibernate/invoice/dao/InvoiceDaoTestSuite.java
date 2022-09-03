package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //given
        Product product1 = new Product("Product number 1");
        Product product2 = new Product("Product number 2");
        Product product3 = new Product("Product number 3");

        Item item1 = new Item(product1, new BigDecimal("12.40"), 3, new BigDecimal("37.20"));
        Item item2 = new Item(product2, new BigDecimal("35.17"), 6, new BigDecimal("211.02"));
        Item item3 = new Item(product3, new BigDecimal("159.22"), 7, new BigDecimal("1114.54"));

        List<Item> itemList1 = new ArrayList<>();
        itemList1.add(item1);
        itemList1.add(item2);
        List<Item> itemList2 = new ArrayList<>();
        itemList2.add(item3);
        List<Item> itemList3 = new ArrayList<>();
        itemList3.add(item1);
        itemList3.add(item2);
        itemList3.add(item3);

        Invoice invoice1 = new Invoice("VAT Invoice 1/2022", itemList1);
        Invoice invoice2 = new Invoice("VAT Invoice 2/2022", itemList2);
        Invoice invoice3 = new Invoice("VAT Invoice 3/2022", itemList3);

        //when
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();
        invoiceDao.save(invoice2);
        int invoice2Id = invoice2.getId();
        invoiceDao.save(invoice3);
        int invoice3Id = invoice3.getId();

        //then
        Assertions.assertNotEquals(0, invoice1Id);
        Assertions.assertNotEquals(0, invoice2Id);
        Assertions.assertNotEquals(0, invoice3Id);

        //CleanUp
        invoiceDao.deleteById(invoice1Id);
        invoiceDao.deleteById(invoice2Id);
        invoiceDao.deleteById(invoice3Id);
    }
}
