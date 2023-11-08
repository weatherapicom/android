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
public class CurrentAirQuality {
  
  @SerializedName("co")
  private BigDecimal co = null;
  @SerializedName("no2")
  private BigDecimal no2 = null;
  @SerializedName("o3")
  private BigDecimal o3 = null;
  @SerializedName("so2")
  private BigDecimal so2 = null;
  @SerializedName("pm2_5")
  private BigDecimal pm25 = null;
  @SerializedName("pm10")
  private BigDecimal pm10 = null;
  @SerializedName("us-epa-index")
  private Integer usEpaIndex = null;
  @SerializedName("gb-defra-index")
  private Integer gbDefraIndex = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getCo() {
    return co;
  }
  public void setCo(BigDecimal co) {
    this.co = co;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getNo2() {
    return no2;
  }
  public void setNo2(BigDecimal no2) {
    this.no2 = no2;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getO3() {
    return o3;
  }
  public void setO3(BigDecimal o3) {
    this.o3 = o3;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getSo2() {
    return so2;
  }
  public void setSo2(BigDecimal so2) {
    this.so2 = so2;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPm25() {
    return pm25;
  }
  public void setPm25(BigDecimal pm25) {
    this.pm25 = pm25;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPm10() {
    return pm10;
  }
  public void setPm10(BigDecimal pm10) {
    this.pm10 = pm10;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getUsEpaIndex() {
    return usEpaIndex;
  }
  public void setUsEpaIndex(Integer usEpaIndex) {
    this.usEpaIndex = usEpaIndex;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getGbDefraIndex() {
    return gbDefraIndex;
  }
  public void setGbDefraIndex(Integer gbDefraIndex) {
    this.gbDefraIndex = gbDefraIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentAirQuality currentAirQuality = (CurrentAirQuality) o;
    return (this.co == null ? currentAirQuality.co == null : this.co.equals(currentAirQuality.co)) &&
        (this.no2 == null ? currentAirQuality.no2 == null : this.no2.equals(currentAirQuality.no2)) &&
        (this.o3 == null ? currentAirQuality.o3 == null : this.o3.equals(currentAirQuality.o3)) &&
        (this.so2 == null ? currentAirQuality.so2 == null : this.so2.equals(currentAirQuality.so2)) &&
        (this.pm25 == null ? currentAirQuality.pm25 == null : this.pm25.equals(currentAirQuality.pm25)) &&
        (this.pm10 == null ? currentAirQuality.pm10 == null : this.pm10.equals(currentAirQuality.pm10)) &&
        (this.usEpaIndex == null ? currentAirQuality.usEpaIndex == null : this.usEpaIndex.equals(currentAirQuality.usEpaIndex)) &&
        (this.gbDefraIndex == null ? currentAirQuality.gbDefraIndex == null : this.gbDefraIndex.equals(currentAirQuality.gbDefraIndex));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.co == null ? 0: this.co.hashCode());
    result = 31 * result + (this.no2 == null ? 0: this.no2.hashCode());
    result = 31 * result + (this.o3 == null ? 0: this.o3.hashCode());
    result = 31 * result + (this.so2 == null ? 0: this.so2.hashCode());
    result = 31 * result + (this.pm25 == null ? 0: this.pm25.hashCode());
    result = 31 * result + (this.pm10 == null ? 0: this.pm10.hashCode());
    result = 31 * result + (this.usEpaIndex == null ? 0: this.usEpaIndex.hashCode());
    result = 31 * result + (this.gbDefraIndex == null ? 0: this.gbDefraIndex.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentAirQuality {\n");
    
    sb.append("  co: ").append(co).append("\n");
    sb.append("  no2: ").append(no2).append("\n");
    sb.append("  o3: ").append(o3).append("\n");
    sb.append("  so2: ").append(so2).append("\n");
    sb.append("  pm25: ").append(pm25).append("\n");
    sb.append("  pm10: ").append(pm10).append("\n");
    sb.append("  usEpaIndex: ").append(usEpaIndex).append("\n");
    sb.append("  gbDefraIndex: ").append(gbDefraIndex).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
