
public class Computer {
    String name;
    String manu;
    int year;
    String detail;
    double price;
    // khai báo các thuộc tính của một computer
    // tạo tất cả các hàm dựng (có đối và không đối)
    // xây dựng các hàm getter, setter phù hợp với các thuộc tính
    // 

	public Computer() {
	}
	public Computer(String name, String manu, int year, String detail, double price) {
	    this.name = name;
	    this.manu = manu;
	    this.year = year;
	    this.detail = detail;
	    this.price = price;
	}

    // Hàm trả về một chuỗi thông tin của một máy tính, mỗi thuộc tính cách nhau một dấu cách
    @Override
    public String toString()
    {
        return (name + " " + manu + " " + year + " " + detail + " " + price);
    }
	public String getManu() {
	    return this.manu;
	}
	public double getPrice() {
	    return this.price;
	}
}
