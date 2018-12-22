package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-07T17:53:15.346+03:00")

@Configuration
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("API ProductOrdering")
            .description("##TMF API Reference :)") //TMF 622 - Product Ordering Management  ##Release : 17.5 - November 2017  The Product Ordering API provides a standardized mechanism for placing a product order with all of the necessary order parameters. The API consists of a simple set of operations that interact with CRM/Order Negotiation systems in a consistent manner. A product order is created based on a product offer that is defined in a catalog. The product offer identifies the product or set of products that are available to a customer, and includes characteristics such as pricing, product options and market.  The product order references the product offer and identifies any specific requests made by the customer.  ###Product Order resource A Product Order is a type of order which  can  be used to place an order  between a customer and a service provider or between a service provider and a partner and vice versa. Main Product  Order  attributes  are  its  identifier,  state,  priority  category  (mass  market,  Enterprise,  etc.) related dates (start, completion, etc.), related billing account, related parties and order items. Main Order Items (aka order lines) attributes are the ordered offering and product characteristics with the  related  action  to  be performed  (e.g.  add  or  delete  the  products),  state,  location  information  for delivery, order item price and price alteration.  ###Product Order API performs the following operations on product order : - Retrieval of a product order or a collection of product orders depending on filter criteria - Partial update of a product order (including updating rules) - Creation of a product order (including default values and creation rules) - Deletion of product order (for administration purposes) - Notification of events on product order.  Copyright © TM Forum 2017. All Rights Reserved  [Read more](http://api-docs.cf.ns.nd-paas.itn.ftgroup/tmf_productOrdering_3.0/TMF622_Product_Ordering_Management_API_REST_Specification_R16.5.1.pdf)
            .license("")
            .licenseUrl("http://unlicense.org")
            .termsOfServiceUrl("")
            .version("4.0.0_inProgress")
            .contact(new Contact("","", ""))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

}
