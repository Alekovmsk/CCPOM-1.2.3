
package org.openmetadata.schema.type;

import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This schema defines the type to capture the table's column profile.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "timestamp",
    "valuesCount",
    "valuesPercentage",
    "validCount",
    "duplicateCount",
    "nullCount",
    "nullProportion",
    "missingPercentage",
    "missingCount",
    "uniqueCount",
    "uniqueProportion",
    "distinctCount",
    "distinctProportion",
    "min",
    "max",
    "minLength",
    "maxLength",
    "mean",
    "sum",
    "stddev",
    "variance",
    "median",
    "firstQuartile",
    "thirdQuartile",
    "interQuartileRange",
    "nonParametricSkew",
    "histogram",
    "customMetricsProfile"
})
@Generated("jsonschema2pojo")
public class ColumnProfile {

    /**
     * Column Name.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Column Name.")
    @NotNull
    private String name;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    @NotNull
    private Long timestamp;
    /**
     * Total count of the values in this column.
     * 
     */
    @JsonProperty("valuesCount")
    @JsonPropertyDescription("Total count of the values in this column.")
    private Double valuesCount;
    /**
     * Percentage of values in this column with respect to row count.
     * 
     */
    @JsonProperty("valuesPercentage")
    @JsonPropertyDescription("Percentage of values in this column with respect to row count.")
    private Double valuesPercentage;
    /**
     * Total count of valid values in this column.
     * 
     */
    @JsonProperty("validCount")
    @JsonPropertyDescription("Total count of valid values in this column.")
    private Double validCount;
    /**
     * No.of Rows that contain duplicates in a column.
     * 
     */
    @JsonProperty("duplicateCount")
    @JsonPropertyDescription("No.of Rows that contain duplicates in a column.")
    private Double duplicateCount;
    /**
     * No.of null values in a column.
     * 
     */
    @JsonProperty("nullCount")
    @JsonPropertyDescription("No.of null values in a column.")
    private Double nullCount;
    /**
     * No.of null value proportion in columns.
     * 
     */
    @JsonProperty("nullProportion")
    @JsonPropertyDescription("No.of null value proportion in columns.")
    private Double nullProportion;
    /**
     * Missing Percentage is calculated by taking percentage of validCount/valuesCount.
     * 
     */
    @JsonProperty("missingPercentage")
    @JsonPropertyDescription("Missing Percentage is calculated by taking percentage of validCount/valuesCount.")
    private Double missingPercentage;
    /**
     * Missing count is calculated by subtracting valuesCount - validCount.
     * 
     */
    @JsonProperty("missingCount")
    @JsonPropertyDescription("Missing count is calculated by subtracting valuesCount - validCount.")
    private Double missingCount;
    /**
     * No. of unique values in the column.
     * 
     */
    @JsonProperty("uniqueCount")
    @JsonPropertyDescription("No. of unique values in the column.")
    private Double uniqueCount;
    /**
     * Proportion of number of unique values in a column.
     * 
     */
    @JsonProperty("uniqueProportion")
    @JsonPropertyDescription("Proportion of number of unique values in a column.")
    private Double uniqueProportion;
    /**
     * Number of values that contain distinct values.
     * 
     */
    @JsonProperty("distinctCount")
    @JsonPropertyDescription("Number of values that contain distinct values.")
    private Double distinctCount;
    /**
     * Proportion of distinct values in a column.
     * 
     */
    @JsonProperty("distinctProportion")
    @JsonPropertyDescription("Proportion of distinct values in a column.")
    private Double distinctProportion;
    /**
     * Minimum value in a column.
     * 
     */
    @JsonProperty("min")
    @JsonPropertyDescription("Minimum value in a column.")
    private Object min;
    /**
     * Maximum value in a column.
     * 
     */
    @JsonProperty("max")
    @JsonPropertyDescription("Maximum value in a column.")
    private Object max;
    /**
     * Minimum string length in a column.
     * 
     */
    @JsonProperty("minLength")
    @JsonPropertyDescription("Minimum string length in a column.")
    private Double minLength;
    /**
     * Maximum string length in a column.
     * 
     */
    @JsonProperty("maxLength")
    @JsonPropertyDescription("Maximum string length in a column.")
    private Double maxLength;
    /**
     * Avg value in a column.
     * 
     */
    @JsonProperty("mean")
    @JsonPropertyDescription("Avg value in a column.")
    private Double mean;
    /**
     * Median value in a column.
     * 
     */
    @JsonProperty("sum")
    @JsonPropertyDescription("Median value in a column.")
    private Double sum;
    /**
     * Standard deviation of a column.
     * 
     */
    @JsonProperty("stddev")
    @JsonPropertyDescription("Standard deviation of a column.")
    private Double stddev;
    /**
     * Variance of a column.
     * 
     */
    @JsonProperty("variance")
    @JsonPropertyDescription("Variance of a column.")
    private Double variance;
    /**
     * Median of a column.
     * 
     */
    @JsonProperty("median")
    @JsonPropertyDescription("Median of a column.")
    private Double median;
    /**
     * First quartile of a column.
     * 
     */
    @JsonProperty("firstQuartile")
    @JsonPropertyDescription("First quartile of a column.")
    private Double firstQuartile;
    /**
     * First quartile of a column.
     * 
     */
    @JsonProperty("thirdQuartile")
    @JsonPropertyDescription("First quartile of a column.")
    private Double thirdQuartile;
    /**
     * Inter quartile range of a column.
     * 
     */
    @JsonProperty("interQuartileRange")
    @JsonPropertyDescription("Inter quartile range of a column.")
    private Double interQuartileRange;
    /**
     * Non parametric skew of a column.
     * 
     */
    @JsonProperty("nonParametricSkew")
    @JsonPropertyDescription("Non parametric skew of a column.")
    private Double nonParametricSkew;
    /**
     * Histogram of a column.
     * 
     */
    @JsonProperty("histogram")
    @JsonPropertyDescription("Histogram of a column.")
    private Histogram histogram;
    /**
     * Custom Metrics profile list bound to a column.
     * 
     */
    @JsonProperty("customMetricsProfile")
    @JsonPropertyDescription("Custom Metrics profile list bound to a column.")
    @Valid
    private List<CustomMetricProfile> customMetricsProfile = null;

