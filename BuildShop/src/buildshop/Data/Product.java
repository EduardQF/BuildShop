package BuildShop.Data;

public class Product {
	private String id;
	private String code;
	private String name;
	private int cost;
	private int price;
	private int stock;
	private String unit;
	private boolean status;

	/**
	 * Constructor para lectura de archivo
	 * 
	 * @param id
	 *            numero de identificacion del producto
	 * 
	 * @param code
	 *            codigo de busqueda del producto
	 * @param name
	 *            nombre del producto
	 * 
	 * @param cost
	 *            costo del producto
	 * 
	 * @param price
	 *            precio de venta del producto
	 * 
	 * @param stock
	 *            la cantidad en stock del producto
	 * 
	 * @param unit
	 *            unidad de medida del producto
	 * 
	 * @param status
	 *            estado del producto
	 */
	public Product(String id, String code, String name, int cost, int price, int stock, String unit, boolean status) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.cost = cost;
		this.price = price;
		this.stock = stock;
		this.unit = unit;
		this.status = status;
	}

	/**
	 * Constructor para nuevos productos
	 * 
	 * @param id
	 *            numero de identificacion del producto
	 * 
	 * @param code
	 *            codigo de busqueda del producto
	 * @param name
	 *            nombre del producto
	 * 
	 * @param cost
	 *            costo del producto
	 * 
	 * @param price
	 *            precio de venta del producto
	 * 
	 * @param stock
	 *            la cantidad en stock del producto
	 * 
	 * @param unit
	 *            unidad de medida del producto
	 *
	 */
	public Product(String id, String code, String name, int cost, int price, int stock, String unit) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.cost = cost;
		this.price = price;
		this.stock = stock;
		this.unit = unit;
		this.status = true;
	}

	public void setID(String s) {
		id = s;
	}

	public String getID() {
		return id;
	}

	public void setCode(String s) {
		code = s;
	}

	public String getCode() {
		return code;
	}

	public void setName(String s) {
		name = s;
	}

	public String getName() {
		return name;
	}

	public void setCost(int s) {
		cost = s;
	}

	public int getCost() {
		return cost;
	}

	public void setPrice(int s) {
		price = s;
	}

	public int getPrice() {
		return price;
	}

	public void setStock(int s) {
		stock = s;
	}

	public int getStock() {
		return stock;
	}

	public void setUnit(String s) {
		unit = s;
	}

	public String getUnit() {
		return unit;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
