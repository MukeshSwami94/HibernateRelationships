package manytoone.pojo;

import  javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "student")
public class Student  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic(optional = false)
    protected String uuid = UUID.randomUUID().toString();

    private String name;

    private  int age;

    private long marks;
//    @ManyToOne(cascade = CascadeType.REMOVE)  @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "add_id")
    private Address address;



    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getMarks() {
        return marks;
    }

    public void setMarks(long marks) {
        this.marks = marks;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
