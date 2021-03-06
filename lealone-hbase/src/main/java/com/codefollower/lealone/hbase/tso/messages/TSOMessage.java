/*
 * Copyright 2011 The Apache Software Foundation
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.codefollower.lealone.hbase.tso.messages;

import java.io.DataOutputStream;
import java.io.IOException;

import org.jboss.netty.buffer.ChannelBuffer;

/**
 * The interface the identified the messages sent to TSO
 * @author maysam
 *
 */
public interface TSOMessage {

    final public byte TimestampRequest = (byte) 0xc0;
    final public byte TimestampResponse = (byte) 0xc1;

    /*
     * Deserialize function
     * We use ChannelBuffer instead of DataInputStream because the performance is better
     */
    public void readObject(ChannelBuffer aInputStream);

    /*
     * Serialize function
     */
    public void writeObject(DataOutputStream aOutputStream) throws IOException;

}
