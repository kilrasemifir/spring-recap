package semifir.kira.recap.services;

import java.util.List;

public interface CRUDService<T> {
    List<T> findAll();

    <S extends T> S save(S entity);

    T findById(Long id);

    void deleteById(Long aLong);
}
