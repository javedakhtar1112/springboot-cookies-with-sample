package com.hendisantika.springbootcookiessample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hendisantika.springbootcookiessample.entity.Visitor;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-cookies-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/03/20
 * Time: 11.13
 */
public interface VisitorRepository extends JpaRepository<Visitor, String> {
}
