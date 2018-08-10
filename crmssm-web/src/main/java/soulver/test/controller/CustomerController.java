package soulver.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import soulver.test.domain.Customer;
import soulver.test.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /**
     * 跳转到addcustomer.jsp
     */
    @RequestMapping("/addcustomer")
    public String addcustomer(){
        return "addcustomer";
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public String save(Customer customer){
        customerService.save(customer);
        return "successfully";
    }

}
