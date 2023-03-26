package com.example.thesis.repository;

import com.example.thesis.model.DataModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataRepo extends JpaRepository<DataModel, Long> {

    @Query(nativeQuery = true, value = "SELECT * from sensordata ORDER BY time desc LIMIT 1")
    public List<DataModel> getAllData();

}
