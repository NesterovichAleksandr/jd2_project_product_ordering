package by.pvt.dao;

import by.pvt.model.ProductOrder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BaseDaoImpl<T> {

    public List<T> find() {
        return List.of(testData("1"),testData("2"),testData("3"));
    }

    public boolean add(List<T> items) {
        return false;
    }


    private T testData(String prefix) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.setId(prefix);
        productOrder.setCategory("category" + prefix);
        productOrder.setDescription("Description" + prefix);

        return (T) productOrder;
    }


}
