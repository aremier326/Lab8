package com.lab8.task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Class for some news articles.
 */
public class News {
    /**
     * Contains title of the article.
     */
    private String title;

    /**
     * Contains creation date of the article.
     */
    private Calendar dateCreation;

    /**
     * Contains changing date of the article.
     */
    private Calendar dateChange;

    /**
     * Creates new News object.
     * @param title title of the object.
     */
    public News(String title) {
        this.title = title;
        dateCreation = dateChange = Calendar.getInstance();
    }

    /**
     * Title getter.
     * @return title.
     */
    protected String getNews() {
        return title;
    }

    /**
     * Creation date getter.
     * @return dateCreation
     */
    protected Calendar getDateCreation() {
        return dateCreation;
    }

    /**
     * Changing date getter.
     * @return dateChange.
     */
    protected Calendar getDateChange() {
        return dateChange;
    }

    /**
     * Method for changing title of the article.
     * @param title new title.
     */
    protected void changeNews(String title) {
        this.title = title;
        dateChange = Calendar.getInstance();
    }

    /**
     * toString overriding.
     */
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.M.yyyy hh:mm:ss:S");
        
        StringBuilder output = new StringBuilder();
        output.append("Title: ").append(getNews()).append("\n").
                append("Created: ").append(dateFormat.format(getDateCreation().getTime())).append("\n").
                append("Changed: ").append(dateFormat.format(getDateChange().getTime())).append("\n");

        return output.toString();

    }
}
