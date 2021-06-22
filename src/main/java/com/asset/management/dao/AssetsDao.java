package com.asset.management.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.asset.management.entity.Assets;

public interface AssetsDao extends JpaRepository<Assets ,Long>{

}
