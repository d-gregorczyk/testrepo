package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractContextState
import org.somda.protosdc.biceps.model.Extension
import org.somda.protosdc.biceps.model.PersonReferenceOneOf
import org.somda.protosdc.biceps.model.LocationReference
import org.somda.protosdc.biceps.model.InstanceIdentifierOneOf
import org.somda.protosdc.biceps.model.CodedValue
import org.somda.protosdc.biceps.model.ClinicalInfo
import org.somda.protosdc.biceps.model.OrderDetail

data class WorkflowContextState(
    val abstractContextState: AbstractContextState,
    val workflowDetail: WorkflowDetail? = null,
) {
    data class WorkflowDetail(
        val extensionElement: Extension? = null,
        val patient: PersonReferenceOneOf,
        val assignedLocation: LocationReference? = null,
        val visitNumber: InstanceIdentifierOneOf? = null,
val dangerCode: List<CodedValue> = listOf(),
val relevantClinicalInfo: List<ClinicalInfo> = listOf(),
        val requestedOrderDetail: RequestedOrderDetail? = null,
        val performedOrderDetail: PerformedOrderDetail? = null,
    ) {
        data class RequestedOrderDetail(
            val orderDetail: OrderDetail,
            val referringPhysician: PersonReferenceOneOf? = null,
            val requestingPhysician: PersonReferenceOneOf? = null,
            val placerOrderNumber: InstanceIdentifierOneOf,
        )
        data class PerformedOrderDetail(
            val orderDetail: OrderDetail,
            val fillerOrderNumber: InstanceIdentifierOneOf? = null,
val resultingClinicalInfo: List<ClinicalInfo> = listOf(),
        )
    }
}
