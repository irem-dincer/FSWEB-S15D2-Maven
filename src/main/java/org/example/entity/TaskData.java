package org.example.entity;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TaskData {

    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;


    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name) {
        switch (name) {
            case "ann":
                return this.annsTasks;
            case "bob":
                return this.bobsTasks;
            case "carol":
                return this.carolsTasks;
            case "all":
                return getUnion(annsTasks, bobsTasks, carolsTasks);

        }
        return  new HashSet<>();
    }

    public Set<Task> getUnion(Set<Task>... sets) {
        HashSet<Task> allTasks = new LinkedHashSet<>();
        for (Set<Task> tasks : sets) {
            allTasks.addAll(tasks);
        }
        return allTasks;
    }

    public Set<Task> getIntersection(Set<Task> set1, Set<Task> set2) {
        Set<Task> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }

    public Set<Task> getDifferences(Set<Task> set1, Set<Task> set2) {
        Set<Task> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        return differenceSet;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public Set<Task> getUnassignedTasks() {
        return unassignedTasks;
    }
}
