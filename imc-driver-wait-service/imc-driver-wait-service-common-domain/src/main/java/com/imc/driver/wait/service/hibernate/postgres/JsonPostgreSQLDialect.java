package com.imc.driver.wait.service.hibernate.postgres;

import java.sql.Types;

import org.hibernate.dialect.PostgreSQL82Dialect;

//import org.hibernate.dialect.PostgreSQLDialect;

public class JsonPostgreSQLDialect extends PostgreSQL82Dialect {

	public JsonPostgreSQLDialect() {

		super();

		this.registerColumnType(Types.JAVA_OBJECT, "json");
	}
}