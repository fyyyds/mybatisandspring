import com.fy.dao.CustomerDao;
import com.fy.mapper.CustomerMapper;
import com.fy.pojo.Customer;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {
    @Test
    public void dao() {
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDao customerDao = factory.getBean(CustomerDao.class);
        Customer customer = customerDao.selectCustomerById(2);
        System.out.println(customer);
    }

    @Test
    public void factory() {
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerMapper customerMapper = factory.getBean(CustomerMapper.class);
        Customer customer = customerMapper.selectCustomerById(2);
        System.out.println(customer);
    }

}
