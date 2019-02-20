package com.serli.oracle.of.bacon.repository;

import redis.clients.jedis.Jedis;

import java.util.List;

public class RedisRepository {
    private final Jedis jedis;

    public RedisRepository() {
        this.jedis = new Jedis("localhost");
    }
    public void SaveSearch(String acteur){
        this.jedis.lpush("lastSearch", acteur);
    }

    public List<String> getLastTenSearches() {
        // TODO implement last 10 searchs
        return this.jedis.lrange("lastsearch", 0, 9);
    }
}
