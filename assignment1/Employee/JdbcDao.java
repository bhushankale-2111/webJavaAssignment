package Employee;

import java.util.Collection;

public interface JdbcDao<T,K> {
	
Collection<T>getAll();
 
T getOne(K key); 
//create
void add(T t);

void update(T t);

void delete(K key);

}
