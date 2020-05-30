package com.shasha.msksmanufacturer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MsksManufacturerApplication {


    public static void main(String[] args) {
        System.out.println("START");

        // RestTemplate restTemplate = new RestTemplate();
        ApplicationContext ctx = SpringApplication.run(MsksManufacturerApplication.class, args);
        // RestTemplate restTemplate1 = ctx.getBean(RestTemplate.class);
//        System.out.println(restTemplate.getForObject("http://localhost:8080/api/v1/numbers/convert/123", String.class));
//        ChocolateDto chocolateDto = ChocolateDto.builder()
//                .id(UUID.randomUUID())
//                .chocolateName("coco")
//                .chocolateSlogan("Best chocolate in the world")
//                .upc(123456L).build();
//        System.out.println("****");
//        System.out.println(restTemplate.postForObject("http://localhost:8080/api/v1/chocolate/add", chocolateDto, String.class));

        System.out.println("END");

    }


}
