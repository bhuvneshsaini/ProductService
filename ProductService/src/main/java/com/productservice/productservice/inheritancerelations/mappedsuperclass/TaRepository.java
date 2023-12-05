package com.productservice.productservice.inheritancerelations.mappedsuperclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("ms_tarepository")
public interface TaRepository extends JpaRepository<Ta, Long> {
    @Override
    Ta save(Ta ta);
}