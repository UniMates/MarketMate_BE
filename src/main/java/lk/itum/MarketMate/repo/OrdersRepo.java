package lk.itum.MarketMate.repo;

import lk.itum.MarketMate.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepo extends JpaRepository<Orders,String> {
}
