/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.batoo.jpa.parser.metadata;

/**
 * The definition of primary key join columns.
 * 
 * @author hceylan
 * @since $version
 */
public interface PrimaryKeyJoinColumnMetadata extends BindableMetadata {

	/**
	 * Returns the raw column definition of the primary key join column.
	 * 
	 * @return the raw column definition of the the primary key join column
	 * 
	 * @since $version
	 * @author hceylan
	 */
	String getColumnDefinition();

	/**
	 * Returns the name of the referenced column of the the primary key join column.
	 * 
	 * @return the name of the referenced column of the the primary key join column
	 * 
	 * @since $version
	 * @author hceylan
	 */
	String getReferencedColumnName();
}