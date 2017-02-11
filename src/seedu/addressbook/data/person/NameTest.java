package seedu.addressbook.data.person;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {
    private Name name;

    public void setup() throws IllegalValueException {
        name = new Name("Bryan");
    }

    /**
     * Tests for isSimilar method
     * 
     * @throws IllegalValueException
     */

    @Test
    public void isSimilar_sameName() throws IllegalValueException {
        Name other = new Name("Bryan");
        assertTrue(name.isSimilar(other));
    }

    @Test
    public void isSimilar_lowerCaseName() throws IllegalValueException {
        Name other = new Name("bryan");
        assertTrue(name.isSimilar(other));
    }

    @Test
    public void isSimilar_diffName() throws IllegalValueException {
        Name other = new Name("Joseph");
        assertFalse(name.isSimilar(other));
    }

}