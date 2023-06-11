package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractComponentReport
import org.somda.protosdc.biceps.model.EpisodicComponentReport
import org.somda.protosdc.biceps.model.PeriodicComponentReport

sealed class AbstractComponentReportOneOf {
    data class ChoiceAbstractComponentReport(val value: AbstractComponentReport) : AbstractComponentReportOneOf()
    data class ChoiceEpisodicComponentReport(val value: EpisodicComponentReport) : AbstractComponentReportOneOf()
    data class ChoicePeriodicComponentReport(val value: PeriodicComponentReport) : AbstractComponentReportOneOf()
}
