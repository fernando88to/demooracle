package com.fernando.controller

import com.fernando.domain.Thing
import com.fernando.repository.ThingRepository
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

import org.slf4j.Logger
import org.slf4j.LoggerFactory


@Controller("/")
class ThingControllerController {
    static final Logger LOG = LoggerFactory.getLogger(ThingControllerController.class)

    ThingRepository thingRepository

    ThingControllerController(ThingRepository thingRepository) {
        this.thingRepository = thingRepository
    }

    @Get(uri = "/", produces = MediaType.APPLICATION_JSON)
    List<Thing> index() {
        List<Thing> things = [
                new Thing(name:"Foo"),
                new Thing(name:"Micronaut")
        ]
        things
    }

    @Get(uri = '/salvar', produces = MediaType.APPLICATION_JSON)
    Thing salvar() {

        LOG.debug("deu pau")
        thingRepository.save(new Thing(name:"Foo"))

    }

}