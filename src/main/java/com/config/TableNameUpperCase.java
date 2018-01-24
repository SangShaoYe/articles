package com.config;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

/**
 * Created by full on 2017/10/24.
 */
public class TableNameUpperCase extends PhysicalNamingStrategyStandardImpl {
    @Override
    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment context) {
        System.out.println("关联表："+name.getText());
        return super.toPhysicalTableName(name, context);
    }
}
