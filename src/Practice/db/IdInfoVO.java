package Practice.db;

public class IdInfoVO {
	
private Integer id_num;
private String id_name;
private String id_pwd;
private String id_id;

@Override
public String toString() {
	return "IdInfoVO [id_num=" + id_num + ", id_name=" + id_name + ", id_pwd=" + id_pwd + ", id_id=" + id_id + "]";
	
}
public Integer getId_num() {
	return id_num;
}
public void setId_num(Integer id_num) {
	this.id_num = id_num;
}
public String getId_name() {
	return id_name;
}
public void setId_name(String id_name) {
	this.id_name = id_name;
}
public String getId_pwd() {
	return id_pwd;
}
public void setId_pwd(String id_pwd) {
	this.id_pwd = id_pwd;
}
public String getId_id() {
	return id_id;
}
public void setId_id(String id_id) {
	this.id_id = id_id;
}
}