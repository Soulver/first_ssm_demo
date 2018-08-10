import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soulver.test.domain.Customer;
import soulver.test.mapper.CustomerMapper;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CustomerMapperTest {

    @Autowired
    private CustomerMapper customerMapper;

    @Test
    public void testSave(){
        Customer customer = new Customer();
        customer.setName("苏永");
        customer.setGender("男");
        customer.setAge(22);

        customerMapper.save(customer);
    }
}
