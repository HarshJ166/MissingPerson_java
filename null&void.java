// import java.io.*;
// import java.sql.*;

// import javax.lang.model.element.Name;
 
// class demo{
//     private static final String Name = null;

//     /**;;
//      * @param args
//      * @throws Exception
//      */
//     public static void main(String[] args) throws Exception
//     {
//         String url
//             = "jdbc:mysql://localhost:3306/missing_person_web"; // table details
//         String username = "root"; // MySQL credentials
//         String password = "";
//         String query
//             = "select * from missing"; // query to be run
//         Class.forName(
//             "com.mysql.cj.jdbc.Driver"); // Driver name
//         Connection con = DriverManager.getConnection(
//             url, username, password);
            
        

//             System.out.println(
//                 "Connection Established successfully");
//             Statement st = con.createStatement();
//             ResultSet rs
//                 = st.executeQuery(query); // Execute query
//             rs.next();
//             String name
//                 = rs.getString("name"); // Retrieve name from db  
//             System.out.println(name); // Print result on console
    
                      
//             int mobile_no
//                 = rs.getInt("mobile_no"); // Retrieve name from db  
//                 System.out.println(mobile_no);    
            
                   
//             String gender
//                 = rs.getString("gender"); // Retrieve name from db  
//                 System.out.println(gender);   
                
//             int dob
//                 = rs.getInt("dob");
//                 System.out.println(dob);
    
//             String address
//                 = rs.getString("address");
//                 System.out.println(address);
            
//             int aadhar
//                 =rs.getInt("aadhar");
//                 System.out.println(aadhar);
//             String m_name
//                 =rs.getString("m_name");
//                 System.out.println(m_name);
//             String f_name
//                 =rs.getString("f_name");
//                 System.out.println(f_name);
            
//             String email
//                 =rs.getString("email");
//                 System.out.println(email);
    
//             String relation
//                 =rs.getString("relation");
//                 System.out.println(relation);
    
//             String last_loc
//                 =rs.getString("last_loc");
//                 System.out.println(last_loc);
                
//             String skin_color
//                 =rs.getString("skin_color");
//                 System.out.println(skin_color);    
            
    
    
    
    
//             st.close(); // close statement
//             con.close(); // close connection
            
//             System.out.println("Connection Closed....");
//         }
//     }