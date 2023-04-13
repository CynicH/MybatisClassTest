package mybatis.pojo;

public class c_course {
    public c_course() {
    }
    private Integer id;
    private String name;
    private Integer hours;
    private Integer school;

    @Override
    public String toString() {
        return "c_course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hours=" + hours +
                ", school=" + school +
                '}';
    }

    public c_course(Integer id, String name, Integer hours, Integer school, s_school schools) {
        this.id = id;
        this.name = name;
        this.hours = hours;
        this.school = school;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getSchool() {
        return school;
    }

    public void setSchool(Integer school) {
        this.school = school;
    }

    public c_course(Integer id, String name, Integer hours, Integer school) {
        this.id = id;
        this.name = name;
        this.hours = hours;
        this.school = school;
    }
}
