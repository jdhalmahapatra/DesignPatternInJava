package com.designpattern.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	//using volatile to make this property variable thread safe
	private static volatile Database instance = null;
	private static volatile Connection conn = null;
	
	private Database() {
		try {
			DriverManager.registerDriver(null);
		}
		catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	public static Database getInstance() {
		if(instance == null) {
			synchronized(Database.class) {
				if(instance == null) {
					instance = new Database();
				}
			}
		}
		return instance;
	}
	
	public Connection getConnection() {
        if (conn == null) {
            synchronized (Database.class) {
                if (conn == null) {
                    try {
                        String dbUrl = "jdbc:derby:memory:upgrad/designpatterns;create=true";

                        conn = DriverManager.getConnection(dbUrl);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return conn;
    }
	
	
}
