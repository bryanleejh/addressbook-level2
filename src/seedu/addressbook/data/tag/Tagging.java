package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

/**
 * Represents addition or deletion of a tag in addressbook
 */

public class Tagging {
    private Person personInvolved;
    private Tag tagInvolved;
    private action status;
    private enum action {ADDED, DELETED};
    
    /**
     * Creates a tagging using data about person, tag, and status.
     */
    public Tagging(Person personInvolved, Tag tagInvolved, action status) {
        this.personInvolved = personInvolved;
        this.tagInvolved = tagInvolved;
        this.status = action.ADDED;
    }
    
    /**
     * Creates a string to be returned involving status, name and tag.
     */
    public String toString() {
        return status + " " + personInvolved.getName().toString() + " " + tagInvolved.toString();
    }
    
}