package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.InstanceIdentifierOneOf
import org.somda.protosdc.biceps.model.CodedValue

data class ImagingProcedure (
    val extensionElement: Extension? = null,
    val accessionIdentifier: InstanceIdentifierOneOf,
    val requestedProcedureId: InstanceIdentifierOneOf,
    val studyInstanceUid: InstanceIdentifierOneOf,
    val scheduledProcedureStepId: InstanceIdentifierOneOf,
    val modality: CodedValue? = null,
    val protocolCode: CodedValue? = null,
)
