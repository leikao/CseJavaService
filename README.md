# Java CSE Spring MVC microservice

| Language | Framework | Platform
| -------- | -------- |--------|
| Java | CSE Spring MVC | ServiceStage Container, CCE Cluster|

This sample code helps get you started with a simple Java CSE microservice
deployed by ServiceStage Container App to a CCE Cluster.

This sample includes:

* README.md
* LICENSE
* Dockerfile
* pom.xml - this file is the Maven Project Object Model for the microservice
* src/main - this directory contains your Java service source files
* src/test - this directory contains your Java service unit test files

## Getting Started

Clone your code repository and start developing your application on IDE of your choice

1. Install maven.  See https://maven.apache.org/install.html for details.

2. Download local-service-center from http://servicecomb.incubator.apache.org/release/. Read README.md to start local-service-center.

3. Update the service registry address in microservice.yaml according to the README.md in local-service-center.

4. Build the application.

        $ mvn -f pom.xml package

5. Run the application in IDE or execute the jar.

6. Open http://127.0.0.1:8080/cse/helloworld?name=hellworld in a web browser to view your application.

if you want to deploy the sample code on servicestage, View your CI/CD pipeline and service stack on ServiceStage and customize it as per your needs

## Contributing

## Local CSE

Download [Local CSE](https://console.huaweicloud.com/servicestage/#/cse/tools)

| Components | Listening Port | Endpoint |
| --- | --- | --- |
| [CSE Console](http://localhost:30106/) | `30106` | `http://localhost:30106/` | 
| [Service Center Dashboard](http://localhost:30103/) | `30103` | `http://localhost:30103/` |
| Service Center | `30100` | `http://localhost:30100/` |
| Config Center | `30113` | `http://localhost:30113/` |

## CSE Environment Variables

| Environment Variable | Description | Example |
| --- | --- | --- |
| `PAAS_CSE_ENDPOINT` | CSE配置中心和注册中心的地址<br/>等同于同时设置`PAAS_CSE_SC_ENDPOINT`与`PAAS_CSE_CC_ENDPOINT` | `http://127.0.0.1:30100` |
| `PAAS_CSE_SC_ENDPOINT` | CSE注册中心的地址 | `http://127.0.0.1:30100` |
| `PAAS_CSE_CC_ENDPOINT`   | CSE配置中心的地址 | `http://127.0.0.1:30113` |
| `SERVICECOMB_ENV` | 设置当前环境为开发环境，避免契约接口变化导致服务启动失败，**只用于本地开发环境设置** | `development` |
| `APOLLO_META` | Apollo配置服务的Endpoint | `http://127.0.0.1:8080` | 

## Apollo

[Dashboard](http://localhost:8070/)   apollo/admin
