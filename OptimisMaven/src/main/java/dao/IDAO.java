package dao;

import java.util.List;

//T => Type d'objet, K=> type de la primary key
public interface IDAO<T,K> {
	
	
	public List<T> findAll();
	
	public T findById(K id);
	
	public T save(T object);
	
	public void delete(T object);

}