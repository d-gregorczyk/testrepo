package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractOperationalStateReport
import org.somda.protosdc.biceps.model.EpisodicOperationalStateReport
import org.somda.protosdc.biceps.model.PeriodicOperationalStateReport

data class AbstractOperationalStateReportOneOf(
    sealed class AbstractOperationalStateReportOneOf {
        data class ChoiceAbstractOperationalStateReport(val value: AbstractOperationalStateReport) : AbstractOperationalStateReportOneOf()
        data class ChoiceEpisodicOperationalStateReport(val value: EpisodicOperationalStateReport) : AbstractOperationalStateReportOneOf()
        data class ChoicePeriodicOperationalStateReport(val value: PeriodicOperationalStateReport) : AbstractOperationalStateReportOneOf()
    }
)
