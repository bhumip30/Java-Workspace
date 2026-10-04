package custome;

public class Order {
	
	int orderid;
	String cname;
	OrderStatus status;
	
	public Order(int orderid, String cname) {
		super();
		this.orderid = orderid;
		this.cname = cname;
		this.status = OrderStatus.CREATED;
	}
	
	public void changeStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", cname=" + cname + ", status=" + status + "]";
	}
	
	

}
