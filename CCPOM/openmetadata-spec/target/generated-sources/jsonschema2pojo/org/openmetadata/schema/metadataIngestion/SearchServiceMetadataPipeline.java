
package org.openmetadata.schema.metadataIngestion;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * SearchServiceMetadataPipeline
 * <p>
 * SearchService Metadata Pipeline Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "searchIndexFilterPattern",
    "markDeletedSearchIndexes",
    "includeSampleData",
    "sampleSize"
})
@Generated("jsonschema2pojo")
public class SearchServiceMetadataPipeline {

    /**
     * Search Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Search Source Config Metadata Pipeline type")
    private SearchServiceMetadataPipeline.SearchMetadataConfigType type = SearchServiceMetadataPipeline.SearchMetadataConfigType.fromValue("SearchMetadata");
    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("searchIndexFilterPattern")
    @JsonPropertyDescription("Regex to only fetch dashboards or charts that matches the pattern.")
    @Valid
    private FilterPattern searchIndexFilterPattern;
    /**
     * Mark Deleted Search Index
     * <p>
     * Optional configuration to soft delete search indexes in OpenMetadata if the source search indexes are deleted. Also, if the search index is deleted, all the associated entities like lineage, etc., with that search index will be deleted
     * 
     */
    @JsonProperty("markDeletedSearchIndexes")
    @JsonPropertyDescription("Optional configuration to soft delete search indexes in OpenMetadata if the source search indexes are deleted. Also, if the search index is deleted, all the associated entities like lineage, etc., with that search index will be deleted")
    private Boolean markDeletedSearchIndexes = true;
    /**
     * Include Sample Data
     * <p>
     * Optional configuration to turn off fetching sample data for search index.
     * 
     */
    @JsonProperty("includeSampleData")
    @JsonPropertyDescription("Optional configuration to turn off fetching sample data for search index.")
    private Boolean includeSampleData = true;
    /**
     * Sample Size
     * <p>
     * No. of records of sample data we want to ingest.
     * 
     */
    @JsonProperty("sampleSize")
    @JsonPropertyDescription("No. of records of sample data we want to ingest.")
    private Integer sampleSize = 10;

    /**
     * Search Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    public SearchServiceMetadataPipeline.SearchMetadataConfigType getType() {
        return type;
    }

    /**
     * Search Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    public void setType(SearchServiceMetadataPipeline.SearchMetadataConfigType type) {
        this.type = type;
    }

    public SearchServiceMetadataPipeline withType(SearchServiceMetadataPipeline.SearchMetadataConfigType type) {
        this.type = type;
        return this;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("searchIndexFilterPattern")
    public FilterPattern getSearchIndexFilterPattern() {
        return searchIndexFilterPattern;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("searchIndexFilterPattern")
    public void setSearchIndexFilterPattern(FilterPattern searchIndexFilterPattern) {
        this.searchIndexFilterPattern = searchIndexFilterPattern;
    }

    public SearchServiceMetadataPipeline withSearchIndexFilterPattern(FilterPattern searchIndexFilterPattern) {
        this.searchIndexFilterPattern = searchIndexFilterPattern;
        return this;
    }

    /**
     * Mark Deleted Search Index
     * <p>
     * Optional configuration to soft delete search indexes in OpenMetadata if the source search indexes are deleted. Also, if the search index is deleted, all the associated entities like lineage, etc., with that search index will be deleted
     * 
     */
    @JsonProperty("markDeletedSearchIndexes")
    public Boolean getMarkDeletedSearchIndexes() {
        return markDeletedSearchIndexes;
    }

    /**
     * Mark Deleted Search Index
     * <p>
     * Optional configuration to soft delete search indexes in OpenMetadata if the source search indexes are deleted. Also, if the search index is deleted, all the associated entities like lineage, etc., with that search index will be deleted
     * 
     */
    @JsonProperty("markDeletedSearchIndexes")
    public void setMarkDeletedSearchIndexes(Boolean markDeletedSearchIndexes) {
        this.markDeletedSearchIndexes = markDeletedSearchIndexes;
    }

    public SearchServiceMetadataPipeline withMarkDeletedSearchIndexes(Boolean markDeletedSearchIndexes) {
        this.markDeletedSearchIndexes = markDeletedSearchIndexes;
        return this;
    }

