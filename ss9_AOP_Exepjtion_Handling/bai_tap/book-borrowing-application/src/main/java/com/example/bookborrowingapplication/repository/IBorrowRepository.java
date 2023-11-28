package com.example.bookborrowingapplication.repository;

import com.example.bookborrowingapplication.model.BorrowedCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IBorrowRepository extends JpaRepository<BorrowedCode, Integer> {
    @Query(value = "select * from borrowed_code where borrowed_code = :code ", nativeQuery = true)
    BorrowedCode checkBorrowedCode(@Param("code") int code);

}
