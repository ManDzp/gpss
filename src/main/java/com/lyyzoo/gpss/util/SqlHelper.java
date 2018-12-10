package com.lyyzoo.gpss.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

public class SqlHelper {
    private static Properties properties = new Properties();
    private static ThreadLocal<Connection> local = new ThreadLocal<Connection>();

    static {
        try {
            properties.load(SqlHelper.class.getClassLoader().getResourceAsStream("jdbc.properties"));

        } catch (IOException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    static {
        try {
            Class.forName(properties.getProperty("driver"));
        } catch (ClassNotFoundException e) {
            System.out.println("����ʧ��");
            throw new RuntimeException("����ʧ��", e);
        }
    }

    public static Connection openConnection() {
        Connection conn = local.get();
        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("password"));
                local.set(conn);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("���ݿ�����ʧ��", e);
        }
        return conn;

    }

    public static ResultSet selectSql(String sql, Object... obj) {
        ResultSet rs = null;
        Connection conn = openConnection();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            if (obj.length != 0) {
                for (int i = 0; i < obj.length; i++) {
                    pst.setObject(i + 1, obj[i]);
                }
            }
            rs = pst.executeQuery();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new RuntimeException("��ѯʧ��", e);
        }

        return rs;
    }

//	public static <T>List<T> selectSql1(String sql,R<T> r,Object ...obj){
//		ResultSet rs=null;
//		Connection conn=openConnection();
//		List<T> rows=null;
//		PreparedStatement pst=null;
//		try {
//			pst=conn.prepareStatement(sql);
//			if(obj.length!=0){
//				for(int i=0;i<obj.length;i++){
//					pst.setObject(i+1, obj[i]);
//				}
//			}
//			rs=pst.executeQuery();
//			rows=r.maping(rs);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			throw new RuntimeException("��ѯʧ��",e);
//		}finally{
//			if(rs!=null){
//				try {
//					rs.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//			if(pst!=null){
//				try {
//					pst.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		return rows;
//	}


    public static List<HashMap<String, Object>> selectSql2(String sql, Object... obj) {
        ResultSet rs = null;
        Connection conn = openConnection();
        List<HashMap<String, Object>> rows = new ArrayList<HashMap<String, Object>>();
        PreparedStatement pst = null;
        try {
            pst = conn.prepareStatement(sql);
            if (obj.length != 0) {
                for (int i = 0; i < obj.length; i++) {
                    pst.setObject(i + 1, obj[i]);
                }
            }
            rs = pst.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int length = rsm.getColumnCount();
            while (rs.next()) {
                HashMap<String, Object> map = new HashMap<String, Object>();
                for (int i = 0; i < length; i++) {
                    String s = rsm.getColumnLabel(i + 1);
                    map.put(s, rs.getObject(s));
                }
                rows.add(map);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("��ѯʧ��", e);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return rows;
    }

    public static void close() {

        Connection con = local.get();

        if (con != null) {

            try {

                con.close();

                local.remove();

                con = null;

            } catch (SQLException e) {

                e.printStackTrace();

            }

        }

    }

    public static int updateSql(String sql, Object... obj) {
        int i1 = 0;
        Connection conn = openConnection();
        PreparedStatement pst = null;
        try {
            pst = conn.prepareStatement(sql);
            if (obj.length != 0) {
                for (int i = 0; i < obj.length; i++) {
                    pst.setObject(i + 1, obj[i]);
                }
            }
            i1 = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return i1;
    }

    interface R<T> {
        public List<T> maping(ResultSet rs);
    }
}