package com.visitRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visitModel.Loginuser;

public interface Loginrepo extends JpaRepository<Loginuser, String> {

}
