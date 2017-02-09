package seedu.addressbook.data.person;

public abstract class Contact {
	protected String value;
	protected boolean isPrivate;

	public String toString() {
		return value;
	}

	public int hashCode() {
		return value.hashCode();
	}

	public boolean isPrivate() {
		return isPrivate;
	}

	public boolean equals(Object other) {
		return other == this // short circuit if same object
				|| (other instanceof Contact // instanceof handles nulls
						&& this.value.equals(((Contact) other).value)); // state
																		// check
	}
}