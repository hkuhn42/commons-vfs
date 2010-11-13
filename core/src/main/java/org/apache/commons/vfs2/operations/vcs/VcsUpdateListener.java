/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.vfs2.operations.vcs;

/**
 *
 * @author Siarhei Baidun
 * @since 0.1
 */
public interface VcsUpdateListener
{
    /**
     *
     * @param path The path.
     * @param revision The revision number.
     * @param contentStatus
     *            takes one of the values as defined in the
     * @see VcsStatus constants.
     */
    void updated(final String path, final long revision, final int contentStatus);
}