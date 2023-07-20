package com.complaint.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.complaint.entities.Feedback;

@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, Integer>{
	public Feedback findByCid(int cid);
}
