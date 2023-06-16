package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractReport
import org.somda.protosdc.biceps.model.AbstractReportPart
import org.somda.protosdc.biceps.model.AbstractDescriptorOneOf
import org.somda.protosdc.biceps.model.AbstractStateOneOf
import org.somda.protosdc.biceps.model.HandleRef
import org.somda.protosdc.biceps.model.DescriptionModificationType

data class DescriptionModificationReport(
    val abstractReport: AbstractReport,
val reportPart: List<ReportPart> = listOf(),
) {
    data class ReportPart(
        val abstractReportPart: AbstractReportPart,
val descriptor: List<AbstractDescriptorOneOf> = listOf(),
val state: List<AbstractStateOneOf> = listOf(),
        val parentDescriptorAttr: HandleRef? = null,
        val modificationTypeAttr: DescriptionModificationType? = null,
    )
}
