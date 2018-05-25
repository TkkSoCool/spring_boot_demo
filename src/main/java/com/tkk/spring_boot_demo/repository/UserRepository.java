package com.tkk.spring_boot_demo.repository;

import com.tkk.spring_boot_demo.data.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created  on 2018-05-25
 *
 * @author 唐开阔
 * @describe
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
