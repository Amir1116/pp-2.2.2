package hiber.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CarImpl implements Car{
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Car> getCars(int count) {
        return null;
    }
}
