import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorldBean1 =
                (HelloWorld) context.getBean("helloworld");
        HelloWorld helloWorldBean2 =
                (HelloWorld) context.getBean("helloworld");

        Cat catBean1 = (Cat) context.getBean("cat");
        Cat catBean2 = (Cat) context.getBean("cat");

        System.out.println(helloWorldBean1 == helloWorldBean2);
        System.out.println(catBean1 == catBean2);

    }
}