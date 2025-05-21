package org.example.entity;

import java.util.Objects;

public class Task {
    private String project;
    private String description;
    private String assignee;

    private Status status; //added
    private Priority priority; //added



    public  Task(String project,String description,String assignee, Status status,Priority priority){
        this.project=project;
        this.description=description;
        this.assignee=assignee;
        this.status=status;
        this.priority=priority;


    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getProject() {
        return this.project;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }
    public String getAssignee() {
        return this.assignee;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Priority getPriority() {
        return this.priority;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return this.status;
    }

    //Task'ın eşsizliğini project ve description değerleri birlikte belirler.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(project, task.project) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project, description);
    }

    @Override
    public String toString() {
        return "Task{" +
                "project='" + project + '\'' +
                ", description='" + description + '\'' +
                ", assignee='" + assignee + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                '}';
    }

}
