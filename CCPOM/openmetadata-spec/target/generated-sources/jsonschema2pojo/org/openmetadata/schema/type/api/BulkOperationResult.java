
package org.openmetadata.schema.type.api;

import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.ApiStatus;


/**
 * BulkOperationResult
 * <p>
 * Represents result of bulk Operation performed on entities.
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
    "successRequest",
    "failedRequest"
})
@Generated("jsonschema2pojo")
public class BulkOperationResult {

    /**
     * True if the operation has dryRun flag enabled
     * 
     */
    @JsonProperty("dryRun")
    @JsonPropertyDescription("True if the operation has dryRun flag enabled")
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
     * Request that can be processed successfully.
     * 
     */
    @JsonProperty("successRequest")
    @JsonPropertyDescription("Request that can be processed successfully.")
    @Valid
    private List<BulkResponse> successRequest = null;
    /**
     * Failure Request that can be processed successfully.
     * 
     */
    @JsonProperty("failedRequest")
    @JsonPropertyDescription("Failure Request that can be processed successfully.")
    @Valid
    private List<BulkResponse> failedRequest = null;

    /**
     * True if the operation has dryRun flag enabled
     * 
     */
    @JsonProperty("dryRun")
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * True if the operation has dryRun flag enabled
     * 
     */
    @JsonProperty("dryRun")
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public BulkOperationResult withDryRun(Boolean dryRun) {
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

    public BulkOperationResult withStatus(ApiStatus status) {
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

    public BulkOperationResult withAbortReason(String abortReason) {
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

    public BulkOperationResult withNumberOfRowsProcessed(Integer numberOfRowsProcessed) {
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

    public BulkOperationResult withNumberOfRowsPassed(Integer numberOfRowsPassed) {
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

    public BulkOperationResult withNumberOfRowsFailed(Integer numberOfRowsFailed) {
        this.numberOfRowsFailed = numberOfRowsFailed;
        return this;
    }

    /**
     * Request that can be processed successfully.
     * 
     */
    @JsonProperty("successRequest")
    public List<BulkResponse> getSuccessRequest() {
        return successRequest;
    }

    /**
     * Request that can be processed successfully.
     * 
     */
    @JsonProperty("successRequest")
    public void setSuccessRequest(List<BulkResponse> successRequest) {
        this.successRequest = successRequest;
    }

    public BulkOperationResult withSuccessRequest(List<BulkResponse> successRequest) {
        this.successRequest = successRequest;
        return this;
    }

    /**
     * Failure Request that can be processed successfully.
     * 
     */
    @JsonProperty("failedRequest")
    public List<BulkResponse> getFailedRequest() {
        return failedRequest;
    }

    /**
     * Failure Request that can be processed successfully.
     * 
     */
    @JsonProperty("failedRequest")
    public void setFailedRequest(List<BulkResponse> failedRequest) {
        this.failedRequest = failedRequest;
    }

    public BulkOperationResult withFailedRequest(List<BulkResponse> failedRequest) {
        this.failedRequest = failedRequest;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BulkOperationResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("successRequest");
        sb.append('=');
        sb.append(((this.successRequest == null)?"<null>":this.successRequest));
        sb.append(',');
        sb.append("failedRequest");
        sb.append('=');
        sb.append(((this.failedRequest == null)?"<null>":this.failedRequest));
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
        result = ((result* 31)+((this.successRequest == null)? 0 :this.successRequest.hashCode()));
        result = ((result* 31)+((this.dryRun == null)? 0 :this.dryRun.hashCode()));
        result = ((result* 31)+((this.numberOfRowsPassed == null)? 0 :this.numberOfRowsPassed.hashCode()));
        result = ((result* 31)+((this.failedRequest == null)? 0 :this.failedRequest.hashCode()));
        result = ((result* 31)+((this.numberOfRowsProcessed == null)? 0 :this.numberOfRowsProcessed.hashCode()));
        result = ((result* 31)+((this.numberOfRowsFailed == null)? 0 :this.numberOfRowsFailed.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BulkOperationResult) == false) {
            return false;
        }
        BulkOperationResult rhs = ((BulkOperationResult) other);
        return (((((((((this.abortReason == rhs.abortReason)||((this.abortReason!= null)&&this.abortReason.equals(rhs.abortReason)))&&((this.successRequest == rhs.successRequest)||((this.successRequest!= null)&&this.successRequest.equals(rhs.successRequest))))&&((this.dryRun == rhs.dryRun)||((this.dryRun!= null)&&this.dryRun.equals(rhs.dryRun))))&&((this.numberOfRowsPassed == rhs.numberOfRowsPassed)||((this.numberOfRowsPassed!= null)&&this.numberOfRowsPassed.equals(rhs.numberOfRowsPassed))))&&((this.failedRequest == rhs.failedRequest)||((this.failedRequest!= null)&&this.failedRequest.equals(rhs.failedRequest))))&&((this.numberOfRowsProcessed == rhs.numberOfRowsProcessed)||((this.numberOfRowsProcessed!= null)&&this.numberOfRowsProcessed.equals(rhs.numberOfRowsProcessed))))&&((this.numberOfRowsFailed == rhs.numberOfRowsFailed)||((this.numberOfRowsFailed!= null)&&this.numberOfRowsFailed.equals(rhs.numberOfRowsFailed))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
