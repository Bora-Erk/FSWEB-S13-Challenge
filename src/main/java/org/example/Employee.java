package org.example;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthPlans = healthplans;
    }

    public void addHealthPlan(int index, String name) {
        if(index < 0 || index >= healthPlans.length) {
            System.out.println("Hatalı index: " + index);
            return;
        }

        if(healthPlans[index] == null) {
            healthPlans[index] = name;
        } else {
            System.out.println(("Bu index zaten dolu: " + index));
        }
    }

    @Override
    public String toString() {
        StringBuilder hp = new StringBuilder();
        for (String plan : healthPlans) {
            if (plan != null) hp.append(plan).append(", ");
        }
        return "Employee{id=" + id + ", name='" + fullName + "', email='" + email + "', healthplans=[" + hp + "]}";
    }
}
