/*
 * Merge ATS API
 * The unified API for building rich integrations with multiple Applicant Tracking System platforms.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: hello@merge.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package merge_ats_client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import merge_ats_client.JSON;
import merge_ats_client.model.EmailAddressRequest;
import merge_ats_client.model.PhoneNumberRequest;
import merge_ats_client.model.UrlRequest;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


/**
 * Model tests for CandidateRequest
 */
public class CandidateRequestTest {
    private final CandidateRequest model = new CandidateRequest();

    /**
     * Model tests for CandidateRequest
     */
    @Test
    public void testCandidateRequest() {
        // TODO: test CandidateRequest
    }

    /**
     * Test the property 'remoteId'
     */
    @Test
    public void remoteIdTest() {
        // TODO: test remoteId
    }

    /**
     * Test the property 'firstName'
     */
    @Test
    public void firstNameTest() {
        // TODO: test firstName
    }

    /**
     * Test the property 'lastName'
     */
    @Test
    public void lastNameTest() {
        // TODO: test lastName
    }

    /**
     * Test the property 'company'
     */
    @Test
    public void companyTest() {
        // TODO: test company
    }

    /**
     * Test the property 'title'
     */
    @Test
    public void titleTest() {
        // TODO: test title
    }

    /**
     * Test the property 'remoteCreatedAt'
     */
    @Test
    public void remoteCreatedAtTest() {
        // TODO: test remoteCreatedAt
    }

    /**
     * Test the property 'remoteUpdatedAt'
     */
    @Test
    public void remoteUpdatedAtTest() {
        // TODO: test remoteUpdatedAt
    }

    /**
     * Test the property 'lastInteractionAt'
     */
    @Test
    public void lastInteractionAtTest() {
        // TODO: test lastInteractionAt
    }

    /**
     * Test the property 'isPrivate'
     */
    @Test
    public void isPrivateTest() {
        // TODO: test isPrivate
    }

    /**
     * Test the property 'canEmail'
     */
    @Test
    public void canEmailTest() {
        // TODO: test canEmail
    }

    /**
     * Test the property 'locations'
     */
    @Test
    public void locationsTest() {
        // TODO: test locations
    }

    /**
     * Test the property 'phoneNumbers'
     */
    @Test
    public void phoneNumbersTest() {
        // TODO: test phoneNumbers
    }

    /**
     * Test the property 'emailAddresses'
     */
    @Test
    public void emailAddressesTest() {
        // TODO: test emailAddresses
    }

    /**
     * Test the property 'urls'
     */
    @Test
    public void urlsTest() {
        // TODO: test urls
    }

    /**
     * Test the property 'tags'
     */
    @Test
    public void tagsTest() {
        // TODO: test tags
    }

    /**
     * Test the property 'applications'
     */
    @Test
    public void applicationsTest() {
        // TODO: test applications
    }

    /**
     * Test the property 'attachments'
     */
    @Test
    public void attachmentsTest() {
        JSON serializer = new JSON();

        CandidateRequest testIdModel = new CandidateRequest();
        UUID testId = UUID.randomUUID();
        List<UUID> idList = new ArrayList<>();
        idList.add(testId);
        testIdModel.attachments(idList, serializer);

        String expected = String.format("{\"attachments\":[\"%s\"]}", testId);
        assertEquals(expected, serializer.serialize(testIdModel));

        CandidateRequest testObjModel = new CandidateRequest();
        AttachmentRequest testAttachmentModel = new AttachmentRequest();
        testAttachmentModel.fileName("example.com/resume.txt");
        testAttachmentModel.attachmentType("TEXT");
        List<AttachmentRequest> attachList = new ArrayList<>();
        attachList.add(testAttachmentModel);
        testObjModel.setAttachments(serializer.getGson().toJsonTree(attachList));

        String objExpected =
                "{\"attachments\":[{\"file_name\":\"example.com/resume.txt\",\"attachment_type\":\"TEXT\"}]}";
        assertEquals(objExpected, serializer.serialize(testObjModel));
    }

    /**
     * Test the property 'customFields'
     */
    @Test
    public void customFieldsTest() {
        // TODO: test customFields
    }

}
