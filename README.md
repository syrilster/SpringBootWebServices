# SpringBootWebServices

* What is Dispatcher Servlet?
* **Who is configuring Dispatcher Servlet?**
  Spring boot AutoConfiguration found Dispatcher Servlet on the classpath and that is because we added the starter web config in spring boot and this has a dependency on dispatcher servlet.
* **What does Dispatcher Servlet do?**
  Maps all the request from the application. It is a Front Controller as it knows all the mappings configured in the application.
* **How does the HelloWorldBean Object get converted to JSON?**
  HttpMessageConverters(JacksonAutoConfiguration) were AutoConfigured by Spring Boot because of starter web dependency.
* **Who is configuring the error mapping?**
  Same reason for the error page configuration in the form of WhiteLabelErrorViewConfiguration


