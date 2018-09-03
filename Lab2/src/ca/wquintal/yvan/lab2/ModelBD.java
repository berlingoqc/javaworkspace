package ca.wquintal.yvan.lab2;

import java.util.Locale;

class ModelDB {

	int	pk;
	String	text;
	int	num;
	String	date;
	float	numFloat;
	
	public ModelDB(int p, String t, int n, String d,float f) {
		pk = p;
		text = t;
		num = n;
		date = d;
		numFloat = f;
	}
	
	public int getPk() {
		return pk;
	}

	public void setPk(int pk) {
		this.pk = pk;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public float getNumFloat() {
		return numFloat;
	}

	public void setNumFloat(float numFloat) {
		this.numFloat = numFloat;
	}


	public String Insert() {
	return String.format(Locale.US,"INSERT INTO supertable (st_text,st_num,st_date,st_float) VALUES ('%s',%d,'%s',%f)",
		text,num,date,numFloat);
	}

	public String InsertPrepare(){
		return "INSERT INTO supertable (st_text,st_num,st_date,st_float) VALUES ( ?,?,?,? )";
	}
	public String Update() {
	return String.format(Locale.US,
		"UPDATE supertable SET st_text='%s', st_num=%d, st_date='%s', st_float=%f WHERE st_id=%d",text,num,date,numFloat,pk);
	}
	public String UpdatePrepare() {
		return "UPDATE supertable SET st_text=?,st_num=?,st_date=?,st_float=? WHERE st_id=?";
	}
	public String Delete(int pk) {
		return String.format(Locale.US,"DELETE FROM supertable WHERE st_id=%d", pk);
	}
	public String DeletePrepare() {
		return "DELETE FROM supertable WHERE st_id=?";
	}

}