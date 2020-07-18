FROM openjdk:14-alpine
COPY build/libs/openFoodFactsDemoBarcodeClient-*-all.jar openFoodFactsDemoBarcodeClient.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "openFoodFactsDemoBarcodeClient.jar"]