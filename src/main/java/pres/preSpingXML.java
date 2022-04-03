package pres;
import metier.IMetier;
import metier.MetierImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class preSpingXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "applicationContext.xml");
        IMetier metier = (IMetier) context.getBean("meteir");
        System.out.println("vesrion spring !!!!!!!!!!!");
        System.out.println("resultat = "+metier.calcul());


    }
}
