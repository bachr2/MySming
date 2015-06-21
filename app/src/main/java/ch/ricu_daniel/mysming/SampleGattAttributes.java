/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ch.ricu_daniel.mysming;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    public static String LSM330_SERVICE           = "8EDF0200-67E5-DB83-F85B-A1E2AB1C9E7A";
    public static String LSM330_CHAR_ACC_EN       = "8EDF0201-67E5-DB83-F85B-A1E2AB1C9E7A";
    public static String LSM330_CHAR_GYRO_EN      = "8EDF0202-67E5-DB83-F85B-A1E2AB1C9E7A";
    public static String LSM330_CHAR_TEMP_SAMPLE  = "8EDF0203-67E5-DB83-F85B-A1E2AB1C9E7A";
    public static String LSM330_CHAR_ACC_FSCALE   = "8EDF0204-67E5-DB83-F85B-A1E2AB1C9E7A";
    public static String LSM330_CHAR_GYRO_FSCALE  = "8EDF0205-67E5-DB83-F85B-A1E2AB1C9E7A";
    public static String LSM330_CHAR_ACC_ODR      = "8EDF0206-67E5-DB83-F85B-A1E2AB1C9E7A";
    public static String LSM330_CHAR_GYRO_ODR     = "8EDF0207-67E5-DB83-F85B-A1E2AB1C9E7A";
    public static String LSM330_CHAR_TRIGGER_VAL  = "8EDF0208-67E5-DB83-F85B-A1E2AB1C9E7A";
    public static String LSM330_CHAR_TRIGGER_AXIS = "8EDF0209-67E5-DB83-F85B-A1E2AB1C9E7A";

    public static String MEASURE_SERVICE         = "8EDF0300-67E5-DB83-F85B-A1E2AB1C9E7A";
    public static String MEASURE_CHAR_START      = "8EDF0301-67E5-DB83-F85B-A1E2AB1C9E7A";
    public static String MEASURE_CHAR_STOP       = "8EDF0302-67E5-DB83-F85B-A1E2AB1C9E7A";
    public static String MEASURE_CHAR_DURATION   = "8EDF0303-67E5-DB83-F85B-A1E2AB1C9E7A";
    public static String MEASURE_CHAR_DATASTREAM = "8EDF0304-67E5-DB83-F85B-A1E2AB1C9E7A";

    static {
        // Sample Services.
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        // LSM330 Service
        attributes.put(LSM330_SERVICE,           "LSM330 Service");
        attributes.put(LSM330_CHAR_ACC_EN,       "LSM330 Turn on Accel");
        attributes.put(LSM330_CHAR_GYRO_EN,      "LSM330 Turn on Gyro");
        attributes.put(LSM330_CHAR_TEMP_SAMPLE,  "LSM330 Temperature Sample");
        attributes.put(LSM330_CHAR_ACC_FSCALE,   "LSM330 Accel Full-Scale");
        attributes.put(LSM330_CHAR_GYRO_FSCALE,  "LSM330 Gyro Full-Scale");
        attributes.put(LSM330_CHAR_ACC_ODR,      "LSM330 Accel ODR");
        attributes.put(LSM330_CHAR_GYRO_ODR,     "LSM330 Gyro ODR");
        attributes.put(LSM330_CHAR_TRIGGER_VAL,  "LSM330 Trigger Value");
        attributes.put(LSM330_CHAR_TRIGGER_AXIS, "LSM330 Trigger Axis");
        // Measurement Service
        attributes.put(MEASURE_SERVICE,         "Measurement Service");
        attributes.put(MEASURE_CHAR_START,      "Measurement Start");
        attributes.put(MEASURE_CHAR_STOP,       "Measurement Stop");
        attributes.put(MEASURE_CHAR_DURATION,   "Measurement Duration");
        attributes.put(MEASURE_CHAR_DATASTREAM, "Measurement Read Data");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
