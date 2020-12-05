package sg.edu.iss.demo.car;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
    
	public ArrayList<Car> findByBrandLike(String s);
	public ArrayList<Car> findByPriceGreaterThan(int p);
	
}
