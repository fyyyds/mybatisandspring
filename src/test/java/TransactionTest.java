import com.fy.pojo.Customer;
import com.fy.service.CustomerService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获得CustomerServiceImpl对象
        CustomerService customerService = factory.getBean(CustomerService.class);
        // 添加客户
        Customer customer = new Customer();
        customer.setUsername("小明");
        customer.setJobs("小学生");
        customer.setPhone("110");
        customerService.addCustomer(customer);
    }
}
