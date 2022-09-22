package com.example.demo.interfaz;
import com.example.demo.entity.GradoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradoInterfaz extends CrudRepository<GradoEntity, Integer> {

}
