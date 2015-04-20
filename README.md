Terminal 1
bin/zookeeper-server-start.sh config/zookeeper.properties

Terminal 2
bin/kafka-server-start.sh config/server.properties

Start a producer listening to the console (testing):
bin/kafka-console-producer.sh --broker-list localhost:9092 \
–-topic calc_events

Watch events:
bin/kafka-console-consumer.sh --topic calc_events --from-beginning \
--zookeeper localhost:2181

Terminal 4

Create a new topic

bin/kafka-topics.sh --create --topic calc_events \
--zookeeper localhost:2181 --replication-factor 1 --partitions 1

List topics:

bin/kafka-topics.sh --list --zookeeper localhost:2181