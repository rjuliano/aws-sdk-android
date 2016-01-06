/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.machinelearning.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * Predict Request Marshaller
 */
public class PredictRequestMarshaller implements Marshaller<Request<PredictRequest>, PredictRequest> {

    public Request<PredictRequest> marshall(PredictRequest predictRequest) {
    if (predictRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<PredictRequest> request = new DefaultRequest<PredictRequest>(predictRequest, "AmazonMachineLearning");
        String target = "AmazonML_20141212.Predict";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);

            jsonWriter.beginObject();
            
            if (predictRequest.getMLModelId() != null) {
                jsonWriter.name("MLModelId").value(predictRequest.getMLModelId());
            }
            if (predictRequest.getRecord() != null) {
                jsonWriter.name("Record");
                jsonWriter.beginObject();
                for (Map.Entry<String, String> recordListValue : predictRequest.getRecord().entrySet()) {
                    if (recordListValue.getValue() != null) {
                        jsonWriter.name(recordListValue.getKey());

                        jsonWriter.value(recordListValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }
            if (predictRequest.getPredictEndpoint() != null) {
                jsonWriter.name("PredictEndpoint").value(predictRequest.getPredictEndpoint());
            }

            jsonWriter.endObject();

            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch(Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
