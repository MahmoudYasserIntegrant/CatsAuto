package Setup;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		String connectionUrl = "jdbc:sqlserver://10.1.22.122\\SQL2017;databaseName=HIAS_PIII_Production;encrypt=true;trustServerCertificate=true;user=BESTDev;password=DevBEST";
		Connection con = DriverManager.getConnection(connectionUrl);
		//"jdbc:sqlserver://10.1.22.122\\SQL2017/HIAS_PIII_Production;encrypt=true;trustServerCertificate=true;","BESTDev","DevBEST"
		
		Statement st = con.createStatement();
		ResultSet RS = st.executeQuery("SELECT * FROM Finance.InvoiceType AS it");
		
		while(RS.next())
		{
		
		int InvoiceTypeId = RS.getInt("InvoiceTypeId");
		String Code = RS.getString("Code");
		String Description = RS.getString("Description");
		
		System.out.println(InvoiceTypeId +" "+ Code +" "+ Description);
		}
		st.close();
		con.close();
		

	}

}
