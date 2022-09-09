package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;


    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("product1");
        Product product2 = new Product("product2");

        Item item1 = new Item(new BigDecimal(12.20), 3,new BigDecimal(13), product1);
        Item item2 = new Item(new BigDecimal(26.40), 6,new BigDecimal(123), product1);
        Item item3 = new Item(new BigDecimal(64.60), 4,new BigDecimal(635), product2);

        Invoice invoice = new Invoice("48742");

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        product1.getItem().add(item1);
        product1.getItem().add(item2);
        product2.getItem().add(item3);
//        productDao.save(product1);
//        productDao.save(product2);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        invoiceDao.save(invoice);
        //When
        int invoiceDaoId = invoice.getId();
        int itemDao1ID = item1.getId();
        int itemDao2ID = item2.getId();
        int itemDao3ID = item3.getId();
        int productDao1Id = product1.getId();
        int productDao2Id = product2.getId();

        //Then
        assertNotEquals(0, invoiceDaoId);
        assertNotEquals(0, itemDao1ID);
        assertNotEquals(0, itemDao2ID);
        assertNotEquals(0, itemDao3ID);
        assertNotEquals(0, productDao1Id);
        assertNotEquals(0, productDao2Id);

    }
}