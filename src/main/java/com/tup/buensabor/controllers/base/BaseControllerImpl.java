package com.tup.buensabor.controllers.base;

import com.tup.buensabor.dtos.BaseDto;
import com.tup.buensabor.entities.Base;
import com.tup.buensabor.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public abstract class BaseControllerImpl<E extends Base, D extends BaseDto, S extends BaseServiceImpl<E, D, Long>>
        implements BaseController<E, Long> {
    @Autowired
    protected S servicio;

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {

            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Error: " + e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Error: " + e.getMessage());
        }
    }

    @GetMapping("/paged")
    public ResponseEntity<?> getAll(Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAll(pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Error: " + e.getMessage());
        }
    }
}
