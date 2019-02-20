# Oracle of Bacon
This application is an Oracle of Bacon implementation based on NoSQL data stores :
* ElasticSearch (http) - localhost:9200
* Redis - localhost:6379
* Mongo - localhost:27017
* Neo4J (bolt) - locahost:7687

To build :
```
./gradlew build
```

To Run, execute class *com.serli.oracle.of.bacon.Application*.



help perso:
neo4j_home$ 
    bin/neo4j-admin import --nodes:Movies imdb-data/movies.csv --nodes:Actors imdb-data/actors.csv --relationships imdb-data/roles.csv


bin/neo4j-import --into imdb-data --nodes:Movies movies.csv --nodes:Actors actors.csv --relationships roles.csv

bin/neo4j start

rm -rf data/