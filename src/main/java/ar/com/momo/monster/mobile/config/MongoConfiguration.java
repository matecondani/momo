package ar.com.momo.monster.mobile.config;

import org.apache.commons.lang3.StringUtils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import static ar.com.momo.monster.mobile.utils.ConstantUtils.AT;
import static ar.com.momo.monster.mobile.utils.ConstantUtils.COLON;
import static ar.com.momo.monster.mobile.utils.ConstantUtils.SLASH;

@Configuration
public class MongoConfiguration extends AbstractMongoClientConfiguration {

    private static final String MONGO_BASE = "mongodb://";

    @Value("${mongodb.host}")
    private String host;

    @Value("${mongodb.port}")
    private String port;

    @Value("${mongodb.database}")
    private String database;

    @Value("${mongodb.username}")
    private String username;

    @Value("${mongodb.password}")
    private String password;


    @Override
    protected String getDatabaseName() {
        return database;
    }

    @Override
    protected boolean autoIndexCreation() {
        return true;
    }

    @Override
    public MongoClient mongoClient() {
        ConnectionString connectionString = StringUtils.isAllEmpty(username, password) ?
            new ConnectionString(MONGO_BASE.concat(host).concat(COLON).concat(port)) :
            new ConnectionString(MONGO_BASE.concat(username).concat(COLON).concat(password).concat(AT)
                .concat(host).concat(COLON).concat(port).concat(SLASH).concat(database));
        MongoClientSettings mongoClientSettings =
            MongoClientSettings.builder().applyConnectionString(connectionString)
                .build();
        return MongoClients.create(mongoClientSettings);
    }

}
