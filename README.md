# food-ordering-service
Microservices demo using Clean &amp; Hexagonal architectures

# Running Kafka clusters
The following commands should be run to start the Kafka cluster in local env. 
Inside of `\infrastructure\docker-compose` execute:
- `docker-compose -f .\common.yml -f .\zookeeper.yml up`
- `echo ruok | nc localhost 2181` optional
- `docker-compose -f .\common.yml -f \.kafka_cluster.yml  up`
- `docker-compose -f common.yml -f init_kafka.yml up`

And then, go to http://localhost:9000/ and add discovery the cluster by adding a new cluster name and zookeeper host(zookeeper:2181)