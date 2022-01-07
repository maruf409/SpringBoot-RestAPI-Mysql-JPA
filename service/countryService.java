package source.code.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import source.code.entity.city;
import source.code.entity.country;
import source.code.repository.countryRepository;

import java.util.List;

@Service
public class countryService {
    @Autowired
    private countryRepository repo1;

    public country addOrUpdate(country contrys){
        return repo1.save(contrys);
    }

    public boolean deleteById(int id){
        repo1.deleteById(id);
        return true;
    }
    public List<country> getAll(){
        return repo1.findAll();
    }
    public country getById(int id){
        return repo1.findById(id).get();
    }
}
