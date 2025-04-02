// package com.caqm.common.config
//
// import org.springframework.context.annotation.Bean
// import org.springframework.context.annotation.Configuration
// import springfox.documentation.builders.RequestHandlerSelectors
// import springfox.documentation.service.ApiInfo
// import springfox.documentation.service.Contact
// import springfox.documentation.spi.DocumentationType
// import springfox.documentation.spring.web.plugins.Docket
// import springfox.documentation.swagger2.annotations.EnableSwagger2
//
// @Configuration
// @EnableSwagger2
// class SwaggerConfiguration {
//    // 配置Swagger的Docket的Bean实例
//    @Bean
//    fun docket(): Docket =
//        Docket(DocumentationType.SWAGGER_2)
//            // 是否开启Swagger
//            .enable(true)
//            .apiInfo(apiInfo())
//            .select()
//            // RequestHandlerSelectors 配置要扫描的接口的方式
//            // basePackage 指定要扫描的包
//            .apis(RequestHandlerSelectors.basePackage("com.caqm.entity"))
//            .build()
//
//    // 配置Swagger信息 apiInfo
//    fun apiInfo(): ApiInfo {
//        // 作者信息
//        val contact = Contact("xuaihua“", "aihua.love", "xah1123801846@outlook.com")
//
//        return ApiInfo(
//            "caqm api文档",
//            "这是caqm的api 文档",
//            "v1.0",
//            "没有服务条款",
//            contact,
//            "Apache 2.0",
//            "http://www.apache.org/licenses/LICENSE-2.0",
//            ArrayList(),
//        )
//    }
// }
