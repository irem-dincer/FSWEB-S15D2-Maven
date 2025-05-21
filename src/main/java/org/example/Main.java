package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        Set<String> uniqueWords = StringSet.findUniqueWords();
        System.out.println("Unique words count: " + uniqueWords.size());
        System.out.println("Unique words in alphabetical order:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        Set<Task> annsTasks=new HashSet<>();
        Task taskAnn=new Task("java","dmfkdf","ann", Status.IN_PROGRESS, Priority.HIGH);
        Set<Task> bobsTasks=new HashSet<>();
        Task taskAnn2=new Task("java","kjefje","bob", Status.IN_PROGRESS, Priority.HIGH);
        Set<Task> carolsTasks=new HashSet<>();
        Set<Task> unassignedTasks=new HashSet<>();
        TaskData taskData=new TaskData(annsTasks,bobsTasks,carolsTasks,unassignedTasks);



    }





}