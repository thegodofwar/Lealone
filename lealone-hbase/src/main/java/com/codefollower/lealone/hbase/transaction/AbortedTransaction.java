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
package com.codefollower.lealone.hbase.transaction;

public class AbortedTransaction {
    private final long startTimestamp;
    private final long snapshot;

    public AbortedTransaction(long startTimestamp, long snapshot) {
        this.startTimestamp = startTimestamp;
        this.snapshot = snapshot;
    }

    public long getStartTimestamp() {
        return startTimestamp;
    }

    public long getSnapshot() {
        return snapshot;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (startTimestamp ^ (startTimestamp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AbortedTransaction other = (AbortedTransaction) obj;
        if (startTimestamp != other.startTimestamp)
            return false;
        return true;
    }

}
