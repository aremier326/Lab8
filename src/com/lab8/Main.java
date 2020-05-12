package com.lab8;

import com.lab8.task2.ControllerNews;
import com.lab8.task2.News;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        //FirstTask.StringBuilderResult();

        HashMap<Integer, News> arrayNews = new HashMap<>();
        arrayNews.put(1, new News("Ukrainians defeated Coronavirus."));
        arrayNews.put(2, new News("A legendary dish that ended the plague."));
        arrayNews.put(3, new News("The myth of being 'bad' at math."));
        arrayNews.put(4, new News("Why are Trump and Obama in a new spat."));
        arrayNews.put(5, new News("Robot dog enforcec social distancing in city park."));

        ArrayList<String> pathArray = new ArrayList<>();
        pathArray.add("view/1");
        pathArray.add("edit/1");
        pathArray.add("view/2");
        pathArray.add("edit/2");
        pathArray.add("view/3");
        pathArray.add("view/4");
        pathArray.add("view/5");

        ControllerNews controllerNews = new ControllerNews(arrayNews);

        for (String path: pathArray) {
            StringTokenizer st = new StringTokenizer(path, "/");

            if (st.nextToken().equals("view")) {
                controllerNews.view(Integer.parseInt(st.nextToken()));
            } else {
                System.out.print("Enter new title: ");
                controllerNews.edit(Integer.parseInt(st.nextToken()), new Scanner(System.in).nextLine());
            }
        }


    }
}
