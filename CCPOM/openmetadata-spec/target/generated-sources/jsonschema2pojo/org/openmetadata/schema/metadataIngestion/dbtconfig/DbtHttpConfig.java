
package org.openmetadata.schema.metadataIngestion.dbtconfig;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DBT HTTP Config
 * <p>
 * DBT Catalog, Manifest and Run Results HTTP path configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dbtCatalogHttpPath",
    "dbtManifestHttpPath",
    "dbtRunResultsHttpPath"
})
@Generated("jsonschema2pojo")
public class DbtHttpConfig {

    /**
     * DBT Catalog HTTP File Path
     * <p>
     * DBT catalog http file path to extract dbt models with their column schemas.
     * 
     */
    @JsonProperty("dbtCatalogHttpPath")
    @JsonPropertyDescription("DBT catalog http file path to extract dbt models with their column schemas.")
    private String dbtCatalogHttpPath;
    /**
     * DBT Manifest HTTP File Path
     * <p>
     * DBT manifest http file path to extract dbt models and associate with tables.
     * (Required)
     * 
     */
    @JsonProperty("dbtManifestHttpPath")
    @JsonPropertyDescription("DBT manifest http file path to extract dbt models and associate with tables.")
    @NotNull
    private String dbtManifestHttpPath;
    /**
     * DBT Run Results HTTP File Path
     * <p>
     * DBT run results http file path to extract the test results information.
     * 
     */
    @JsonProperty("dbtRunResultsHttpPath")
    @JsonPropertyDescription("DBT run results http file path to extract the test results information.")
    private String dbtRunResultsHttpPath;

    /**
     * DBT Catalog HTTP File Path
     * <p>
     * DBT catalog http file path to extract dbt models with their column schemas.
     * 
     */
    @JsonProperty("dbtCatalogHttpPath")
    public String getDbtCatalogHttpPath() {
        return dbtCatalogHttpPath;
    }

    /**
     * DBT Catalog HTTP File Path
     * <p>
     * DBT catalog http file path to extract dbt models with their column schemas.
     * 
     */
    @JsonProperty("dbtCatalogHttpPath")
    public void setDbtCatalogHttpPath(String dbtCatalogHttpPath) {
        this.dbtCatalogHttpPath = dbtCatalogHttpPath;
    }

    public DbtHttpConfig withDbtCatalogHttpPath(String dbtCatalogHttpPath) {
        this.dbtCatalogHttpPath = dbtCatalogHttpPath;
        return this;
    }

    /**
     * DBT Manifest HTTP File Path
     * <p>
     * DBT manifest http file path to extract dbt models and associate with tables.
     * (Required)
     * 
     */
    @JsonProperty("dbtManifestHttpPath")
    public String getDbtManifestHttpPath() {
        return dbtManifestHttpPath;
    }

    /**
     * DBT Manifest HTTP File Path
     * <p>
     * DBT manifest http file path to extract dbt models and associate with tables.
     * (Required)
     * 
     */
    @JsonProperty("dbtManifestHttpPath")
    public void setDbtManifestHttpPath(String dbtManifestHttpPath) {
        this.dbtManifestHttpPath = dbtManifestHttpPath;
    }

    public DbtHttpConfig withDbtManifestHttpPath(String dbtManifestHttpPath) {
        this.dbtManifestHttpPath = dbtManifestHttpPath;
        return this;
    }

    /**
     * DBT Run Results HTTP File Path
     * <p>
     * DBT run results http file path to extract the test results information.
     * 
     */
    @JsonProperty("dbtRunResultsHttpPath")
    public String getDbtRunResultsHttpPath() {
        return dbtRunResultsHttpPath;
    }

    /**
     * DBT Run Results HTTP File Path
     * <p>
     * DBT run results http file path to extract the test results information.
     * 
     */
    @JsonProperty("dbtRunResultsHttpPath")
    public void setDbtRunResultsHttpPath(String dbtRunResultsHttpPath) {
        this.dbtRunResultsHttpPath = dbtRunResultsHttpPath;
    }

    public DbtHttpConfig withDbtRunResultsHttpPath(String dbtRunResultsHttpPath) {
        this.dbtRunResultsHttpPath = dbtRunResultsHttpPath;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DbtHttpConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dbtCatalogHttpPath");
        sb.append('=');
        sb.append(((this.dbtCatalogHttpPath == null)?"<null>":this.dbtCatalogHttpPath));
        sb.append(',');
        sb.append("dbtManifestHttpPath");
        sb.append('=');
        sb.append(((this.dbtManifestHttpPath == null)?"<null>":this.dbtManifestHttpPath));
        sb.append(',');
        sb.append("dbtRunResultsHttpPath");
        sb.append('=');
        sb.append(((this.dbtRunResultsHttpPath == null)?"<null>":this.dbtRunResultsHttpPath));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.dbtManifestHttpPath == null)? 0 :this.dbtManifestHttpPath.hashCode()));
        result = ((result* 31)+((this.dbtCatalogHttpPath == null)? 0 :this.dbtCatalogHttpPath.hashCode()));
        result = ((result* 31)+((this.dbtRunResultsHttpPath == null)? 0 :this.dbtRunResultsHttpPath.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DbtHttpConfig) == false) {
            return false;
        }
        DbtHttpConfig rhs = ((DbtHttpConfig) other);
        return ((((this.dbtManifestHttpPath == rhs.dbtManifestHttpPath)||((this.dbtManifestHttpPath!= null)&&this.dbtManifestHttpPath.equals(rhs.dbtManifestHttpPath)))&&((this.dbtCatalogHttpPath == rhs.dbtCatalogHttpPath)||((this.dbtCatalogHttpPath!= null)&&this.dbtCatalogHttpPath.equals(rhs.dbtCatalogHttpPath))))&&((this.dbtRunResultsHttpPath == rhs.dbtRunResultsHttpPath)||((this.dbtRunResultsHttpPath!= null)&&this.dbtRunResultsHttpPath.equals(rhs.dbtRunResultsHttpPath))));
    }

}
