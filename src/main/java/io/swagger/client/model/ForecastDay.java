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

import io.swagger.client.model.ForecastDayCondition;
import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ForecastDay {
  
  @SerializedName("maxtemp_c")
  private BigDecimal maxtempC = null;
  @SerializedName("maxtemp_f")
  private BigDecimal maxtempF = null;
  @SerializedName("mintemp_c")
  private BigDecimal mintempC = null;
  @SerializedName("mintemp_f")
  private BigDecimal mintempF = null;
  @SerializedName("avgtemp_c")
  private BigDecimal avgtempC = null;
  @SerializedName("avgtemp_f")
  private BigDecimal avgtempF = null;
  @SerializedName("maxwind_mph")
  private BigDecimal maxwindMph = null;
  @SerializedName("maxwind_kph")
  private BigDecimal maxwindKph = null;
  @SerializedName("totalprecip_mm")
  private BigDecimal totalprecipMm = null;
  @SerializedName("totalprecip_in")
  private BigDecimal totalprecipIn = null;
  @SerializedName("avgvis_km")
  private BigDecimal avgvisKm = null;
  @SerializedName("avgvis_miles")
  private BigDecimal avgvisMiles = null;
  @SerializedName("avghumidity")
  private BigDecimal avghumidity = null;
  @SerializedName("daily_will_it_rain")
  private Integer dailyWillItRain = null;
  @SerializedName("daily_chance_of_rain")
  private BigDecimal dailyChanceOfRain = null;
  @SerializedName("daily_will_it_snow")
  private Integer dailyWillItSnow = null;
  @SerializedName("daily_chance_of_snow")
  private BigDecimal dailyChanceOfSnow = null;
  @SerializedName("condition")
  private ForecastDayCondition condition = null;
  @SerializedName("uv")
  private Integer uv = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getMaxtempC() {
    return maxtempC;
  }
  public void setMaxtempC(BigDecimal maxtempC) {
    this.maxtempC = maxtempC;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getMaxtempF() {
    return maxtempF;
  }
  public void setMaxtempF(BigDecimal maxtempF) {
    this.maxtempF = maxtempF;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getMintempC() {
    return mintempC;
  }
  public void setMintempC(BigDecimal mintempC) {
    this.mintempC = mintempC;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getMintempF() {
    return mintempF;
  }
  public void setMintempF(BigDecimal mintempF) {
    this.mintempF = mintempF;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getAvgtempC() {
    return avgtempC;
  }
  public void setAvgtempC(BigDecimal avgtempC) {
    this.avgtempC = avgtempC;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getAvgtempF() {
    return avgtempF;
  }
  public void setAvgtempF(BigDecimal avgtempF) {
    this.avgtempF = avgtempF;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getMaxwindMph() {
    return maxwindMph;
  }
  public void setMaxwindMph(BigDecimal maxwindMph) {
    this.maxwindMph = maxwindMph;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getMaxwindKph() {
    return maxwindKph;
  }
  public void setMaxwindKph(BigDecimal maxwindKph) {
    this.maxwindKph = maxwindKph;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTotalprecipMm() {
    return totalprecipMm;
  }
  public void setTotalprecipMm(BigDecimal totalprecipMm) {
    this.totalprecipMm = totalprecipMm;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTotalprecipIn() {
    return totalprecipIn;
  }
  public void setTotalprecipIn(BigDecimal totalprecipIn) {
    this.totalprecipIn = totalprecipIn;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getAvgvisKm() {
    return avgvisKm;
  }
  public void setAvgvisKm(BigDecimal avgvisKm) {
    this.avgvisKm = avgvisKm;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getAvgvisMiles() {
    return avgvisMiles;
  }
  public void setAvgvisMiles(BigDecimal avgvisMiles) {
    this.avgvisMiles = avgvisMiles;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getAvghumidity() {
    return avghumidity;
  }
  public void setAvghumidity(BigDecimal avghumidity) {
    this.avghumidity = avghumidity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getDailyWillItRain() {
    return dailyWillItRain;
  }
  public void setDailyWillItRain(Integer dailyWillItRain) {
    this.dailyWillItRain = dailyWillItRain;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getDailyChanceOfRain() {
    return dailyChanceOfRain;
  }
  public void setDailyChanceOfRain(BigDecimal dailyChanceOfRain) {
    this.dailyChanceOfRain = dailyChanceOfRain;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getDailyWillItSnow() {
    return dailyWillItSnow;
  }
  public void setDailyWillItSnow(Integer dailyWillItSnow) {
    this.dailyWillItSnow = dailyWillItSnow;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getDailyChanceOfSnow() {
    return dailyChanceOfSnow;
  }
  public void setDailyChanceOfSnow(BigDecimal dailyChanceOfSnow) {
    this.dailyChanceOfSnow = dailyChanceOfSnow;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ForecastDayCondition getCondition() {
    return condition;
  }
  public void setCondition(ForecastDayCondition condition) {
    this.condition = condition;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getUv() {
    return uv;
  }
  public void setUv(Integer uv) {
    this.uv = uv;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastDay forecastDay = (ForecastDay) o;
    return (this.maxtempC == null ? forecastDay.maxtempC == null : this.maxtempC.equals(forecastDay.maxtempC)) &&
        (this.maxtempF == null ? forecastDay.maxtempF == null : this.maxtempF.equals(forecastDay.maxtempF)) &&
        (this.mintempC == null ? forecastDay.mintempC == null : this.mintempC.equals(forecastDay.mintempC)) &&
        (this.mintempF == null ? forecastDay.mintempF == null : this.mintempF.equals(forecastDay.mintempF)) &&
        (this.avgtempC == null ? forecastDay.avgtempC == null : this.avgtempC.equals(forecastDay.avgtempC)) &&
        (this.avgtempF == null ? forecastDay.avgtempF == null : this.avgtempF.equals(forecastDay.avgtempF)) &&
        (this.maxwindMph == null ? forecastDay.maxwindMph == null : this.maxwindMph.equals(forecastDay.maxwindMph)) &&
        (this.maxwindKph == null ? forecastDay.maxwindKph == null : this.maxwindKph.equals(forecastDay.maxwindKph)) &&
        (this.totalprecipMm == null ? forecastDay.totalprecipMm == null : this.totalprecipMm.equals(forecastDay.totalprecipMm)) &&
        (this.totalprecipIn == null ? forecastDay.totalprecipIn == null : this.totalprecipIn.equals(forecastDay.totalprecipIn)) &&
        (this.avgvisKm == null ? forecastDay.avgvisKm == null : this.avgvisKm.equals(forecastDay.avgvisKm)) &&
        (this.avgvisMiles == null ? forecastDay.avgvisMiles == null : this.avgvisMiles.equals(forecastDay.avgvisMiles)) &&
        (this.avghumidity == null ? forecastDay.avghumidity == null : this.avghumidity.equals(forecastDay.avghumidity)) &&
        (this.dailyWillItRain == null ? forecastDay.dailyWillItRain == null : this.dailyWillItRain.equals(forecastDay.dailyWillItRain)) &&
        (this.dailyChanceOfRain == null ? forecastDay.dailyChanceOfRain == null : this.dailyChanceOfRain.equals(forecastDay.dailyChanceOfRain)) &&
        (this.dailyWillItSnow == null ? forecastDay.dailyWillItSnow == null : this.dailyWillItSnow.equals(forecastDay.dailyWillItSnow)) &&
        (this.dailyChanceOfSnow == null ? forecastDay.dailyChanceOfSnow == null : this.dailyChanceOfSnow.equals(forecastDay.dailyChanceOfSnow)) &&
        (this.condition == null ? forecastDay.condition == null : this.condition.equals(forecastDay.condition)) &&
        (this.uv == null ? forecastDay.uv == null : this.uv.equals(forecastDay.uv));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.maxtempC == null ? 0: this.maxtempC.hashCode());
    result = 31 * result + (this.maxtempF == null ? 0: this.maxtempF.hashCode());
    result = 31 * result + (this.mintempC == null ? 0: this.mintempC.hashCode());
    result = 31 * result + (this.mintempF == null ? 0: this.mintempF.hashCode());
    result = 31 * result + (this.avgtempC == null ? 0: this.avgtempC.hashCode());
    result = 31 * result + (this.avgtempF == null ? 0: this.avgtempF.hashCode());
    result = 31 * result + (this.maxwindMph == null ? 0: this.maxwindMph.hashCode());
    result = 31 * result + (this.maxwindKph == null ? 0: this.maxwindKph.hashCode());
    result = 31 * result + (this.totalprecipMm == null ? 0: this.totalprecipMm.hashCode());
    result = 31 * result + (this.totalprecipIn == null ? 0: this.totalprecipIn.hashCode());
    result = 31 * result + (this.avgvisKm == null ? 0: this.avgvisKm.hashCode());
    result = 31 * result + (this.avgvisMiles == null ? 0: this.avgvisMiles.hashCode());
    result = 31 * result + (this.avghumidity == null ? 0: this.avghumidity.hashCode());
    result = 31 * result + (this.dailyWillItRain == null ? 0: this.dailyWillItRain.hashCode());
    result = 31 * result + (this.dailyChanceOfRain == null ? 0: this.dailyChanceOfRain.hashCode());
    result = 31 * result + (this.dailyWillItSnow == null ? 0: this.dailyWillItSnow.hashCode());
    result = 31 * result + (this.dailyChanceOfSnow == null ? 0: this.dailyChanceOfSnow.hashCode());
    result = 31 * result + (this.condition == null ? 0: this.condition.hashCode());
    result = 31 * result + (this.uv == null ? 0: this.uv.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastDay {\n");
    
    sb.append("  maxtempC: ").append(maxtempC).append("\n");
    sb.append("  maxtempF: ").append(maxtempF).append("\n");
    sb.append("  mintempC: ").append(mintempC).append("\n");
    sb.append("  mintempF: ").append(mintempF).append("\n");
    sb.append("  avgtempC: ").append(avgtempC).append("\n");
    sb.append("  avgtempF: ").append(avgtempF).append("\n");
    sb.append("  maxwindMph: ").append(maxwindMph).append("\n");
    sb.append("  maxwindKph: ").append(maxwindKph).append("\n");
    sb.append("  totalprecipMm: ").append(totalprecipMm).append("\n");
    sb.append("  totalprecipIn: ").append(totalprecipIn).append("\n");
    sb.append("  avgvisKm: ").append(avgvisKm).append("\n");
    sb.append("  avgvisMiles: ").append(avgvisMiles).append("\n");
    sb.append("  avghumidity: ").append(avghumidity).append("\n");
    sb.append("  dailyWillItRain: ").append(dailyWillItRain).append("\n");
    sb.append("  dailyChanceOfRain: ").append(dailyChanceOfRain).append("\n");
    sb.append("  dailyWillItSnow: ").append(dailyWillItSnow).append("\n");
    sb.append("  dailyChanceOfSnow: ").append(dailyChanceOfSnow).append("\n");
    sb.append("  condition: ").append(condition).append("\n");
    sb.append("  uv: ").append(uv).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
