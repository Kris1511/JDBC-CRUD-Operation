package com.DemoMail.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DemoMail.entity.MailEntity;

public interface MailRepo extends JpaRepository<MailEntity, Integer>{

}