    /**
     * Column Name.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Column Name.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public ColumnProfile withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public ColumnProfile withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Total count of the values in this column.
     * 
     */
    @JsonProperty("valuesCount")
    public Double getValuesCount() {
        return valuesCount;
    }

    /**
     * Total count of the values in this column.
     * 
     */
    @JsonProperty("valuesCount")
    public void setValuesCount(Double valuesCount) {
        this.valuesCount = valuesCount;
    }

    public ColumnProfile withValuesCount(Double valuesCount) {
        this.valuesCount = valuesCount;
        return this;
    }

    /**
     * Percentage of values in this column with respect to row count.
     * 
     */
    @JsonProperty("valuesPercentage")
    public Double getValuesPercentage() {
        return valuesPercentage;
    }

    /**
     * Percentage of values in this column with respect to row count.
     * 
     */
    @JsonProperty("valuesPercentage")
    public void setValuesPercentage(Double valuesPercentage) {
        this.valuesPercentage = valuesPercentage;
    }

    public ColumnProfile withValuesPercentage(Double valuesPercentage) {
        this.valuesPercentage = valuesPercentage;
        return this;
    }

    /**
     * Total count of valid values in this column.
     * 
     */
    @JsonProperty("validCount")
    public Double getValidCount() {
        return validCount;
    }

    /**
     * Total count of valid values in this column.
     * 
     */
    @JsonProperty("validCount")
    public void setValidCount(Double validCount) {
        this.validCount = validCount;
    }

    public ColumnProfile withValidCount(Double validCount) {
        this.validCount = validCount;
        return this;
    }

    /**
     * No.of Rows that contain duplicates in a column.
     * 
     */
    @JsonProperty("duplicateCount")
    public Double getDuplicateCount() {
        return duplicateCount;
    }

    /**
     * No.of Rows that contain duplicates in a column.
     * 
     */
    @JsonProperty("duplicateCount")
    public void setDuplicateCount(Double duplicateCount) {
        this.duplicateCount = duplicateCount;
    }

    public ColumnProfile withDuplicateCount(Double duplicateCount) {
        this.duplicateCount = duplicateCount;
        return this;
    }

    /**
     * No.of null values in a column.
     * 
     */
    @JsonProperty("nullCount")
    public Double getNullCount() {
        return nullCount;
    }

