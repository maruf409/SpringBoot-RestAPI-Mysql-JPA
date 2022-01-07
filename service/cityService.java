package source.code.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import source.code.entity.city;
import source.code.entity.country;
import source.code.repository.cityRepository;


import java.util.List;
@Service
public class cityService {
    @Autowired
    private cityRepository repo;

    public city addOrUpdate(city citys){
        return repo.save(citys);
    }

    public boolean deleteById(int id){
        repo.deleteById(id);
        return true;
    }
    public List<city> getAll(){
        return repo.findAll();
    }
    public city getById(int id){
        return repo.findById(id).get();
    }
}
