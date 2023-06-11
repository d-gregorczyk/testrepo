package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import java.time.LocalDateTime
import org.somda.protosdc.biceps.model.PersonParticipation
import org.somda.protosdc.biceps.model.CodedValue
import org.somda.protosdc.biceps.model.ImagingProcedure

data class OrderDetail(
    val extensionElement: Extension? = null,
    val start: LocalDateTime? = null,
    val end: LocalDateTime? = null,
    val performer: List<PersonParticipation> = listOf(),
    val service: List<CodedValue> = listOf(),
    val imagingProcedure: List<ImagingProcedure> = listOf(),
)
