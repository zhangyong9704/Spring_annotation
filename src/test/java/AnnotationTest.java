import com.example.bean.Person;
import com.example.config.MainConfig;
import com.example.config.MyConfig;
import com.example.config.MyDataSourcesConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zy
 * @version 1.0.0
 * @ClassName AnnotationTest.java
 * @Description
 * @CreateDate 2021-02-20  21:58:40
 */
public class AnnotationTest {

    @Test
    public void applicationTest(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
        Person person = (Person) applicationContext.getBean("person");

        System.out.println(person);
    }

    @Test
    public void applicationTest2(){
        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(MyConfig.class);

        Person person1 = (Person) annotationContext.getBean("person");
        Person person2 = (Person) annotationContext.getBean("person");

        System.out.println(person1==person2);
    }

    @Test
    public void IOCApplicationTest(){
        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        String[] beanDefinitionNames = annotationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        };
    }

    @Test
    public void IOCApplicationTest2(){
        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(MyConfig.class);

        String[] beanDefinitionNames = annotationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        };
    }


    @Test
    public void IOCApplicationTest3(){
        //创建一个空的容器
        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
        //设置需要激活的环境
        annotationContext.getEnvironment().setActiveProfiles("dev","prod");
        //注册主配置类
        annotationContext.register(MyDataSourcesConfig.class);
        //刷新启动容器
        annotationContext.refresh();

        String[] beanDefinitionNames = annotationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        };
    }

}
