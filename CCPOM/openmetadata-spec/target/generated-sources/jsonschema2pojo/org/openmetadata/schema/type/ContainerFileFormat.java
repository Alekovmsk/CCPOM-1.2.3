
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.schema.EnumInterface;


/**
 * This schema defines the file formats for the object/files within a container.
 * 
 */
@Generated("jsonschema2pojo")
public enum ContainerFileFormat
    implements EnumInterface
{

    Zip("zip"),
    Gz("gz"),
    Zstd("zstd"),
    Csv("csv"),
    Tsv("tsv"),
    Json("json"),
    Parquet("parquet"),
    Avro("avro");
    private final String value;
    private final static Map<String, ContainerFileFormat> CONSTANTS = new HashMap<String, ContainerFileFormat>();

    static {
        for (ContainerFileFormat c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ContainerFileFormat(String value) {
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
    public static ContainerFileFormat fromValue(String value) {
        ContainerFileFormat constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
