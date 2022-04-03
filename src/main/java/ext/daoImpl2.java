package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component
public class daoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version capture");
        return 6000;
    }
}
