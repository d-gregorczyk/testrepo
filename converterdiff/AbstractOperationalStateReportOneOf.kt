package org.somda.protosdc.biceps.model

import org.somda.protosdc.biceps.model.AbstractOperationalStateReport
import org.somda.protosdc.biceps.model.EpisodicOperationalStateReport
import org.somda.protosdc.biceps.model.PeriodicOperationalStateReport

sealed class AbstractOperationalStateReportOneOf {
    data class ChoiceAbstractOperationalStateReport(val Choice: AbstractOperationalStateReport) : AbstractOperationalStateReportOneOf()
    data class ChoiceEpisodicOperationalStateReport(val Choice: EpisodicOperationalStateReport) : AbstractOperationalStateReportOneOf()
    data class ChoicePeriodicOperationalStateReport(val Choice: PeriodicOperationalStateReport) : AbstractOperationalStateReportOneOf()
}
