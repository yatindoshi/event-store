package com.hsbc.fxpteventstore.service;

import com.hsbc.fxpteventstore.domain.Message;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.kafka.connect.json.JsonDeserializer;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.state.QueryableStoreTypes;
import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.binder.kafka.streams.InteractiveQueryService;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    private InteractiveQueryService queryService;

    public String getById(String id) {
        ReadOnlyKeyValueStore<String, Message> keyValueStore = queryService.getQueryableStore("event-store", QueryableStoreTypes.keyValueStore());
        return keyValueStore.get(id).getText();
    }
}
