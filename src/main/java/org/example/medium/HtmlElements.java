package org.example.medium;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Have the function htmlElements(str) read the str parameter being passed
 * which will be a string of HTML DOM elements and plain text.
 * ---
 * The elements that will be used are: b, i, em, div, p.
 * For example: if str is "<div><b><p>hello world</p></b></div>" then this string of DOM elements
 * is nested correctly so your program should return the string true.
 * ---
 * If a string is not nested correctly, return the first element encountered where,
 * if changed into a different element, would result in a properly formatted string.
 * ---
 * If the string is not formatted properly,
 * then it will only be one element that needs to be changed.
 * For example: if str is "<div><i>hello</i>world</b>"
 * then your program should return the string div
 * because if the first <div> element were changed into a <b>,
 * the string would be properly formatted.
 */

/**
 * Process a string to prepare for further inspection.
 * 1. convert to lowercase
 * 2. remove text content between tags
 * 3. add spaces between tags
 * 4. remove multiple spaces
 * 5. trim (remove leading and trailing spaces)
 * 6. split to array of strings
 */

public class HtmlElements {
    private static final Stack<String> stack = new Stack<>();

    private static String[] parseElements(String str) {
        return str
                .toLowerCase()
                .replaceAll(">[^<]+", ">")
                .replaceAll("([>])(?=[<])", "$1 ")
                .replaceAll(" +", " ")
                .trim().split(" ");
    }

    private static boolean isOpeningTag(String tag) {
        Pattern pattern = Pattern.compile("<[a-z]>|<[a-z][a-z1-9]+>");
        Matcher matcher = pattern.matcher(tag);
        return matcher.find();
    }

    private static boolean isClosingTag(String tag) {
        Pattern pattern = Pattern.compile("</[a-z]>|</[a-z][a-z1-9]+>");
        Matcher matcher = pattern.matcher(tag);
        return matcher.find();
    }

    private static String getTagValue(String tag) {
        return tag.replaceAll("[></]", "");
    }

    public static String htmlElements(String str) {
        String[] parsedTags = parseElements(str);
        for (String tag : parsedTags) {
            if (isOpeningTag(tag)) {
                stack.push(tag);
            } else if (isClosingTag(tag) && !stack.isEmpty()) {
                if (getTagValue(stack.peek()).equals(getTagValue(tag))) {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty() ? "true" : getTagValue(stack.peek());
    }
}
