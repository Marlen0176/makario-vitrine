package demo
import java.time.Instant

sealed interface Event { val at: Instant }

data class ConsentChanged(
    val userId: String,
    val granted: Boolean,
    override val at: Instant = Instant.now()
) : Event

data class EvidenceCaptured(
    val userId: String,
    val evidenceId: String,
    override val at: Instant = Instant.now()
) : Event

data class ExportRequested(
    val userId: String,
    val payloadRef: String,
    override val at: Instant = Instant.now()
) : Event

data class ExportAllowed(
    val userId: String,
    val payloadRef: String,
    override val at: Instant = Instant.now()
) : Event

data class ExportDenied(
    val userId: String,
    val payloadRef: String,
    val reason: String,
    override val at: Instant = Instant.now()
) : Event
