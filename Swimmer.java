public class Swimmer {
    String name;
    String surename;
    String membership;
    String discipline;
    String activity;
    String status;
    int age;

    public Swimmer(String name, String surename, String membership, String discipline, String status, String activity,
            int age) {
        this.name = name;
        this.surename = surename;
        this.membership = membership;
        this.discipline = discipline;
        this.status = status;
        this.activity = activity;
        this.age = age;
    };

    public int getAge() {
        return age;
    };

    public String getName() {
        return name;
    };

    public String getDiscipline() {
        return discipline;
    };

    public String getMembership() {
        return discipline;
    };

    public String getActivity() {
        return activity;
    }

    public String getSurename() {
        return surename;
    };

    public String getStatus() {
        return status;
    }

    public void setAge(int age) {
        this.age = age;
    };

    public void setName(String name) {
        this.name = name;
    };

    public void setSurename(String surename) {
        this.surename = surename;
    };

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    };

    public void setMembership(String membership) {
        this.membership = membership;
    };

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
