# Java Spring API

Exemplo de API RESTFUL com uso do Java Spring e REST Template.
Com objetivo de consumir a API `https://digimon-api.vercel.app/`

This project was generated with [Java Spring Boot](https://spring.io/projects/spring-boot) version 3.0.5

## Development server

Navigate to `http://localhost:8080/api/digimons`. The app will automatically reload if you change any of the source files.

## API REQUESTS:

| ROTA                        | HTTP(Verbo) | Request       | Return | Description                 |
| --------------------------- | ----------- | ------------- | ------ | --------------------------- |
| /api/digimons               | GET         | -             | HTML   | API index                   |
| /api/digimons/list          | GET         | -             | JSON   | Lista todos os Digimons     |
| /api/digimons/level/{level} | GET         | String(level) | JSON   | Lista os Digimons por nível |
| /api/digimons/name/{name}   | GET         | String(name)  | JSON   | Lista o Digimon por nome    |
