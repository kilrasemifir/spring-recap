package semifir.kira.recap.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public abstract class AbstractCRUDService<T> implements semifir.kira.recap.services.CRUDService<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractCRUDService.class);
    private String modelCible;
    private JpaRepository<T, Long> repository;

    public AbstractCRUDService(JpaRepository<T, Long> repository, String modelCible) {
        this.repository = repository;
        this.modelCible = modelCible;
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public <S extends T> S save(S entity) {
        return repository.save(entity);
    }

    @Override
    public T findById(Long id) {
        return repository.findById(id)
                .orElseThrow(()->{
                    LOGGER.warn("Attention, l'id "+id+
                            " de l'entité "+this.modelCible+
                            " n'est pas un id valide");
                    return new ResponseStatusException(HttpStatus.NOT_FOUND);
                });
    }

    @Override
    public void deleteById(Long id) {
        try{
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e){
            LOGGER.warn("Impossible de supprimer l'entité "+this.modelCible+ "l'entité d'id "+id+":"+e.getMessage());
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
