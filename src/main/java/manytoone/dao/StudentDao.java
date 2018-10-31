package manytoone.dao;

import manytoone.pojo.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface StudentDao extends CrudRepository<Student,Long> {
    Student findByUuid(@Param("uuid") String uuid);
}
