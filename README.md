# 🧠 Demo project to test OpenTelemetry Docker image

## About

The goal of this Mini Project to build a Spring Boot application with a scheduled **Spring Batch** job that runs in every 5 minutes.

After that, **Prometheus** will scrape those metrics,
and **Grafana** will visualize them in real time.

## How to run the application
The application can be started with the following command:
- **docker-compose up --build.**

Once all the related services have started, these are the
final working URLs:
- **Plaintext metrics** (Spring Boot) - http://localhost:8080/actuator/prometheus
- **UI and queries** (Prometheus) - http://localhost:9090
- **Dashboards** (Grafana) - http://localhost:3000