package be.infernalwhale;

import be.infernalwhale.config.ComponentBuilder;
import be.infernalwhale.datalayer.EmployeeDAO;
import be.infernalwhale.servicelayer.SalaryService;
import be.infernalwhale.servicelayer.SalaryServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ComponentBuilder.class);

        SalaryService service = context.getBean(SalaryService.class);

        System.out.println("All done...");
        System.out.println(service instanceof SalaryServiceImpl);

    }
}
