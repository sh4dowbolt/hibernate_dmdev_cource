package com.suraev.type;

import jakarta.persistence.AttributeConverter;
import org.hibernate.dialect.Dialect;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.type.descriptor.WrapperOptions;
import org.hibernate.type.descriptor.jdbc.JdbcType;
import org.hibernate.usertype.UserType;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JsonType  implements UserType {
    @Override
    public int getSqlType() {
        return 0;
    }

    @Override
    public Class returnedClass() {
        return null;
    }

    @Override
    public boolean equals(Object x, Object y) {
        return UserType.super.equals(x, y);
    }

    @Override
    public int hashCode(Object x) {
        return UserType.super.hashCode(x);
    }


    @Override
    public Object nullSafeGet(ResultSet rs, int position, WrapperOptions options) throws SQLException {
        return UserType.super.nullSafeGet(rs, position, options);
    }

    @Override
    public void nullSafeSet(PreparedStatement st, Object value, int position, WrapperOptions options) throws SQLException {
        UserType.super.nullSafeSet(st, value, position, options);
    }

    @Override
    public Object deepCopy(Object value) {
        return null;
    }

    @Override
    public boolean isMutable() {
        return false;
    }

    @Override
    public Serializable disassemble(Object value) {
        return UserType.super.disassemble(value);
    }

    @Override
    public Object assemble(Serializable cached, Object owner) {
        return UserType.super.assemble(cached, owner);
    }

    @Override
    public Object replace(Object detached, Object managed, Object owner) {
        return UserType.super.replace(detached, managed, owner);
    }

    @Override
    public long getDefaultSqlLength() {
        return UserType.super.getDefaultSqlLength();
    }

    @Override
    public int getDefaultSqlPrecision() {
        return UserType.super.getDefaultSqlPrecision();
    }

    @Override
    public int getDefaultSqlScale() {
        return UserType.super.getDefaultSqlScale();
    }



    @Override
    public AttributeConverter getValueConverter() {
        return UserType.super.getValueConverter();
    }

    @Override
    public Boolean isComparable() {
        return UserType.super.isComparable();
    }
}
