/*
 * Copyright 2015 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.navercorp.redis.cluster.gateway;

import com.navercorp.redis.cluster.RedisCluster;


/**
 * The Interface RedisClusterCallback.
 *
 * @param <T> the generic type
 *            {@link Client#execute(RedisClusterCallback)}
 * @author seongminwoo
 */
public interface RedisClusterCallback<T> {

    /**
     * RedisCluster 객체를 통해 redis command를 수행하도록 구현하면된다.
     *
     * @param redisCluster the redis cluster
     * @return the t
     */
    public T doInRedisCluster(RedisCluster redisCluster);

    public int getPartitionNumber();

    public AffinityState getState();
}
