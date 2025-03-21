package com.mru.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mru.entity.Mobiles;
import com.mru.entity.Students;

public interface MruRepo extends JpaRepository<Students, java.lang.Integer> {

}
