package com.cap.sakila.sakiladatabase.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.sakila.sakiladatabase.hib.Actor;

public interface ActorRepository extends JpaRepository<Actor, Short> {
	public Actor findById(short id);
}
