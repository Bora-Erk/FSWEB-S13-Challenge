package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = Math.max(giro, 0);
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGiro(double giro) {
        this.giro = Math.max(giro, 0);
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Hatalı index: " + index);
            return;
        }

        if (developerNames[index] == null) {
            developerNames[index] = name;
        } else {
            System.out.println("Bu index zaten dolu: " + index);
        }
    }

    @Override
    public String toString() {
        StringBuilder devs = new StringBuilder();
        for (String dev : developerNames) {
            if (dev != null) devs.append(dev).append(", ");
        }
        return "Company{id=" + id + ", name='" + name + "', giro=" + giro + ", developers=[" + devs + "]}";
    }
}

