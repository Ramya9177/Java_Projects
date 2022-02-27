package com.zensar.training.db;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.training.bean.Person;
@Repository
public interface PersonDAO extends JpaRepository<Person, Integer> {

}