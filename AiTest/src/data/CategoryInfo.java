package data;

public class CategoryInfo {
	
	private int id;//��ʾ����Ϣ�����ԣ�1�����Ǵ𰸣�0��
	private String info;
	
	public CategoryInfo(int id,String info)
	{
		this.id=id;
		this.info=info;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	

}
