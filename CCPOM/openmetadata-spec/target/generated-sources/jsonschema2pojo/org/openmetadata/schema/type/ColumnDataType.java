
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This enum defines the type of data stored in a column.
 * 
 */
@Generated("jsonschema2pojo")
public enum ColumnDataType {

    NUMBER("NUMBER"),
    TINYINT("TINYINT"),
    SMALLINT("SMALLINT"),
    INT("INT"),
    BIGINT("BIGINT"),
    BYTEINT("BYTEINT"),
    BYTES("BYTES"),
    FLOAT("FLOAT"),
    DOUBLE("DOUBLE"),
    DECIMAL("DECIMAL"),
    NUMERIC("NUMERIC"),
    TIMESTAMP("TIMESTAMP"),
    TIMESTAMPZ("TIMESTAMPZ"),
    TIME("TIME"),
    DATE("DATE"),
    DATETIME("DATETIME"),
    INTERVAL("INTERVAL"),
    STRING("STRING"),
    MEDIUMTEXT("MEDIUMTEXT"),
    TEXT("TEXT"),
    CHAR("CHAR"),
    LONG("LONG"),
    VARCHAR("VARCHAR"),
    BOOLEAN("BOOLEAN"),
    BINARY("BINARY"),
    VARBINARY("VARBINARY"),
    ARRAY("ARRAY"),
    BLOB("BLOB"),
    LONGBLOB("LONGBLOB"),
    MEDIUMBLOB("MEDIUMBLOB"),
    MAP("MAP"),
    STRUCT("STRUCT"),
    UNION("UNION"),
    SET("SET"),
    GEOGRAPHY("GEOGRAPHY"),
    ENUM("ENUM"),
    JSON("JSON"),
    UUID("UUID"),
    VARIANT("VARIANT"),
    GEOMETRY("GEOMETRY"),
    BYTEA("BYTEA"),
    AGGREGATEFUNCTION("AGGREGATEFUNCTION"),
    ERROR("ERROR"),
    FIXED("FIXED"),
    RECORD("RECORD"),
    NULL("NULL"),
    SUPER("SUPER"),
    HLLSKETCH("HLLSKETCH"),
    PG_LSN("PG_LSN"),
    PG_SNAPSHOT("PG_SNAPSHOT"),
    TSQUERY("TSQUERY"),
    TXID_SNAPSHOT("TXID_SNAPSHOT"),
    XML("XML"),
    MACADDR("MACADDR"),
    TSVECTOR("TSVECTOR"),
    UNKNOWN("UNKNOWN"),
    CIDR("CIDR"),
    INET("INET"),
    CLOB("CLOB"),
    ROWID("ROWID"),
    LOWCARDINALITY("LOWCARDINALITY"),
    YEAR("YEAR"),
    POINT("POINT"),
    POLYGON("POLYGON"),
    TUPLE("TUPLE"),
    SPATIAL("SPATIAL"),
    TABLE("TABLE"),
    NTEXT("NTEXT"),
    IMAGE("IMAGE"),
    IPV_4("IPV4"),
    IPV_6("IPV6"),
    DATETIMERANGE("DATETIMERANGE");
    private final String value;
    private final static Map<String, ColumnDataType> CONSTANTS = new HashMap<String, ColumnDataType>();

    static {
        for (ColumnDataType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ColumnDataType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ColumnDataType fromValue(String value) {
        ColumnDataType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
