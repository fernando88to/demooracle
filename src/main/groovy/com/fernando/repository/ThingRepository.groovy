package com.fernando.repository

import com.fernando.domain.Thing
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
 interface ThingRepository extends CrudRepository<Thing, Long> {


}