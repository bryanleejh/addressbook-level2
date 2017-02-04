package seedu.addressbook.ui;

import static seedu.addressbook.common.Messages.*;

import java.util.ArrayList;
import java.util.List;

import seedu.addressbook.Main;
import seedu.addressbook.commands.CommandResult;
import seedu.addressbook.data.person.ReadOnlyPerson;

public class Formatter {

	/**
	 * A decorative prefix added to the beginning of lines printed by
	 * AddressBook
	 */
	private static final String LINE_PREFIX = "|| ";

	/** A platform independent line separator. */
	private static final String LS = System.lineSeparator();

	private static final String DIVIDER = "===================================================";

	
	/**
	 * Format of a comment input line. Comment lines are silently consumed when
	 * reading user input.
	 */
	private static final String COMMENT_LINE_FORMAT_REGEX = "#.*";
	
	/** Default constructor */
	public Formatter() {
	}
	
	/** Returns format of message asking for user command. */
	public static String getUserCommandFormat() {
		return LINE_PREFIX + "Enter command: ";
	}
	
	 /** Returns true if the String line is a comment line. */
	public static boolean isCommentLine(String line) {
		return line.trim().matches(COMMENT_LINE_FORMAT_REGEX);
	}
	
	/** Returns format of message asking for user command. */
	public static String echoUserCommandFormat(String fullInputLine) {
		return LINE_PREFIX + "[Command entered:" + fullInputLine + "]" + LS;
	}
	
	/** Formats welcome message to user */
	public static String welcomeMessageFormat(String storageFileInfo) {
		return showToUserFormat(DIVIDER, DIVIDER, MESSAGE_WELCOME, Main.VERSION, MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE,
				storageFileInfo, DIVIDER);
	}
	
	/** Formats goodbye message to user */
	public static String goodByeMessageFormat() {
		return showToUserFormat(MESSAGE_GOODBYE, DIVIDER, DIVIDER);
	}
	
	/** Formats initFailed message to user */
	public static String initFailedMessageFormat() {
		return showToUserFormat(MESSAGE_INIT_FAILED, DIVIDER, DIVIDER);
	}
	
	/** Formats message(s) to the user */
	public static String showToUserFormat(String... message) {
		final StringBuilder formattedString = new StringBuilder();
		for (String m : message) {
			formattedString.append(LINE_PREFIX + m.replace("\n", LS + LINE_PREFIX)).append(LS);
		}
		return formattedString.toString();	
	}
	
	/** Formats result to user format to user */
	public static String showResultToUserFormat(CommandResult result) {
		return showToUserFormat(result.feedbackToUser, DIVIDER);
	}
	
}
