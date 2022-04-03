package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    private Calcul calcul;
    @Test
    public void TestSomme()
    {
        Calcul calcul = new Calcul();
        double a=8 , b=4;
        double res_expected = 12;
        double res_obtenu = calcul.somme(a,b);
        Assert.assertTrue(res_expected==res_obtenu);
    }
}
