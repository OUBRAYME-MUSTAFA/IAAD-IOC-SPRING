package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class preSpringAnnotaion {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext( "metier","ext","dao");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("vesrion Annotation !!!!!!!!!!!");
        System.out.println("resultat = "+metier.calcul());
    }
}
