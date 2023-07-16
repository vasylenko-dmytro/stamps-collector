package com.vasylenko.stampscollector.controller;

import com.vasylenko.stampscollector.domain.Item;
import com.vasylenko.stampscollector.exception.ResourceNotFoundException;
import com.vasylenko.stampscollector.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/items")
    public ResponseEntity<List<Item>> getItems() {
        List<Item> items = new ArrayList<>(itemService.findAll());
        if (items.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(items, HttpStatus.OK);
    }

    @GetMapping("/items/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable("id") Long id) {
        Item item = itemService.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Not found Item with id = " + id));
        return new ResponseEntity<>(item, HttpStatus.OK);
    }
}
