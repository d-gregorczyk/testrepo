package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractGet
import org.somda.protosdc.biceps.model.LocalizedTextRef
import org.somda.protosdc.biceps.model.ReferencedVersion
import org.somda.protosdc.biceps.model.LocalizedTextWidth

data class GetLocalizedText (
    val abstractGet: AbstractGet,
    val ref: List<LocalizedTextRef> = listOf(),
    val version: ReferencedVersion? = null,
    val lang: List<String> = listOf(),
    val textWidth: List<LocalizedTextWidth> = listOf(),
    val numberOfLines: List<Long> = listOf(),
)
