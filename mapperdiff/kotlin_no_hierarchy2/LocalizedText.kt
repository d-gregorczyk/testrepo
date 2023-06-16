package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.LocalizedTextContent
import org.somda.protosdc.biceps.model.LocalizedTextRef
import org.somda.protosdc.biceps.model.ReferencedVersion
import org.somda.protosdc.biceps.model.LocalizedTextWidth

data class LocalizedText(
    val localizedTextContent: LocalizedTextContent,
    val refAttr: LocalizedTextRef? = null,
    val langAttr: String? = null,
    val versionAttr: ReferencedVersion? = null,
    val textWidthAttr: LocalizedTextWidth? = null,
)
