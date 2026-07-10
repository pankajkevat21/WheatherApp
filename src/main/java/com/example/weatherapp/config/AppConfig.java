package com.example.weatherapp.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
public class AppConfpublic class AppConfpublic class AppConfpublic class AppConfpublic class AppConfpublic class AppConfpublic class AppConfpublic class AppConfpublic class AppConfpubampublic class AppConf/WeatherResponse.javapublic c'
package com.examplepackage com.examplepacort copackage com.examplepackage com.examplepacort copackage com.examplepackage cackson.annotation.JsonProperty;
impoimpoimpoimpoim;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    private String name;
    @JsonProperty("main") private MainData main;
    @Json    @Json    @Json    @Json    @Json   eather    @Json    @Json    @Json    @Json    @Json   eather    @
    pu lic static c    pu lic static c    pu lice te    pu lic static c    pu lic static c    pu lice te    pu lic static c known = true)
    public static class Wea    public static class Wea    public static classic    public static class Wea    public static class Wea    pma    public static class Wea    public static clasvic    pub<< 'EOF'    public static class Wea    public static class Wea    public static classic    public static class Wea    public static class Wea    pma    public static class Wea    public static clasvic    pub<< 'EOF'    public static class Wefra    public static class Wea    public static class Wea    public static classic    public static class Wea    public static class Wea    pma    public te     public stati  @Value("    public static class Wea    public sKey;
    public static cla.api.url}"    public static ciUrl;
    public WeatherResponse getWeather(String city) {
        String url = apiUrl + "?q=" + city + "&appid=" + apiKey + "&units=metric";
        try { return restTe        try { return restTe        try { return restTe        try { return restTe        try { return restTe        try { return restTe 
ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccspccccccccccccccccccccccccccccccccccccccccccccccccccccccWeccccccccccccccccccccccccccccccccccccccccccccccccccccicccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccse return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
}
