
package pl.edu.amu.wmi.daut.base;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import junit.framework.TestCase;


/**
 *
 * @author Adam
 * 
 * klasa testuje poprawność działania metody
 * public void createAutomatonForFiniteLanguage
 * (DeterministicAutomatonSpecification automaton, Set<String> language)
 * w klasie DeterministicUtilities.
 */
public class TestDeterministicUtilities extends TestCase {

    /*
    * Testuje automat dla języka pustego.
    */
    /*public final void test1() {
        Set<String> language1 = new HashSet<String>();
        DeterministicAutomatonSpecification automaton1 =
        new NaiveDeterministicAutomatonSpecification();
        DeterministicUtilities.createAutomatonForFiniteLanguage(automaton1,  language1);
        Generator words1 = new Generator();
        List<String> accepted1 = words1.wordsFromAutomatonWithoutCycles(automaton1, "abc");
        assertTrue(compare(language1, accepted1));
    }

    /*
    * Testuje automat dla języka z tylko słowem pustym.
    */
    /*public final void test2() {

        Set<String> language2 = new HashSet<String>();
        language2.add("");
        DeterministicAutomatonSpecification automaton2 =
        new NaiveDeterministicAutomatonSpecification();
        DeterministicUtilities.createAutomatonForFiniteLanguage(automaton2,  language2);
        Generator words2 = new Generator();
        List<String> accepted2 = words2.wordsFromAutomatonWithoutCycles(automaton2, "abc");
        assertTrue(compare(language2, accepted2));
    }

    /*
    * Test Przykładowy.
    */
    public final void test3() {

        Set<String> language3 = new HashSet<String>();
        language3.add("kot");
        //language3.add("koty");
        language3.add("kok");
        language3.add("tyt");
        //language3.add("kotokokoojhooo");
        language3.add("b");
        language3.add("bok");
        language3.add("bokot");
        DeterministicAutomatonSpecification automaton3 =
        new NaiveDeterministicAutomatonSpecification();
        DeterministicUtilities.createAutomatonForFiniteLanguage(automaton3,  language3);
        Generator words3 = new Generator();
        List<String> accepted3 = words3.wordsFromAutomatonWithoutCycles(automaton3, "kotyjhb");
        assertTrue(compare(language3, accepted3));
    }

    /*
    * Test przykładowy ze słowem pustym.
    */
    /*public final void test4() {

        Set<String> language4 = new HashSet<String>();
        language4.add("");
        language4.add("kot");
        language4.add("koty");
        language4.add("kok");
        language4.add("kotokokoojhooo");
        language4.add("bok");
        language4.add("bokot");
        DeterministicAutomatonSpecification automaton4 =
        new NaiveDeterministicAutomatonSpecification();
        DeterministicUtilities.createAutomatonForFiniteLanguage(automaton4,  language4);
        Generator words4 = new Generator();
        List<String> accepted4 = words4.wordsFromAutomatonWithoutCycles(automaton4, "kotyjhb");
        assertTrue(compare(language4, accepted4));
    }
    
    /*
     * Metoda porównująca słowa akceptowane przez powstały automat ze słowami oczekiwanymi
     */
    private boolean compare(Set<String> language, List<String> acceptedWords) {
        int number = acceptedWords.size();

        if (language.size() == number) {
            for (String i : language) {
                for (String j : acceptedWords) {
                    if (i.equals(j)) {
                        number--;
                        //language.remove(i);
                        //acceptedWords.remove(j);
                        break;
                    }
                }
            }
            //if (language.isEmpty() && acceptedWords.isEmpty()) {
            if (number == 0)
                return true;
            else
                return false;
        }
        else
            return false;
    }
}