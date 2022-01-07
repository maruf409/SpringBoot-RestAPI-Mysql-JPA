package source.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import source.code.entity.city;
import source.code.service.cityService;

import java.util.List;

@RestController
@RequestMapping("/city")
public class cityController {

    @Autowired
    private cityService cityservices;

    @GetMapping
    private List<city> getAll(){
        return cityservices.getAll();
    }

    @GetMapping("/{id}")
    private city getById(@PathVariable int id){
        return cityservices.getById(id);
    }

    @PostMapping
    private city add(@RequestBody city citys){
        return cityservices.addOrUpdate(citys);
    }

    @PutMapping("/{id}")
    private city update(@PathVariable int id,@RequestBody city citys){
        citys.setCityId(id);
        return cityservices.addOrUpdate(citys);
    }

    @DeleteMapping("/{id}")
    private void delete(@PathVariable int id){
       cityservices.deleteById(id);
    }

}
