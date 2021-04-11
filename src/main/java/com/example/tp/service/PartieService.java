package com.example.tp.service;

import com.example.tp.bean.Partie;
import com.example.tp.dao.PartieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PartieService {
    @Autowired
    private PartieDao partieDao;

    public Partie findByLibelle(String libelle) {
        return partieDao.findByLibelle(libelle);
    }

    public List<Partie> findByNomLikeAndPrenomLike(String nom, String prenom) {
        return partieDao.findByNomLikeAndPrenomLike(nom, prenom);
    }

    @Transactional
    public int deleteByLibelle(String libelle) {
        return partieDao.deleteByLibelle(libelle);
    }

    public List<Partie> findAll() {
        return partieDao.findAll();
    }

    public Partie getOne(Long aLong) {
        return partieDao.getOne(aLong);
    }

    public int save(Partie partie) {
        if(findByLibelle(partie.getLibelle())!=null){
            return -1;
        } else{
            partieDao.save(partie);
            return 1;
        }
    }
}
