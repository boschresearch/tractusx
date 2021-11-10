package net.catenax.prs.systemtest;

import io.restassured.authentication.BasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import net.catenax.prs.testing.UpdateRequestMother;
import org.junit.jupiter.api.BeforeEach;

public class SystemTestsBase {

    protected static final String PATH_BY_VIN = "/api/v0.1/vins/{vin}/partsTree";
    protected static final String PATH_BY_IDS = "/api/v0.1/parts/{oneIDManufacturer}/{objectIDManufacturer}/partsTree";
    protected static final String PATH_UPDATE_RELATIONSHIPS = "/broker-proxy/v0.1/partRelationshipUpdateList";
    protected static final String ONE_ID_MANUFACTURER = "oneIDManufacturer";
    protected static final String OBJECT_ID_MANUFACTURER = "objectIDManufacturer";
    protected static final String SAMPLE_VIN = "YS3DD78N4X7055320";
    protected static final String VIN = "vin";
    protected static final String VIEW = "view";
    protected static final String ASPECT = "aspect";
    protected static final String ASPECT_MATERIAL = "MATERIAL";
    protected static final String DEPTH = "depth";

    protected UpdateRequestMother generate = new UpdateRequestMother();

    protected RequestSpecification getRequestSpecification() {
        var specificationBuilder = new RequestSpecBuilder();
        return specificationBuilder.build();
    }
}