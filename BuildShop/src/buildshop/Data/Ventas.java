package BuildShop.Data;

import java.util.Calendar;

@SuppressWarnings("deprecation")
public class Ventas {
	private String date;			//	fecha de la venta, formato año-mes-dia
	private String time;			//	hora de la venta, formato 24hrs
	private String id;				//	id de venta... num boleta?
	private String productID;		//	id producto
	private String productName;		//	nombre del producto
	private String productAmmo;		//	cantidad vendida
	private String productPrice;	//	precio unitario
	private String productTotal;	//	precio total de este producto
	private String total;			//	valor total de la boleta
	private String productStock;	//	stock post-venta
	private String userID;			//	id vendedor
	private String userName;		//	nombre(+apellido?) vendedor
	
	// Constructor para nuevas ventas.
	public Ventas(String id,String productID,String productName,String productAmmo,
			String productPrice,String productTotal,String total,String productStock,String userID,String userName){
		this.date = setDate();
		this.time = setTime();
		this.id = id;
		this.productID = productID;
		this.productName = productName;
		this.productAmmo = productAmmo;
		this.productPrice = productPrice;
		this.productTotal = productTotal;
		this.total = total;
		this.productStock = productStock;
		this.userID = userID;
		this.userName = userName;
	}
	
	// Constructor para lectura de archivo
	public Ventas(String date, String time,String id,String productID,String productName,String productAmmo,
			String productPrice,String productTotal,String total,String productStock,String userID,String userName){
		this.date = date;
		this.time = time;
		this.id = id;
		this.productID = productID;
		this.productName = productName;
		this.productAmmo = productAmmo;
		this.productPrice = productPrice;
		this.productTotal = productTotal;
		this.total = total;
		this.productStock = productStock;
		this.userID = userID;
		this.userName = userName;
	}

	private String setDate(){
		String y = String.valueOf(Calendar.getInstance().getTime().getYear()+1900);
		String m = String.valueOf((Calendar.getInstance().getTime().getMonth()+1));
		String d = String.valueOf(Calendar.getInstance().getTime().getDate());
		if (m.length() == 1){
			m = "0"+m;
		}
		if (d.length() == 1){
			d = "0"+d;
		}
		String date = y+"-"+m+"-"+d;
		return date;
	}
	
	private String setTime(){
		String h = String.valueOf(Calendar.getInstance().getTime().getHours());
		String m = String.valueOf((Calendar.getInstance().getTime().getMinutes()));
		String s = String.valueOf(Calendar.getInstance().getTime().getSeconds());
		if (h.length() == 1){
			h = "0"+h;
		}
		if (m.length() == 1){
			m = "0"+m;
		}
		if (s.length() == 1){
			s = "0"+s;
		}
		String time = h+"-"+m+"-"+s;
		return time;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductAmmo() {
		return productAmmo;
	}

	public void setProductAmmo(String productAmmo) {
		this.productAmmo = productAmmo;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductStock() {
		return productStock;
	}

	public void setProductStock(String productStock) {
		this.productStock = productStock;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProductTotal() {
		return productTotal;
	}
	public void setProductTotal(String productTotal) {
		this.productTotal = productTotal;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
}
