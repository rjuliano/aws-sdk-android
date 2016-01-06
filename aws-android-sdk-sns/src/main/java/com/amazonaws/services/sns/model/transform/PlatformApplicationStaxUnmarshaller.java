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

package com.amazonaws.services.sns.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * Platform Application StAX Unmarshaller
 */
public class PlatformApplicationStaxUnmarshaller implements Unmarshaller<PlatformApplication, StaxUnmarshallerContext> {
    private static class AttributesMapEntryUnmarshaller implements Unmarshaller<Map.Entry<String, String>, StaxUnmarshallerContext> {
        @Override
        public Entry<String, String> unmarshall(StaxUnmarshallerContext context) throws Exception {
            int originalDepth = context.getCurrentDepth();
            int targetDepth = originalDepth + 1;

            MapEntry<String, String> entry
                = new MapEntry<String, String>();

            while (true) {
                int xmlEvent = context.nextEvent();
                if (xmlEvent == XmlPullParser.END_DOCUMENT) return entry;

                if (xmlEvent == XmlPullParser.START_TAG) {
                    if (context.testExpression("key", targetDepth)) {
                        entry.setKey(StringStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                    if (context.testExpression("value", targetDepth)) {
                        entry.setValue(StringStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                } else if (xmlEvent == XmlPullParser.END_TAG) {
                    if (context.getCurrentDepth() < originalDepth) return entry;
                }
            }
        }

        private static AttributesMapEntryUnmarshaller instance;
        public static AttributesMapEntryUnmarshaller getInstance() {
            if (instance == null) instance = new AttributesMapEntryUnmarshaller();
            return instance;
        }

    }

    public PlatformApplication unmarshall(StaxUnmarshallerContext context) throws Exception {
        PlatformApplication platformApplication = new PlatformApplication();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) return platformApplication;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("PlatformApplicationArn", targetDepth)) {
                    platformApplication.setPlatformApplicationArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Attributes/entry", targetDepth)) {
                    Entry<String, String> entry = AttributesMapEntryUnmarshaller.getInstance().unmarshall(context);
                    platformApplication.getAttributes().put(entry.getKey(), entry.getValue());
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    return platformApplication;
                }
            }
        }
    }

    private static PlatformApplicationStaxUnmarshaller instance;
    public static PlatformApplicationStaxUnmarshaller getInstance() {
        if (instance == null) instance = new PlatformApplicationStaxUnmarshaller();
        return instance;
    }
}
    