package com.lab8.task2;

import java.util.HashMap;

/**
 * Class for controlling the News objects.
 */
public class ControllerNews {

    /**
     * Dictionary with 'id' and 'News' fields.
     */
    private HashMap<Integer, News> arrayNews;

    /**
     * Creates ControllerNews object.
     * @param arrayNews dictionary.
     */
    public ControllerNews(HashMap<Integer, News> arrayNews) {
        this.arrayNews = arrayNews;
    }

    /**
     * Method for viewing the article by the id.
     * @param id article id.
     * @throws IllegalArgumentException when key does not exists.
     */
    public void view(int id) throws IllegalArgumentException {
        if (!arrayNews.containsKey(id)) {
            throw new IllegalArgumentException("There is no such key!");
        } else {
            System.out.println(arrayNews.get(id));
        }
    }

    /**
     * Method for viewing info about article.
     * @param id article id.
     * @param title new title.
     * @throws IllegalArgumentException when key does not exists.
     */
    public void edit(int id, String title) throws IllegalArgumentException {
        if (!arrayNews.containsKey(id)) {
            throw new IllegalArgumentException("There is no such key!");
        } else {
            arrayNews.get(id).changeNews(title);
            System.out.println("New version of the article:\n");
            view(id);
        }
    }
}
