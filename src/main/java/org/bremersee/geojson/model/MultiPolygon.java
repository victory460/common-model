/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true)
 */

package org.bremersee.geojson.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.List;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * GeoJSON MultiPolygon.
 */
@ApiModel(description = "GeoJSON MultiPolygon.")
@Validated
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuppressWarnings("unused")
public class MultiPolygon extends Geometry implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("coordinates")
  private List<List<List<Position>>> coordinates = null;

  /**
   * Instantiates a new multi polygon.
   */
  public MultiPolygon() {
    setType(TypeEnum.MULTIPOLYGON);
  }

  /**
   * Instantiates a new multi polygon.
   *
   * @param bbox        the bbox
   * @param coordinates the coordinates
   */
  @Builder(toBuilder = true)
  public MultiPolygon(BoundingBox bbox, List<List<List<Position>>> coordinates) {
    super(bbox);
    setType(TypeEnum.MULTIPOLYGON);
    this.coordinates = coordinates;
  }

  /**
   * Get coordinates.
   *
   * @return coordinates coordinates
   */
  @ApiModelProperty(value = "The coordinates.")
  public List<List<List<Position>>> getCoordinates() {
    return coordinates;
  }

  /**
   * Sets coordinates.
   *
   * @param coordinates the coordinates
   */
  public void setCoordinates(List<List<List<Position>>> coordinates) {
    this.coordinates = coordinates;
  }

}

