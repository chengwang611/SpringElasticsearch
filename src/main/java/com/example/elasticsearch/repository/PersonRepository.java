// src/main/java/com/example/elasticsearch/repository/PersonRepository.java

package com.example.elasticsearch.repository;

import com.example.elasticsearch.model.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PersonRepository extends ElasticsearchRepository<Person, String> {
    // Custom query methods can be added here if needed
}
