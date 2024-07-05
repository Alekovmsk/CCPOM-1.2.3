
package org.openmetadata.schema.metadataIngestion.dbtconfig;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DBT Local Config
 * <p>
 * DBT Catalog, Manifest and Run Results file path config.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dbtCatalogFilePath",
    "dbtManifestFilePath",
    "dbtRunResultsFilePath"
})
@Generated("jsonschema2pojo")
public class DbtLocalConfig {

    /**
     * DBT Catalog File Path
     * <p>
     * DBT catalog file path to extract dbt models with their column schemas.
     * 
     */
    @JsonProperty("dbtCatalogFilePath")
    @JsonPropertyDescription("DBT catalog file path to extract dbt models with their column schemas.")
    private String dbtCatalogFilePath;
    /**
     * DBT Manifest File Path
     * <p>
     * DBT manifest file path to extract dbt models and associate with tables.
     * (Required)
     * 
     */
    @JsonProperty("dbtManifestFilePath")
    @JsonPropertyDescription("DBT manifest file path to extract dbt models and associate with tables.")
    @NotNull
    private String dbtManifestFilePath;
    /**
     * DBT Run Results File Path
     * <p>
     * DBT run results file path to extract the test results information.
     * 
     */
    @JsonProperty("dbtRunResultsFilePath")
    @JsonPropertyDescription("DBT run results file path to extract the test results information.")
    private String dbtRunResultsFilePath;

    /**
     * DBT Catalog File Path
     * <p>
     * DBT catalog file path to extract dbt models with their column schemas.
     * 
     */
    @JsonProperty("dbtCatalogFilePath")
    public String getDbtCatalogFilePath() {
        return dbtCatalogFilePath;
    }

    /**
     * DBT Catalog File Path
     * <p>
     * DBT catalog file path to extract dbt models with their column schemas.
     * 
     */
    @JsonProperty("dbtCatalogFilePath")
    public void setDbtCatalogFilePath(String dbtCatalogFilePath) {
        this.dbtCatalogFilePath = dbtCatalogFilePath;
    }

    public DbtLocalConfig withDbtCatalogFilePath(String dbtCatalogFilePath) {
        this.dbtCatalogFilePath = dbtCatalogFilePath;
        return this;
    }

    /**
     * DBT Manifest File Path
     * <p>
     * DBT manifest file path to extract dbt models and associate with tables.
     * (Required)
     * 
     */
    @JsonProperty("dbtManifestFilePath")
    public String getDbtManifestFilePath() {
        return dbtManifestFilePath;
    }

    /**
     * DBT Manifest File Path
     * <p>
     * DBT manifest file path to extract dbt models and associate with tables.
     * (Required)
     * 
     */
    @JsonProperty("dbtManifestFilePath")
    public void setDbtManifestFilePath(String dbtManifestFilePath) {
        this.dbtManifestFilePath = dbtManifestFilePath;
    }

    public DbtLocalConfig withDbtManifestFilePath(String dbtManifestFilePath) {
        this.dbtManifestFilePath = dbtManifestFilePath;
        return this;
    }

    /**
     * DBT Run Results File Path
     * <p>
     * DBT run results file path to extract the test results information.
     * 
     */
    @JsonProperty("dbtRunResultsFilePath")
    public String getDbtRunResultsFilePath() {
        return dbtRunResultsFilePath;
    }

    /**
     * DBT Run Results File Path
     * <p>
     * DBT run results file path to extract the test results information.
     * 
     */
    @JsonProperty("dbtRunResultsFilePath")
    public void setDbtRunResultsFilePath(String dbtRunResultsFilePath) {
        this.dbtRunResultsFilePath = dbtRunResultsFilePath;
    }

    public DbtLocalConfig withDbtRunResultsFilePath(String dbtRunResultsFilePath) {
        this.dbtRunResultsFilePath = dbtRunResultsFilePath;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DbtLocalConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dbtCatalogFilePath");
        sb.append('=');
        sb.append(((this.dbtCatalogFilePath == null)?"<null>":this.dbtCatalogFilePath));
        sb.append(',');
        sb.append("dbtManifestFilePath");
        sb.append('=');
        sb.append(((this.dbtManifestFilePath == null)?"<null>":this.dbtManifestFilePath));
        sb.append(',');
        sb.append("dbtRunResultsFilePath");
        sb.append('=');
        sb.append(((this.dbtRunResultsFilePath == null)?"<null>":this.dbtRunResultsFilePath));
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
        result = ((result* 31)+((this.dbtCatalogFilePath == null)? 0 :this.dbtCatalogFilePath.hashCode()));
        result = ((result* 31)+((this.dbtRunResultsFilePath == null)? 0 :this.dbtRunResultsFilePath.hashCode()));
        result = ((result* 31)+((this.dbtManifestFilePath == null)? 0 :this.dbtManifestFilePath.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DbtLocalConfig) == false) {
            return false;
        }
        DbtLocalConfig rhs = ((DbtLocalConfig) other);
        return ((((this.dbtCatalogFilePath == rhs.dbtCatalogFilePath)||((this.dbtCatalogFilePath!= null)&&this.dbtCatalogFilePath.equals(rhs.dbtCatalogFilePath)))&&((this.dbtRunResultsFilePath == rhs.dbtRunResultsFilePath)||((this.dbtRunResultsFilePath!= null)&&this.dbtRunResultsFilePath.equals(rhs.dbtRunResultsFilePath))))&&((this.dbtManifestFilePath == rhs.dbtManifestFilePath)||((this.dbtManifestFilePath!= null)&&this.dbtManifestFilePath.equals(rhs.dbtManifestFilePath))));
    }

}
