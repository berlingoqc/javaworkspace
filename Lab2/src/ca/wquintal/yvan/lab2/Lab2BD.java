package ca.wquintal.yvan.lab2;

import ca.wquintal.lib.*;
import ca.wquintal.lib.MyBD;
import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Lab2BD extends MyBD {

    private static final SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd",Locale.ENGLISH);

    private static Date GetDateFromString(String d) throws ParseException {
        return new Date(formatter.parse(d).getTime());
    }

    public Lab2BD() throws SQLException, ClassNotFoundException {
        super(new ConnectionInfo("localhost",
				"test", "wq", "office"));
    }

    public boolean AddModelBD(ModelDB model,boolean prepare) throws SQLException {
	String insert = model.Insert();
        if(!prepare) {
		Statement s = connection.createStatement();
		int ret = s.executeUpdate(insert);
		return true;
	} else {
		PreparedStatement p = connection.prepareStatement(model.InsertPrepare(),ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		p.clearParameters();
		p.setString(1, model.text);
		p.setInt(2, model.num);
		
		p.setString(3, model.getDate());
		p.setFloat(4, model.numFloat);
		ResultSet rs = p.executeQuery();
	}
	return true;
    }

    public boolean UpdateModelBD(ModelDB model, Boolean prepare) throws SQLException{
	if(!prepare) {
		Statement s = connection.createStatement();
		int ret = s.executeUpdate(model.Update());
		return true;
	} else {
		PreparedStatement p = connection.prepareStatement(model.UpdatePrepare(),ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		p.clearParameters();
		p.setString(1,model.text);
		p.setInt(2, model.num);
		p.setString(3, model.date);
		p.setFloat(4, model.numFloat);
		p.setInt(5, model.pk);
		p.executeQuery();
		return true;
	}
    }

    public boolean DeleteModelBD(int pk, Boolean prepare) throws SQLException {
	if(!prepare) {
		Statement s = connection.createStatement();
		s.executeQuery("DELETE FROM supertable WHERE st_id="+pk);
		return true;
	} else {
		PreparedStatement p = connection.prepareStatement("DELETE FROM supertable WHERE st_id=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		p.setInt(1, pk);
		p.executeQuery();
		return true;
	}
    }

    public ModelDB GetModel(int pk) {

        return null;
    }

    public ModelDB[] GetModels() {


        return null;
    }

}