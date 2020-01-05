
package com.nondt.backend.Repository;

import com.nondt.backend.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MaritalstatusRepository extends JpaRepository<Maritalstatus, Long> {
    Maritalstatus findById(long status_id);
}