    /**
     * No.of null values in a column.
     * 
     */
    @JsonProperty("nullCount")
    public void setNullCount(Double nullCount) {
        this.nullCount = nullCount;
    }

    public ColumnProfile withNullCount(Double nullCount) {
        this.nullCount = nullCount;
        return this;
    }

    /**
     * No.of null value proportion in columns.
     * 
     */
    @JsonProperty("nullProportion")
    public Double getNullProportion() {
        return nullProportion;
    }

    /**
     * No.of null value proportion in columns.
     * 
     */
    @JsonProperty("nullProportion")
    public void setNullProportion(Double nullProportion) {
        this.nullProportion = nullProportion;
    }

    public ColumnProfile withNullProportion(Double nullProportion) {
        this.nullProportion = nullProportion;
        return this;
    }

    /**
     * Missing Percentage is calculated by taking percentage of validCount/valuesCount.
     * 
     */
    @JsonProperty("missingPercentage")
    public Double getMissingPercentage() {
        return missingPercentage;
    }

    /**
     * Missing Percentage is calculated by taking percentage of validCount/valuesCount.
     * 
     */
    @JsonProperty("missingPercentage")
    public void setMissingPercentage(Double missingPercentage) {
        this.missingPercentage = missingPercentage;
    }

    public ColumnProfile withMissingPercentage(Double missingPercentage) {
        this.missingPercentage = missingPercentage;
        return this;
    }

    /**
     * Missing count is calculated by subtracting valuesCount - validCount.
     * 
     */
    @JsonProperty("missingCount")
    public Double getMissingCount() {
        return missingCount;
    }

    /**
     * Missing count is calculated by subtracting valuesCount - validCount.
     * 
     */
    @JsonProperty("missingCount")
    public void setMissingCount(Double missingCount) {
        this.missingCount = missingCount;
    }

    public ColumnProfile withMissingCount(Double missingCount) {
        this.missingCount = missingCount;
        return this;
    }

    /**
     * No. of unique values in the column.
     * 
     */
    @JsonProperty("uniqueCount")
    public Double getUniqueCount() {
        return uniqueCount;
    }

    /**
     * No. of unique values in the column.
     * 
     */
    @JsonProperty("uniqueCount")
    public void setUniqueCount(Double uniqueCount) {
        this.uniqueCount = uniqueCount;
    }

    public ColumnProfile withUniqueCount(Double uniqueCount) {
        this.uniqueCount = uniqueCount;
        return this;
    }

    /**
     * Proportion of number of unique values in a column.
     * 
     */
    @JsonProperty("uniqueProportion")
    public Double getUniqueProportion() {
        return uniqueProportion;
    }

    /**
     * Proportion of number of unique values in a column.
     * 
     */
    @JsonProperty("uniqueProportion")
    public void setUniqueProportion(Double uniqueProportion) {
        this.uniqueProportion = uniqueProportion;
    }

    public ColumnProfile withUniqueProportion(Double uniqueProportion) {
        this.uniqueProportion = uniqueProportion;
        return this;
    }

    /**
     * Number of values that contain distinct values.
     * 
     */
    @JsonProperty("distinctCount")
    public Double getDistinctCount() {
        return distinctCount;
    }

    /**
     * Number of values that contain distinct values.
     * 
     */
    @JsonProperty("distinctCount")
    public void setDistinctCount(Double distinctCount) {
        this.distinctCount = distinctCount;
    }

    public ColumnProfile withDistinctCount(Double distinctCount) {
        this.distinctCount = distinctCount;
        return this;
    }

    /**
     * Proportion of distinct values in a column.
     * 
     */
    @JsonProperty("distinctProportion")
    public Double getDistinctProportion() {
        return distinctProportion;
    }

    /**
     * Proportion of distinct values in a column.
     * 
     */
    @JsonProperty("distinctProportion")
    public void setDistinctProportion(Double distinctProportion) {
        this.distinctProportion = distinctProportion;
    }

    public ColumnProfile withDistinctProportion(Double distinctProportion) {
        this.distinctProportion = distinctProportion;
        return this;
    }

    /**
     * Minimum value in a column.
     * 
     */
    @JsonProperty("min")
    public Object getMin() {
        return min;
    }

    /**
     * Minimum value in a column.
     * 
     */
    @JsonProperty("min")
    public void setMin(Object min) {
        this.min = min;
    }

