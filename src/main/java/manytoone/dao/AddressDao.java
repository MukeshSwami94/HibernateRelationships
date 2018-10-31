package manytoone.dao;

import manytoone.pojo.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AddressDao extends CrudRepository<Address, Long> {
    Address findByUuid(@Param("uuid") String uuid);
}

