/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance
 * with the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package org.apache.mxnet.zoo;

import org.apache.mxnet.zoo.cv.image_classification.ImageNetModel;
import org.apache.mxnet.zoo.cv.objectdetection.SingleShotDetection;
import software.amazon.ai.repository.Repository;

public interface ModelZoo {

    String MXNET_REPO_URL = "https://joule.s3.amazonaws.com/mlrepo/";
    Repository REPOSITORY = Repository.newInstance("MxNet", MXNET_REPO_URL);
    String GROUP_ID = "org.apache.mxnet";

    SingleShotDetection SSD = new SingleShotDetection(REPOSITORY);
    ImageNetModel RESNET = new ImageNetModel(REPOSITORY, "resnet");
    ImageNetModel RESNEXT = new ImageNetModel(REPOSITORY, "resnext");
    ImageNetModel SENET = new ImageNetModel(REPOSITORY, "senet");
    ImageNetModel SE_RESNEXT = new ImageNetModel(REPOSITORY, "se_resnext");
}