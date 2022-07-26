package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Internaute;

public interface IService<T> {

	List<T> findAll();

	T saveOrUpdate(T o);

	Optional<T> findById(Long id);

	Long delete(Long id);

	Optional<List<T>> findByNom(String nom);

}
