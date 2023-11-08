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
public class Ip {
  
  @SerializedName("ip")
  private String ip = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("continent_code")
  private String continentCode = null;
  @SerializedName("continent_name")
  private String continentName = null;
  @SerializedName("country_code")
  private String countryCode = null;
  @SerializedName("country_name")
  private String countryName = null;
  @SerializedName("is_eu")
  private String isEu = null;
  @SerializedName("geoname_id")
  private Integer geonameId = null;
  @SerializedName("city")
  private String city = null;
  @SerializedName("region")
  private String region = null;
  @SerializedName("lat")
  private BigDecimal lat = null;
  @SerializedName("lon")
  private BigDecimal lon = null;
  @SerializedName("tz_id")
  private String tzId = null;
  @SerializedName("localtime_epoch")
  private Integer localtimeEpoch = null;
  @SerializedName("localtime")
  private String localtime = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getIp() {
    return ip;
  }
  public void setIp(String ip) {
    this.ip = ip;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContinentCode() {
    return continentCode;
  }
  public void setContinentCode(String continentCode) {
    this.continentCode = continentCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContinentName() {
    return continentName;
  }
  public void setContinentName(String continentName) {
    this.continentName = continentName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCountryName() {
    return countryName;
  }
  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getIsEu() {
    return isEu;
  }
  public void setIsEu(String isEu) {
    this.isEu = isEu;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getGeonameId() {
    return geonameId;
  }
  public void setGeonameId(Integer geonameId) {
    this.geonameId = geonameId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
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
  public String getTzId() {
    return tzId;
  }
  public void setTzId(String tzId) {
    this.tzId = tzId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getLocaltimeEpoch() {
    return localtimeEpoch;
  }
  public void setLocaltimeEpoch(Integer localtimeEpoch) {
    this.localtimeEpoch = localtimeEpoch;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLocaltime() {
    return localtime;
  }
  public void setLocaltime(String localtime) {
    this.localtime = localtime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ip ip = (Ip) o;
    return (this.ip == null ? ip.ip == null : this.ip.equals(ip.ip)) &&
        (this.type == null ? ip.type == null : this.type.equals(ip.type)) &&
        (this.continentCode == null ? ip.continentCode == null : this.continentCode.equals(ip.continentCode)) &&
        (this.continentName == null ? ip.continentName == null : this.continentName.equals(ip.continentName)) &&
        (this.countryCode == null ? ip.countryCode == null : this.countryCode.equals(ip.countryCode)) &&
        (this.countryName == null ? ip.countryName == null : this.countryName.equals(ip.countryName)) &&
        (this.isEu == null ? ip.isEu == null : this.isEu.equals(ip.isEu)) &&
        (this.geonameId == null ? ip.geonameId == null : this.geonameId.equals(ip.geonameId)) &&
        (this.city == null ? ip.city == null : this.city.equals(ip.city)) &&
        (this.region == null ? ip.region == null : this.region.equals(ip.region)) &&
        (this.lat == null ? ip.lat == null : this.lat.equals(ip.lat)) &&
        (this.lon == null ? ip.lon == null : this.lon.equals(ip.lon)) &&
        (this.tzId == null ? ip.tzId == null : this.tzId.equals(ip.tzId)) &&
        (this.localtimeEpoch == null ? ip.localtimeEpoch == null : this.localtimeEpoch.equals(ip.localtimeEpoch)) &&
        (this.localtime == null ? ip.localtime == null : this.localtime.equals(ip.localtime));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.ip == null ? 0: this.ip.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.continentCode == null ? 0: this.continentCode.hashCode());
    result = 31 * result + (this.continentName == null ? 0: this.continentName.hashCode());
    result = 31 * result + (this.countryCode == null ? 0: this.countryCode.hashCode());
    result = 31 * result + (this.countryName == null ? 0: this.countryName.hashCode());
    result = 31 * result + (this.isEu == null ? 0: this.isEu.hashCode());
    result = 31 * result + (this.geonameId == null ? 0: this.geonameId.hashCode());
    result = 31 * result + (this.city == null ? 0: this.city.hashCode());
    result = 31 * result + (this.region == null ? 0: this.region.hashCode());
    result = 31 * result + (this.lat == null ? 0: this.lat.hashCode());
    result = 31 * result + (this.lon == null ? 0: this.lon.hashCode());
    result = 31 * result + (this.tzId == null ? 0: this.tzId.hashCode());
    result = 31 * result + (this.localtimeEpoch == null ? 0: this.localtimeEpoch.hashCode());
    result = 31 * result + (this.localtime == null ? 0: this.localtime.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ip {\n");
    
    sb.append("  ip: ").append(ip).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  continentCode: ").append(continentCode).append("\n");
    sb.append("  continentName: ").append(continentName).append("\n");
    sb.append("  countryCode: ").append(countryCode).append("\n");
    sb.append("  countryName: ").append(countryName).append("\n");
    sb.append("  isEu: ").append(isEu).append("\n");
    sb.append("  geonameId: ").append(geonameId).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  region: ").append(region).append("\n");
    sb.append("  lat: ").append(lat).append("\n");
    sb.append("  lon: ").append(lon).append("\n");
    sb.append("  tzId: ").append(tzId).append("\n");
    sb.append("  localtimeEpoch: ").append(localtimeEpoch).append("\n");
    sb.append("  localtime: ").append(localtime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}