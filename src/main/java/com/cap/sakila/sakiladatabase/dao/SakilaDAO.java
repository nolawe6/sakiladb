package com.cap.sakila.sakiladatabase.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cap.sakila.sakiladatabase.hib.Actor;
import com.cap.sakila.sakiladatabase.hib.ActorInfo;
import com.cap.sakila.sakiladatabase.hib.Staff;

//import com.cap.sakila.sakiladatabase.hib.Actor;

@Repository
@Transactional
public class SakilaDAO {
	
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//	
//	class ActorRowMapper implements RowMapper{
//
//		@Override
//		public Actor mapRow(ResultSet rs, int rowNum) throws SQLException {
//			Actor actor = new Actor();
//			actor.setActorId(rs.getShort("actor_id"));
//			actor.setFirstName(rs.getString("first_name"));
//			actor.setLastName(rs.getString("last_name"));
//			//actor.setLastUpdate.getString("location"));
//			actor.setLastUpdate(rs.getDate("last_update"));
//			return actor;
//		}
//		
//	}
//	
	
	@PersistenceContext
	private EntityManager em;
	
	public Staff getStaff(byte actor_id) {
		//Short val = new Short((short) 1.0);
		Actor actor=new Actor();
		Staff staff = new Staff();
		try {
			System.out.println("DAO");
//		    TypedQuery<Actor> tq = em.createQuery("from actor where actor_id=?", Actor.class);
//		    actor = tq.setParameter(1, "actor_id").getSingleResult();	
			byte staffId = (byte) 1.00;
			
			staff = em.find(Staff.class, staffId);
			System.out.println(staff.getFirstName());
			
			actor = em.find(Actor.class, (short)actor_id);
			
			System.out.println("after actor value: "+ actor.getFirstName());
			
		    // if there is no result
		} catch(NonUniqueResultException notUnique) {
		    // if more than one result
		}
		return staff;
	}
	
//	public List<Actor> findAll(){
//		return jdbcTemplate.query("select * from actor where actor_id = ?", new Object[]{1},  new ActorRowMapper());
//	}
	
}
