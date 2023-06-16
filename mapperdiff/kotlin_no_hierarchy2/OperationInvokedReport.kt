package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractReport
import org.somda.protosdc.biceps.model.AbstractReportPart
import org.somda.protosdc.biceps.model.InvocationInfo
import org.somda.protosdc.biceps.model.InstanceIdentifierOneOf
import org.somda.protosdc.biceps.model.HandleRef

data class OperationInvokedReport(
    val abstractReport: AbstractReport,
    val reportPart: List<ReportPart> = listOf(),
) {
    data class ReportPart(
        val abstractReportPart: AbstractReportPart,
        val invocationInfo: InvocationInfo,
        val invocationSource: InstanceIdentifierOneOf,
        val operationHandleRefAttr: HandleRef,
        val operationTargetAttr: HandleRef? = null,
    )
}
