package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.HandleRef

data class AbstractReportPart (
    val extensionElement: Extension? = null,
    val sourceMds: HandleRef? = null,
)