    public ColumnProfile withMin(Object min) {
        this.min = min;
        return this;
    }

    /**
     * Maximum value in a column.
     * 
     */
    @JsonProperty("max")
    public Object getMax() {
        return max;
    }

    /**
     * Maximum value in a column.
     * 
     */
    @JsonProperty("max")
    public void setMax(Object max) {
        this.max = max;
    }

    public ColumnProfile withMax(Object max) {
        this.max = max;
        return this;
    }

    /**
     * Minimum string length in a column.
     * 
     */
    @JsonProperty("minLength")
    public Double getMinLength() {
        return minLength;
    }

    /**
     * Minimum string length in a column.
     * 
     */
    @JsonProperty("minLength")
    public void setMinLength(Double minLength) {
        this.minLength = minLength;
    }

    public ColumnProfile withMinLength(Double minLength) {
        this.minLength = minLength;
        return this;
    }

    /**
     * Maximum string length in a column.
     * 
     */
    @JsonProperty("maxLength")
    public Double getMaxLength() {
        return maxLength;
    }

    /**
     * Maximum string length in a column.
     * 
     */
    @JsonProperty("maxLength")
    public void setMaxLength(Double maxLength) {
        this.maxLength = maxLength;
    }

    public ColumnProfile withMaxLength(Double maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    /**
     * Avg value in a column.
     * 
     */
    @JsonProperty("mean")
    public Double getMean() {
        return mean;
    }

    /**
     * Avg value in a column.
     * 
     */
    @JsonProperty("mean")
    public void setMean(Double mean) {
        this.mean = mean;
    }

    public ColumnProfile withMean(Double mean) {
        this.mean = mean;
        return this;
    }

    /**
     * Median value in a column.
     * 
     */
    @JsonProperty("sum")
    public Double getSum() {
        return sum;
    }

    /**
     * Median value in a column.
     * 
     */
    @JsonProperty("sum")
    public void setSum(Double sum) {
        this.sum = sum;
    }

    public ColumnProfile withSum(Double sum) {
        this.sum = sum;
        return this;
    }

    /**
     * Standard deviation of a column.
     * 
     */
    @JsonProperty("stddev")
    public Double getStddev() {
        return stddev;
    }

    /**
     * Standard deviation of a column.
     * 
     */
    @JsonProperty("stddev")
    public void setStddev(Double stddev) {
        this.stddev = stddev;
    }

    public ColumnProfile withStddev(Double stddev) {
        this.stddev = stddev;
        return this;
    }

    /**
     * Variance of a column.
     * 
     */
    @JsonProperty("variance")
    public Double getVariance() {
        return variance;
    }

    /**
     * Variance of a column.
     * 
     */
    @JsonProperty("variance")
    public void setVariance(Double variance) {
        this.variance = variance;
    }

    public ColumnProfile withVariance(Double variance) {
        this.variance = variance;
        return this;
    }

    /**
     * Median of a column.
     * 
     */
    @JsonProperty("median")
    public Double getMedian() {
        return median;
    }

    /**
     * Median of a column.
     * 
     */
    @JsonProperty("median")
    public void setMedian(Double median) {
        this.median = median;
    }

    public ColumnProfile withMedian(Double median) {
        this.median = median;
        return this;
    }

    /**
     * First quartile of a column.
     * 
     */
    @JsonProperty("firstQuartile")
    public Double getFirstQuartile() {
        return firstQuartile;
    }

    /**
     * First quartile of a column.
     * 
     */
    @JsonProperty("firstQuartile")
    public void setFirstQuartile(Double firstQuartile) {
        this.firstQuartile = firstQuartile;
    }

    public ColumnProfile withFirstQuartile(Double firstQuartile) {
        this.firstQuartile = firstQuartile;
        return this;
    }

    /**
     * First quartile of a column.
     * 
     */
    @JsonProperty("thirdQuartile")
    public Double getThirdQuartile() {
        return thirdQuartile;
    }

    /**
     * First quartile of a column.
     * 
     */
    @JsonProperty("thirdQuartile")
    public void setThirdQuartile(Double thirdQuartile) {
        this.thirdQuartile = thirdQuartile;
    }

    public ColumnProfile withThirdQuartile(Double thirdQuartile) {
        this.thirdQuartile = thirdQuartile;
        return this;
    }

    /**
     * Inter quartile range of a column.
     * 
     */
    @JsonProperty("interQuartileRange")
    public Double getInterQuartileRange() {
        return interQuartileRange;
    }

    /**
     * Inter quartile range of a column.
     * 
     */
    @JsonProperty("interQuartileRange")
    public void setInterQuartileRange(Double interQuartileRange) {
        this.interQuartileRange = interQuartileRange;
    }

    public ColumnProfile withInterQuartileRange(Double interQuartileRange) {
        this.interQuartileRange = interQuartileRange;
        return this;
    }

    /**
     * Non parametric skew of a column.
     * 
     */
    @JsonProperty("nonParametricSkew")
    public Double getNonParametricSkew() {
        return nonParametricSkew;
    }

    /**
     * Non parametric skew of a column.
     * 
     */
    @JsonProperty("nonParametricSkew")
    public void setNonParametricSkew(Double nonParametricSkew) {
        this.nonParametricSkew = nonParametricSkew;
    }

    public ColumnProfile withNonParametricSkew(Double nonParametricSkew) {
        this.nonParametricSkew = nonParametricSkew;
        return this;
    }

    /**
     * Histogram of a column.
     * 
     */
    @JsonProperty("histogram")
    public Histogram getHistogram() {
        return histogram;
    }

    /**
     * Histogram of a column.
     * 
     */
    @JsonProperty("histogram")
    public void setHistogram(Histogram histogram) {
        this.histogram = histogram;
    }

    public ColumnProfile withHistogram(Histogram histogram) {
        this.histogram = histogram;
        return this;
    }

    /**
     * Custom Metrics profile list bound to a column.
     * 
     */
    @JsonProperty("customMetricsProfile")
    public List<CustomMetricProfile> getCustomMetricsProfile() {
        return customMetricsProfile;
    }

    /**
     * Custom Metrics profile list bound to a column.
     * 
     */
    @JsonProperty("customMetricsProfile")
    public void setCustomMetricsProfile(List<CustomMetricProfile> customMetricsProfile) {
        this.customMetricsProfile = customMetricsProfile;
    }

    public ColumnProfile withCustomMetricsProfile(List<CustomMetricProfile> customMetricsProfile) {
        this.customMetricsProfile = customMetricsProfile;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ColumnProfile.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("valuesCount");
        sb.append('=');
        sb.append(((this.valuesCount == null)?"<null>":this.valuesCount));
        sb.append(',');
        sb.append("valuesPercentage");
        sb.append('=');
        sb.append(((this.valuesPercentage == null)?"<null>":this.valuesPercentage));
        sb.append(',');
        sb.append("validCount");
        sb.append('=');
        sb.append(((this.validCount == null)?"<null>":this.validCount));
        sb.append(',');
        sb.append("duplicateCount");
        sb.append('=');
        sb.append(((this.duplicateCount == null)?"<null>":this.duplicateCount));
        sb.append(',');
        sb.append("nullCount");
        sb.append('=');
        sb.append(((this.nullCount == null)?"<null>":this.nullCount));
        sb.append(',');
        sb.append("nullProportion");
        sb.append('=');
        sb.append(((this.nullProportion == null)?"<null>":this.nullProportion));
        sb.append(',');
        sb.append("missingPercentage");
        sb.append('=');
        sb.append(((this.missingPercentage == null)?"<null>":this.missingPercentage));
        sb.append(',');
        sb.append("missingCount");
        sb.append('=');
        sb.append(((this.missingCount == null)?"<null>":this.missingCount));
        sb.append(',');
        sb.append("uniqueCount");
        sb.append('=');
        sb.append(((this.uniqueCount == null)?"<null>":this.uniqueCount));
        sb.append(',');
        sb.append("uniqueProportion");
        sb.append('=');
        sb.append(((this.uniqueProportion == null)?"<null>":this.uniqueProportion));
        sb.append(',');
        sb.append("distinctCount");
        sb.append('=');
        sb.append(((this.distinctCount == null)?"<null>":this.distinctCount));
        sb.append(',');
        sb.append("distinctProportion");
        sb.append('=');
        sb.append(((this.distinctProportion == null)?"<null>":this.distinctProportion));
        sb.append(',');
        sb.append("min");
        sb.append('=');
        sb.append(((this.min == null)?"<null>":this.min));
        sb.append(',');
        sb.append("max");
        sb.append('=');
        sb.append(((this.max == null)?"<null>":this.max));
        sb.append(',');
        sb.append("minLength");
        sb.append('=');
        sb.append(((this.minLength == null)?"<null>":this.minLength));
        sb.append(',');
        sb.append("maxLength");
        sb.append('=');
        sb.append(((this.maxLength == null)?"<null>":this.maxLength));
        sb.append(',');
        sb.append("mean");
        sb.append('=');
        sb.append(((this.mean == null)?"<null>":this.mean));
        sb.append(',');
        sb.append("sum");
        sb.append('=');
        sb.append(((this.sum == null)?"<null>":this.sum));
        sb.append(',');
        sb.append("stddev");
        sb.append('=');
        sb.append(((this.stddev == null)?"<null>":this.stddev));
        sb.append(',');
        sb.append("variance");
        sb.append('=');
        sb.append(((this.variance == null)?"<null>":this.variance));
        sb.append(',');
        sb.append("median");
        sb.append('=');
        sb.append(((this.median == null)?"<null>":this.median));
        sb.append(',');
        sb.append("firstQuartile");
        sb.append('=');
        sb.append(((this.firstQuartile == null)?"<null>":this.firstQuartile));
        sb.append(',');
        sb.append("thirdQuartile");
        sb.append('=');
        sb.append(((this.thirdQuartile == null)?"<null>":this.thirdQuartile));
        sb.append(',');
        sb.append("interQuartileRange");
        sb.append('=');
        sb.append(((this.interQuartileRange == null)?"<null>":this.interQuartileRange));
        sb.append(',');
        sb.append("nonParametricSkew");
        sb.append('=');
        sb.append(((this.nonParametricSkew == null)?"<null>":this.nonParametricSkew));
        sb.append(',');
        sb.append("histogram");
        sb.append('=');
        sb.append(((this.histogram == null)?"<null>":this.histogram));
        sb.append(',');
        sb.append("customMetricsProfile");
        sb.append('=');
        sb.append(((this.customMetricsProfile == null)?"<null>":this.customMetricsProfile));
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
        result = ((result* 31)+((this.minLength == null)? 0 :this.minLength.hashCode()));
        result = ((result* 31)+((this.thirdQuartile == null)? 0 :this.thirdQuartile.hashCode()));
        result = ((result* 31)+((this.nullProportion == null)? 0 :this.nullProportion.hashCode()));
        result = ((result* 31)+((this.sum == null)? 0 :this.sum.hashCode()));
        result = ((result* 31)+((this.validCount == null)? 0 :this.validCount.hashCode()));
        result = ((result* 31)+((this.uniqueProportion == null)? 0 :this.uniqueProportion.hashCode()));
        result = ((result* 31)+((this.min == null)? 0 :this.min.hashCode()));
        result = ((result* 31)+((this.customMetricsProfile == null)? 0 :this.customMetricsProfile.hashCode()));
        result = ((result* 31)+((this.missingCount == null)? 0 :this.missingCount.hashCode()));
        result = ((result* 31)+((this.distinctProportion == null)? 0 :this.distinctProportion.hashCode()));
        result = ((result* 31)+((this.valuesPercentage == null)? 0 :this.valuesPercentage.hashCode()));
        result = ((result* 31)+((this.stddev == null)? 0 :this.stddev.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        result = ((result* 31)+((this.max == null)? 0 :this.max.hashCode()));
        result = ((result* 31)+((this.nullCount == null)? 0 :this.nullCount.hashCode()));
        result = ((result* 31)+((this.valuesCount == null)? 0 :this.valuesCount.hashCode()));
        result = ((result* 31)+((this.missingPercentage == null)? 0 :this.missingPercentage.hashCode()));
        result = ((result* 31)+((this.nonParametricSkew == null)? 0 :this.nonParametricSkew.hashCode()));
        result = ((result* 31)+((this.histogram == null)? 0 :this.histogram.hashCode()));
        result = ((result* 31)+((this.distinctCount == null)? 0 :this.distinctCount.hashCode()));
        result = ((result* 31)+((this.median == null)? 0 :this.median.hashCode()));
        result = ((result* 31)+((this.duplicateCount == null)? 0 :this.duplicateCount.hashCode()));
        result = ((result* 31)+((this.variance == null)? 0 :this.variance.hashCode()));
        result = ((result* 31)+((this.interQuartileRange == null)? 0 :this.interQuartileRange.hashCode()));
        result = ((result* 31)+((this.mean == null)? 0 :this.mean.hashCode()));
        result = ((result* 31)+((this.firstQuartile == null)? 0 :this.firstQuartile.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.maxLength == null)? 0 :this.maxLength.hashCode()));
        result = ((result* 31)+((this.uniqueCount == null)? 0 :this.uniqueCount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ColumnProfile) == false) {
            return false;
        }
        ColumnProfile rhs = ((ColumnProfile) other);
        return ((((((((((((((((((((((((((((((this.minLength == rhs.minLength)||((this.minLength!= null)&&this.minLength.equals(rhs.minLength)))&&((this.thirdQuartile == rhs.thirdQuartile)||((this.thirdQuartile!= null)&&this.thirdQuartile.equals(rhs.thirdQuartile))))&&((this.nullProportion == rhs.nullProportion)||((this.nullProportion!= null)&&this.nullProportion.equals(rhs.nullProportion))))&&((this.sum == rhs.sum)||((this.sum!= null)&&this.sum.equals(rhs.sum))))&&((this.validCount == rhs.validCount)||((this.validCount!= null)&&this.validCount.equals(rhs.validCount))))&&((this.uniqueProportion == rhs.uniqueProportion)||((this.uniqueProportion!= null)&&this.uniqueProportion.equals(rhs.uniqueProportion))))&&((this.min == rhs.min)||((this.min!= null)&&this.min.equals(rhs.min))))&&((this.customMetricsProfile == rhs.customMetricsProfile)||((this.customMetricsProfile!= null)&&this.customMetricsProfile.equals(rhs.customMetricsProfile))))&&((this.missingCount == rhs.missingCount)||((this.missingCount!= null)&&this.missingCount.equals(rhs.missingCount))))&&((this.distinctProportion == rhs.distinctProportion)||((this.distinctProportion!= null)&&this.distinctProportion.equals(rhs.distinctProportion))))&&((this.valuesPercentage == rhs.valuesPercentage)||((this.valuesPercentage!= null)&&this.valuesPercentage.equals(rhs.valuesPercentage))))&&((this.stddev == rhs.stddev)||((this.stddev!= null)&&this.stddev.equals(rhs.stddev))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))))&&((this.max == rhs.max)||((this.max!= null)&&this.max.equals(rhs.max))))&&((this.nullCount == rhs.nullCount)||((this.nullCount!= null)&&this.nullCount.equals(rhs.nullCount))))&&((this.valuesCount == rhs.valuesCount)||((this.valuesCount!= null)&&this.valuesCount.equals(rhs.valuesCount))))&&((this.missingPercentage == rhs.missingPercentage)||((this.missingPercentage!= null)&&this.missingPercentage.equals(rhs.missingPercentage))))&&((this.nonParametricSkew == rhs.nonParametricSkew)||((this.nonParametricSkew!= null)&&this.nonParametricSkew.equals(rhs.nonParametricSkew))))&&((this.histogram == rhs.histogram)||((this.histogram!= null)&&this.histogram.equals(rhs.histogram))))&&((this.distinctCount == rhs.distinctCount)||((this.distinctCount!= null)&&this.distinctCount.equals(rhs.distinctCount))))&&((this.median == rhs.median)||((this.median!= null)&&this.median.equals(rhs.median))))&&((this.duplicateCount == rhs.duplicateCount)||((this.duplicateCount!= null)&&this.duplicateCount.equals(rhs.duplicateCount))))&&((this.variance == rhs.variance)||((this.variance!= null)&&this.variance.equals(rhs.variance))))&&((this.interQuartileRange == rhs.interQuartileRange)||((this.interQuartileRange!= null)&&this.interQuartileRange.equals(rhs.interQuartileRange))))&&((this.mean == rhs.mean)||((this.mean!= null)&&this.mean.equals(rhs.mean))))&&((this.firstQuartile == rhs.firstQuartile)||((this.firstQuartile!= null)&&this.firstQuartile.equals(rhs.firstQuartile))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.maxLength == rhs.maxLength)||((this.maxLength!= null)&&this.maxLength.equals(rhs.maxLength))))&&((this.uniqueCount == rhs.uniqueCount)||((this.uniqueCount!= null)&&this.uniqueCount.equals(rhs.uniqueCount))));
    }

}
