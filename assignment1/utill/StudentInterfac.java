package utill;

import java.util.Collection;

public interface StudentInterfac <T,K>{
     //all read
	Collection<T>getAll();
	 //calling
	T getOne(K key); 
	//create
	void add(T t);
}
