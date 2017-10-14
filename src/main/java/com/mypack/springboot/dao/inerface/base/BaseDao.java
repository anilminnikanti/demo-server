package com.mypack.springboot.dao.inerface.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.mypack.springboot.entity.base.BaseEntity;

@NoRepositoryBean
public interface BaseDao<T extends BaseEntity> extends JpaRepository<T, Long> {

}
