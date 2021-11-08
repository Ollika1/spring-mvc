package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {

    @Autowired
    CarDao carDao;

    public CarServiceImp() {
    }

    @Override
    public List<Car> getCarList(int n){
        return carDao.getList().stream().limit(n).collect(Collectors.toList());
    }

}
