import java.util.Objects;

public class Person implements Comparable<Person> {
    private final String name;
    private final String family;
    private final Integer age;
    private final Sex sex;
    private final Education education;

    public Person(String name,
                  String family,
                  int age,
                  Sex sex,
                  Education education) {
        this.name = name.trim();
        this.family = family.trim();
        this.age = age;
        this.sex = sex;
        this.education = education;
    }

    public String getName() { return name; }
    public String getFamily() { return family; }
    public Integer getAge() { return age; }
    public Sex getSex() { return sex; }
    public Education getEducation() { return education; }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", education=" + education +
                '}';
    }

    @Override
    public int compareTo(Person other) {
        return (family +name).compareToIgnoreCase(other.family + other.name);
    }

    @Override
    public int hashCode() {
        return  age + Objects.hash(family + name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Person other = (Person) obj;
        return Objects.equals(family, other.family) &&
                Objects.equals(name, other.name);
    }

}