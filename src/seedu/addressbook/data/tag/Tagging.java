package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
    private Person personInvolved;
    private Tag tagInvolved;
    private boolean isAdded;
    
    public Tagging(Person personInvolved, Tag tagInvolved, boolean isAdded) {
        this.personInvolved = personInvolved;
        this.tagInvolved = tagInvolved;
        this.isAdded = isAdded;
    }
    
}