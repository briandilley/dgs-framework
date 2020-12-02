/*
 * Copyright 2020 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.graphql.dgs;

import java.lang.annotation.*;

/**
 * Mark a method to be a data fetcher.
 * A data fetcher can receive the DataFetchingEnvironment.
 * The "parentType" property is the type that contains this field.
 * For root queries that is "Query", and for root mutations "Mutation".
 * The field is the name of the field this data fetcher is responsible for.
 * See http://manuals.test.netflix.net/view/dgs/mkdocs/master/getting-started/
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface DgsData {
    String parentType();
    String field();
}