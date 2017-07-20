//====================================================================================================//
import java.sql.*;
//====================================================================================================//
public class DB_Conn_ 
{
// JDBC driver name and database URL
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
static final String DB_URL      = "jdbc:mysql://localhost:3306/demo";

// DB connection attributes
static final String USER        = "student";
static final String PASS        = "student";

public static void db_cr() 
{
/*1.*/ Connection conn = null;
       Statement  stmt = null;
       String sql      = "";
/*2.*/ try
{
// Register JDBC driver
/*2.1.*/ Class.forName(JDBC_DRIVER);
// Open a connection
conn = DriverManager.getConnection(DB_URL, USER, PASS);

// Execute a query
stmt = conn.createStatement();

// Check if "Etherios" table is there
DatabaseMetaData dbm = conn.getMetaData();
ResultSet tbls = dbm.getTables(null, null, "Etherios", null);
/*2.2.*/ if (tbls.next() == false)
{	
       sql = "CREATE TABLE Etherios " +
		     "(npp          VARCHAR(255) not NULL, " +
             " cstId        VARCHAR(255), " + 
		     " dataTtl      VARCHAR(255), " +
             " dataType     VARCHAR(255), " + 
             " description  VARCHAR(255), " + 
             " forwardTo    VARCHAR(255), " + 
		     " rollupTtl    VARCHAR(255), " +
             " streamId     VARCHAR(255), " + 
             " units        VARCHAR(255), " + 
             " PRIMARY KEY ( npp ))"; 
stmt.executeUpdate(sql);
} // 2.2.
/*2.3.*/ sql = "DELETE FROM Etherios";
stmt.executeUpdate(sql);
/*2.4.*/ for (int i = 0; i < Main_.result.getResultSize_(); i++)
{	
int     T_npp   = i;
String  T_CstId = Main_.result.getDataStream_().get(i).getCstId_();

String  T_dataTtl     = Main_.result.getDataStream_().get(i).getDataTtl_();
String  T_dataType    = Main_.result.getDataStream_().get(i).getDataType_();
String  T_description = Main_.result.getDataStream_().get(i).getDescription_();
String  T_forwardTo   = Main_.result.getDataStream_().get(i).getForwardTo_();
String  T_rollupTtl   = Main_.result.getDataStream_().get(i).getRollupTtl_();
String  T_streamId    = Main_.result.getDataStream_().get(i).getStreamId_();
String  T_units       = Main_.result.getDataStream_().get(i).getUnits_();

sql = "insert into Etherios "  +  
"(npp, cstId, dataTtl, dataType, description, forwardTo, rollupTtl, streamId, units) values " + 
"(" + T_npp + ",'"  + T_CstId     + "','" + T_dataTtl  + "','" + T_dataType + "','" + T_description + "','" + 
T_forwardTo + "','" + T_rollupTtl + "','" + T_streamId + "','" + T_units + "')";
stmt.executeUpdate(sql);
} // 2.4.
///*2.5.*/ stmt.executeUpdate(sql);
} // 2.
/*3.*/ catch(SQLException se)
{ // Handle errors for JDBC
se.printStackTrace();
}
/*4.*/ catch(Exception e)
{ // Handle errors for Class.forName
e.printStackTrace();
}
/*5.*/ finally
{
//finally block used to close resources
/*5.1.*/ try
{
/*5.1.1.*/ if (stmt != null)  stmt.close();
} // 5.1.
/*5.2.*/ catch(SQLException se2)
{
} // 5.2.
/*5.3.*/ try
{
/*5.3.1.*/ if (conn != null)  conn.close();
} // 5.3.
/*5.4.*/ catch(SQLException se)
{
se.printStackTrace();
} // 5.4.
} // 5.
} // public static void db_cr() 
} // public class DB_Conn_
//====================================================================================================//
