package com.tej.bookstore.catalog.domain;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    Optional<ProductEntity> findByCode(
            String name); // sprindatajpa has feature derived query. strips method name and try to come up with the
    // where clause to find the value
}
