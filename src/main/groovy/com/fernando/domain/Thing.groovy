package com.fernando.domain

import io.micronaut.core.annotation.Introspected

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.SequenceGenerator
import javax.validation.constraints.Max
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.Null

@Entity(name = "thing")
@Introspected
class Thing {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "THING_SEQ")
    @SequenceGenerator(sequenceName = "THING_SEQ", allocationSize = 1, name = "THING_SEQ")
    Long id
    @NotNull @NotBlank
    String name
    @Null
    @Column(name="DATE_BIRTH")
    Date dataBirth
}
