package com.example.tp.service;

import com.example.tp.bean.Notaire;
import com.example.tp.dao.NotaireDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaireService {
    public Notaire findByReference(String ref) {
        return notaireDao.findByReference(ref);
    }

    public List<Notaire> findByReferenceLikeAndNomLike(String ref, String nom) {
        return notaireDao.findByReferenceLikeAndNomLike(ref, nom);
    }

    public List<Notaire> findByPassWordLike(String passWord) {
        return notaireDao.findByPassWordLike(passWord);
    }

    public List<Notaire> findAll() {
        return notaireDao.findAll();
    }

    public int  save(Notaire notaire) {
        if(findByReference(notaire.getReference())!=null){
            return -1;
        }else {
            notaireDao.save(notaire);
            return 1;
        }

    }

    @Autowired
    private NotaireDao notaireDao;
}
