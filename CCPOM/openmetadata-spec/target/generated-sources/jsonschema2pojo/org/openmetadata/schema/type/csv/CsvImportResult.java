
package org.openmetadata.schema.type.csv;

import javax.annotation.processing.Generated;
import javax.validation.constraints.DecimalMin;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.ApiStatus;


/**
 * csvImportResult
 * <p>
 * Represents result of importing a CSV file. Detailed error is provided on if the CSV file is conformant and failure to load any of the records in the CSV file.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dryRun",
    "status",
    "abortReason",
    "numberOfRowsProcessed",
    "numberOfRowsPassed",
    "numberOfRowsFailed",
    "importResultsCsv"
})
@Generated("jsonschema2pojo")
public class CsvImportResult {

    /**
     * True if the CSV import has dryRun flag enabled
     * 
     */
    @JsonProperty("dryRun")
    @JsonPropertyDescription("True if the CSV import has dryRun flag enabled")
    private Boolean dryRun;
    /**
     * State of an action over API.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("State of an action over API.")
    private ApiStatus status;
    /**
     * Reason why import was aborted. This is set only when the `status` field is set to `aborted`
     * 
     */
    @JsonProperty("abortReason")
    @JsonPropertyDescription("Reason why import was aborted. This is set only when the `status` field is set to `aborted`")
    private String abortReason;
    /**
     * Type used to indicate row count
     * 
     */
    @JsonProperty("numberOfRowsProcessed")
    @JsonPropertyDescription("Type used to indicate row count")
    @DecimalMin("0")
    private Integer numberOfRowsProcessed = 0;
    /**
     * Type used to indicate row count
     * 
     */
    @JsonProperty("numberOfRowsPassed")
    @JsonPropertyDescription("Type used to indicate row count")
    @DecimalMin("0")
    private Integer numberOfRowsPassed = 0;
    /**
     * Type used to indicate row count
     * 
     */
    @JsonProperty("numberOfRowsFailed")
    @JsonPropertyDescription("Type used to indicate row count")
    @DecimalMin("0")
    private Integer numberOfRowsFailed = 0;
    /**
     * CSV file that captures the result of import operation.
     * 
     */
    @JsonProperty("importResultsCsv")
    @JsonPropertyDescription("CSV file that captures the result of import operation.")
    private String importResultsCsv;

    /**
     * True if the CSV import has dryRun flag enabled
     * 
     */
    @JsonProperty("dryRun")
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * True if the CSV import has dryRun flag enabled
     * 
     */
    @JsonProperty("dryRun")
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public CsvImportResult withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * State of an action over API.
     * 
     */
    @JsonProperty("status")
    public ApiStatus getStatus() {
        return status;
    }

    /**
     * State of an action over API.
     * 
     */
    @JsonProperty("status")
    public void setStatus(ApiStatus status) {
        this.status = status;
    }

    public CsvImportResult withStatus(ApiStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Reason why import was aborted. This is set only when the `status` field is set to `aborted`
     * 
     */
    @JsonProperty("abortReason")
    public String getAbortReason() {
        return abortReason;
    }

    /**
     * Reason why import was aborted. This is set only when the `status` field is set to `aborted`
     * 
     */
    @JsonProperty("abortReason")
    public void setAbortReason(String abortReason) {
        this.abortReason = abortReason;
    }

    public CsvImportResult withAbortReason(String abortReason) {
        this.abortReason = abortReason;
        return this;
    }

    /**
     * Type used to indicate row count
     * 
     */
    @JsonProperty("numberOfRowsProcessed")
    public Integer getNumberOfRowsProcessed() {
        return numberOfRowsProcessed;
    }

    /**
     * Type used to indicate row count
     * 
     */
    @JsonProperty("numberOfRowsProcessed")
    public void setNumberOfRowsProcessed(Integer numberOfRowsProcessed) {
        this.numberOfRowsProcessed = numberOfRowsProcessed;
    }

    public CsvImportResult withNumberOfRowsProcessed(Integer numberOfRowsProcessed) {
        this.numberOfRowsProcessed = numberOfRowsProcessed;
        return this;
    }

    /**
     * Type used to indicate row count
     * 
     */
    @JsonProperty("numberOfRowsPassed")
    public Integer getNumberOfRowsPassed() {
        return numberOfRowsPassed;
    }

    /**
     * Type used to indicate row count
     * 
     */
    @JsonProperty("numberOfRowsPassed")
    public void setNumberOfRowsPassed(Integer numberOfRowsPassed) {
        this.numberOfRowsPassed = numberOfRowsPassed;
    }

    public CsvImportResult withNumberOfRowsPassed(Integer numberOfRowsPassed) {
        this.numberOfRowsPassed = numberOfRowsPassed;
        return this;
    }

    /**
     * Type used to indicate row count
     * 
     */
    @JsonProperty("numberOfRowsFailed")
    public Integer getNumberOfRowsFailed() {
        return numberOfRowsFailed;
    }

    /**
     * Type used to indicate row count
     * 
     */
    @JsonProperty("numberOfRowsFailed")
    public void setNumberOfRowsFailed(Integer numberOfRowsFailed) {
        this.numberOfRowsFailed = numberOfRowsFailed;
    }

    public CsvImportResult withNumberOfRowsFailed(Integer numberOfRowsFailed) {
        this.numberOfRowsFailed = numberOfRowsFailed;
        return this;
    }

    /**
     * CSV file that captures the result of import operation.
     * 
     */
    @JsonProperty("importResultsCsv")
    public String getImportResultsCsv() {
        return importResultsCsv;
    }

    /**
     * CSV file that captures the result of import operation.
     * 
     */
    @JsonProperty("importResultsCsv")
    public void setImportResultsCsv(String importResultsCsv) {
        this.importResultsCsv = importResultsCsv;
    }

    public CsvImportResult withImportResultsCsv(String importResultsCsv) {
        this.importResultsCsv = importResultsCsv;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CsvImportResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dryRun");
        sb.append('=');
        sb.append(((this.dryRun == null)?"<null>":this.dryRun));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("abortReason");
        sb.append('=');
        sb.append(((this.abortReason == null)?"<null>":this.abortReason));
        sb.append(',');
        sb.append("numberOfRowsProcessed");
        sb.append('=');
        sb.append(((this.numberOfRowsProcessed == null)?"<null>":this.numberOfRowsProcessed));
        sb.append(',');
        sb.append("numberOfRowsPassed");
        sb.append('=');
        sb.append(((this.numberOfRowsPassed == null)?"<null>":this.numberOfRowsPassed));
        sb.append(',');
        sb.append("numberOfRowsFailed");
        sb.append('=');
        sb.append(((this.numberOfRowsFailed == null)?"<null>":this.numberOfRowsFailed));
        sb.append(',');
        sb.append("importResultsCsv");
        sb.append('=');
        sb.append(((this.importResultsCsv == null)?"<null>":this.importResultsCsv));
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
        result = ((result* 31)+((this.abortReason == null)? 0 :this.abortReason.hashCode()));
        result = ((result* 31)+((this.dryRun == null)? 0 :this.dryRun.hashCode()));
        result = ((result* 31)+((this.numberOfRowsPassed == null)? 0 :this.numberOfRowsPassed.hashCode()));
        result = ((result* 31)+((this.numberOfRowsProcessed == null)? 0 :this.numberOfRowsProcessed.hashCode()));
        result = ((result* 31)+((this.numberOfRowsFailed == null)? 0 :this.numberOfRowsFailed.hashCode()));
        result = ((result* 31)+((this.importResultsCsv == null)? 0 :this.importResultsCsv.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CsvImportResult) == false) {
            return false;
        }
        CsvImportResult rhs = ((CsvImportResult) other);
        return ((((((((this.abortReason == rhs.abortReason)||((this.abortReason!= null)&&this.abortReason.equals(rhs.abortReason)))&&((this.dryRun == rhs.dryRun)||((this.dryRun!= null)&&this.dryRun.equals(rhs.dryRun))))&&((this.numberOfRowsPassed == rhs.numberOfRowsPassed)||((this.numberOfRowsPassed!= null)&&this.numberOfRowsPassed.equals(rhs.numberOfRowsPassed))))&&((this.numberOfRowsProcessed == rhs.numberOfRowsProcessed)||((this.numberOfRowsProcessed!= null)&&this.numberOfRowsProcessed.equals(rhs.numberOfRowsProcessed))))&&((this.numberOfRowsFailed == rhs.numberOfRowsFailed)||((this.numberOfRowsFailed!= null)&&this.numberOfRowsFailed.equals(rhs.numberOfRowsFailed))))&&((this.importResultsCsv == rhs.importResultsCsv)||((this.importResultsCsv!= null)&&this.importResultsCsv.equals(rhs.importResultsCsv))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
