# microsservicos
Projeto para juntar os meus quatro projetos relacionados a microsserviços no Spring Boot: configserver, serviceregistry, apigateway e aleatorio

Construído baseado nesse vídeo aqui: https://www.youtube.com/watch?v=bVmczgfeR5Y

Subir na seguinte ordem:

1. serviceregistry
1. configserver
1. aleatorio
1. apigateway

URLs de teste:

* serviceregistry: http://localhost:8761/

* configserver: http://localhost:8088/aleatorio/default

* aleatorio:
  * Rodando sozinho: http://localhost:8080/aleatorio/aleatorio
  * Rodando como microsserviço: http://localhost:8090/aleatorio/aleatorio
  * Rodando pelo gateway: http://localhost:8060/aleatorio/aleatorio

Usando o zipkin (não parece estar funcionando; isso aqui deve resolver: https://stackoverflow.com/questions/74877968/zipkin-not-working-in-docker-conncection-refused)

* Na pasta zipkin, rodar donwload.sh e depois run.sh
* Consultar aqui: http://localhost:9411/zipkin/
