
import org.junit.Assert;
import org.junit.Test;

public class PalindromosTest {
    
    @Test
    public void PalindromosTest_unValor() {
        BuscadorPalindromos buscaPalindromo = new BuscadorPalindromos(1);
        buscaPalindromo.isPalindromo();
        Assert.assertTrue(buscaPalindromo.isPalindromo());
    }
}