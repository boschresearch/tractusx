/*
 * Copyright (c) 2022 Robert Bosch Manufacturing Solutions GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.catenax.semantics.registry.model;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

@Data
public class Shell {
    @Id
    UUID id;
    String idExternal;
    String idShort;

    @MappedCollection(idColumn = "FK_SHELL_ID")
    Set<ShellIdentifier> identifiers;

    @MappedCollection(idColumn = "FK_SHELL_ID")
    Set<ShellDescription> descriptions;

    @MappedCollection(idColumn = "FK_SHELL_ID")
    Set<Submodel> submodels;

    @CreatedDate
    Instant createdDate;

    @LastModifiedDate
    Instant lastModifiedDate;

    /**
     * create a new shell
     * @param id
     * @param idExternal
     * @param idShort
     * @param identifiers
     * @param descriptions
     * @param submodels
     * @param createdDate
     * @param lastModifiedDate
     */
    public Shell(UUID id, String idExternal, String idShort, Set<ShellIdentifier> identifiers, Set<ShellDescription> descriptions, Set<Submodel> submodels, Instant createdDate, Instant lastModifiedDate) {
        this.id=id;
        this.idExternal=idExternal;
        this.idShort=idShort;
        this.identifiers=identifiers;
        this.descriptions=descriptions;
        this.submodels=submodels;
        this.createdDate=createdDate;
        this.lastModifiedDate=lastModifiedDate;
    }
}
