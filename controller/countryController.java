package source.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import source.code.entity.country;
import source.code.service.countryService;

import java.util.List;

@RestController
@RequestMapping("/country")
public class countryController {

    @Autowired
    private countryService countryservices;

    @GetMapping
    private List<country> getAll(){
        return countryservices.getAll();
    }

    @GetMapping("/{id}")
    private country getById(@PathVariable int id){
        return countryservices.getById(id);
    }

    @PostMapping
    private country add(@RequestBody country countrys){
        return countryservices.addOrUpdate(countrys);
    }

    @PutMapping("/{id}")
    private country update(@PathVariable int id,@RequestBody country countrys){
        countrys.setCountryId(id);
        return countryservices.addOrUpdate(countrys);
    }

    @DeleteMapping("/{id}")
    private void delete(@PathVariable int id){
        countryservices.deleteById(id);
    }
}
