/**
 * Weather API
 * # Introduction WeatherAPI.com provides access to weather and geo data via a JSON/XML restful API. It allows developers to create desktop, web and mobile applications using this data very easy. We provide following data through our API:     - Real-time weather - 14 day weather forecast - Historical Weather - Marine Weather and Tide Data - Future Weather (Upto 365 days ahead) - Daily and hourly intervals - 15 min interval (Enterprise only) - Astronomy - Time zone - Location data - Sports - Search or Autocomplete API - Weather Alerts - Air Quality Data - Bulk Request  # Getting Started    You need to [signup](https://www.weatherapi.com/signup.aspx) and then you can find your API key under [your account](https://www.weatherapi.com/login.aspx), and start using API right away!  Try our weather API by using interactive [API Explorer](https://www.weatherapi.com/api-explorer.aspx).  We also have SDK for popular framework/languages available on [Github](https://github.com/weatherapicom/) for quick integrations.  If you find any features missing or have any suggestions, please [contact us](https://www.weatherapi.com/contact.aspx).    # Authentication    API access to the data is protected by an API key. If at anytime, you find the API key has become vulnerable, please regenerate the key using Regenerate button next to the API key.    Authentication to the WeatherAPI.com API is provided by passing your API key as request parameter through an API .      ##  key parameter  key=YOUR API KEY  
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Search {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("region")
  private String region = null;
  @SerializedName("country")
  private String country = null;
  @SerializedName("lat")
  private BigDecimal lat = null;
  @SerializedName("lon")
  private BigDecimal lon = null;
  @SerializedName("url")
  private String url = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getLat() {
    return lat;
  }
  public void setLat(BigDecimal lat) {
    this.lat = lat;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getLon() {
    return lon;
  }
  public void setLon(BigDecimal lon) {
    this.lon = lon;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Search search = (Search) o;
    return (this.id == null ? search.id == null : this.id.equals(search.id)) &&
        (this.name == null ? search.name == null : this.name.equals(search.name)) &&
        (this.region == null ? search.region == null : this.region.equals(search.region)) &&
        (this.country == null ? search.country == null : this.country.equals(search.country)) &&
        (this.lat == null ? search.lat == null : this.lat.equals(search.lat)) &&
        (this.lon == null ? search.lon == null : this.lon.equals(search.lon)) &&
        (this.url == null ? search.url == null : this.url.equals(search.url));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.region == null ? 0: this.region.hashCode());
    result = 31 * result + (this.country == null ? 0: this.country.hashCode());
    result = 31 * result + (this.lat == null ? 0: this.lat.hashCode());
    result = 31 * result + (this.lon == null ? 0: this.lon.hashCode());
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Search {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  region: ").append(region).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  lat: ").append(lat).append("\n");
    sb.append("  lon: ").append(lon).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
