package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Item item = new Item(new BigDecimal(290),3,new BigDecimal(300));
        Item item2 = new Item(new BigDecimal(90),2,new BigDecimal(100));
        Product product = new Product("Wallet");
        Product product1 = new Product("Bag");
        item.setProduct(product);
        item2.setProduct(product1);
        Invoice invoice = new Invoice("12/03/2020");
        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        item.setInvoice(invoice);
        item2.setInvoice(invoice);
        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        //Then
        Assert.assertNotEquals(0,id);
        //CleanUp
        invoiceDao.deleteById(id);
    }
}
