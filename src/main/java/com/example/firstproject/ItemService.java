package com.example.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    // **** start get request methods ****

    // find all items
    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }

    // find item with specific id
    public Optional<Item> getItemById(Long id){
        return itemRepository.findById(id);
    }
    // **** end get request methods ****

    // **** Start Post request methods ****

    // add new item method
    public Item saveItem(Item item){
        return itemRepository.save(item);
    }

    // **** end Post(Add) request methods ****

    // **** Start delete request methods ****

    // delete item method
    public void deleteItem(Long id){
        itemRepository.deleteById(id);
    }
    // **** End delete request methods ****

}
