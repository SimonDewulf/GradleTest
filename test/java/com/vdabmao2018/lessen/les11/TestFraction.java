package com.vdabmao2018.lessen.les11;

import com.vdabmao2018.lessen.les11.Fraction;
import org.junit.*;

public class TestFraction {

    @BeforeClass //deze methode wordt 1 keer uitgevoerd voor alle testen samen

    @Before //wordt voor elke test uitgevoerd


    @After // wordt na alle tests uitgevoerd

     // ==> cycle: @Before, @Test(specifieke test), @AFter

    @AfterClass // deze methode wordt na alle testen 1 keer uitgevoerd. after = na elke test. afterClass is na alle testen.

    @Test
    public void correctSimplify(){
        Fraction a = new Fraction(1,4);
        a.simplify().printFraction();

        Assert.assertTrue(a.simplify().getNoemer()<= a.getNoemer() && a.simplify().getTeller() <= a.getTeller());

    }

    @Test
    public void testSimplifyBy3(){
        Fraction a = new Fraction(5, 45);
        Fraction b = a.simplify();

        Assert.assertEquals(b.getTeller(), 1);
        Assert.assertEquals(b.getTeller(), 9);

        //Assert.assertTrue(a.simplify().noemer<= a.noemer && a.simplify().teller <= a.teller);
    }

    @Test
    public void testAddFraction() {
        Fraction a = new Fraction(5, 13);
        Fraction b = new Fraction(6, 3);

        Fraction c = a.addFraction(b);


        Assert.assertEquals(31, c.getTeller());
        Assert.assertEquals(13, c.getNoemer());

    }

     @Test
     public void testSubtractFraction(){
         Fraction a = new Fraction(5,13);
         Fraction b = new Fraction(6,3);

         Fraction c = a.subtractFraction(b);

         Assert.assertEquals(-21, c.getTeller());
         Assert.assertEquals(13, c.getNoemer());


        }







    }





