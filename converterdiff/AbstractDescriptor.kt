package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.CodedValue
import org.somda.protosdc.biceps.model.Handle
import org.somda.protosdc.biceps.model.VersionCounter
import org.somda.protosdc.biceps.model.SafetyClassification

data class AbstractDescriptor(
    val extensionElement: Extension? = null,
    val type: CodedValue? = null,
    val handleAttr: Handle,
    val descriptorVersionAttr: VersionCounter? = null,
    val safetyClassificationAttr: SafetyClassification? = null,
)
