package com.tiedros.document.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiedros.document.entities.Document;

public interface DocumentRepository extends JpaRepository<Document, Long>{

}
