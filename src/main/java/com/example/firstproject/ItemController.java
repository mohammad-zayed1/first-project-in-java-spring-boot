package com.example.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;
    // get all
    @GetMapping
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }
    // get one
    @GetMapping("/{id}")
    public Optional<Item> getItemById(@PathVariable Long id){
        return itemService.getItemById(id);
    }
    // add new
    @PostMapping
    public Item addItem(@RequestBody Item item){
        return itemService.saveItem(item);
    }
    // update one
    @PutMapping("/{id}")
    public Item updateItem(@PathVariable Long id , @RequestBody Item item){
        item.setId(id);
            return itemService.saveItem(item);
    }
    // delete one
    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id){
        itemService.deleteItem(id);
    }
}
