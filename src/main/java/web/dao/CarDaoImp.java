package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao {
    private static final List<Car> list  = new ArrayList<>();

    public CarDaoImp() {
        list.add(new Car(3456,"BMW","green"));
        list.add(new Car(309876,"Toyota","white" ));
        list.add(new Car(284756, "Mercedes","black"));
        list.add(new Car(489768, "Mazda", "yellow"));
        list.add(new Car(7869, "Cadillac", "red"));
    }

    @Override
    public List<Car> getList() {
        return list;
    }

}