    /**
     * Include Sample Data
     * <p>
     * Optional configuration to turn off fetching sample data for search index.
     * 
     */
    @JsonProperty("includeSampleData")
    public Boolean getIncludeSampleData() {
        return includeSampleData;
    }

    /**
     * Include Sample Data
     * <p>
     * Optional configuration to turn off fetching sample data for search index.
     * 
     */
    @JsonProperty("includeSampleData")
    public void setIncludeSampleData(Boolean includeSampleData) {
        this.includeSampleData = includeSampleData;
    }

    public SearchServiceMetadataPipeline withIncludeSampleData(Boolean includeSampleData) {
        this.includeSampleData = includeSampleData;
        return this;
    }

    /**
     * Sample Size
     * <p>
     * No. of records of sample data we want to ingest.
     * 
     */
    @JsonProperty("sampleSize")
    public Integer getSampleSize() {
        return sampleSize;
    }

    /**
     * Sample Size
     * <p>
     * No. of records of sample data we want to ingest.
     * 
     */
    @JsonProperty("sampleSize")
    public void setSampleSize(Integer sampleSize) {
        this.sampleSize = sampleSize;
    }

    public SearchServiceMetadataPipeline withSampleSize(Integer sampleSize) {
        this.sampleSize = sampleSize;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SearchServiceMetadataPipeline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("searchIndexFilterPattern");
        sb.append('=');
        sb.append(((this.searchIndexFilterPattern == null)?"<null>":this.searchIndexFilterPattern));
        sb.append(',');
        sb.append("markDeletedSearchIndexes");
        sb.append('=');
        sb.append(((this.markDeletedSearchIndexes == null)?"<null>":this.markDeletedSearchIndexes));
        sb.append(',');
        sb.append("includeSampleData");
        sb.append('=');
        sb.append(((this.includeSampleData == null)?"<null>":this.includeSampleData));
        sb.append(',');
        sb.append("sampleSize");
        sb.append('=');
        sb.append(((this.sampleSize == null)?"<null>":this.sampleSize));
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
        result = ((result* 31)+((this.searchIndexFilterPattern == null)? 0 :this.searchIndexFilterPattern.hashCode()));
        result = ((result* 31)+((this.markDeletedSearchIndexes == null)? 0 :this.markDeletedSearchIndexes.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.includeSampleData == null)? 0 :this.includeSampleData.hashCode()));
        result = ((result* 31)+((this.sampleSize == null)? 0 :this.sampleSize.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SearchServiceMetadataPipeline) == false) {
            return false;
        }
        SearchServiceMetadataPipeline rhs = ((SearchServiceMetadataPipeline) other);
        return ((((((this.searchIndexFilterPattern == rhs.searchIndexFilterPattern)||((this.searchIndexFilterPattern!= null)&&this.searchIndexFilterPattern.equals(rhs.searchIndexFilterPattern)))&&((this.markDeletedSearchIndexes == rhs.markDeletedSearchIndexes)||((this.markDeletedSearchIndexes!= null)&&this.markDeletedSearchIndexes.equals(rhs.markDeletedSearchIndexes))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.includeSampleData == rhs.includeSampleData)||((this.includeSampleData!= null)&&this.includeSampleData.equals(rhs.includeSampleData))))&&((this.sampleSize == rhs.sampleSize)||((this.sampleSize!= null)&&this.sampleSize.equals(rhs.sampleSize))));
    }


    /**
     * Search Source Config Metadata Pipeline type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum SearchMetadataConfigType {

        SEARCH_METADATA("SearchMetadata");
        private final String value;
        private final static Map<String, SearchServiceMetadataPipeline.SearchMetadataConfigType> CONSTANTS = new HashMap<String, SearchServiceMetadataPipeline.SearchMetadataConfigType>();

        static {
            for (SearchServiceMetadataPipeline.SearchMetadataConfigType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SearchMetadataConfigType(String value) {
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
        public static SearchServiceMetadataPipeline.SearchMetadataConfigType fromValue(String value) {
            SearchServiceMetadataPipeline.SearchMetadataConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
