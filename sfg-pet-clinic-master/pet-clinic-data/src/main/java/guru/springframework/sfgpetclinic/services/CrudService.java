package guru.springframework.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findAll();
    T findById(ID id);
    T save (T object);
    void delete(T object);
    void deleteById(ID id);
}
//Note:
//Bizim yazdıgımız crud interface'i. h2'ye kaydetme veya okuma işlemi yapılmıyor. db yerine veriler map'den okunuyor map'e yazılıyor.
