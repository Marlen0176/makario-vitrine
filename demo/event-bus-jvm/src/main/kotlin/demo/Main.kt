package demo

fun main() {
    val bus = EventBus()
    val audit = AuditLogger()
    val gate = ManagerGate(bus, audit)

    gate.install()

    bus.on<EvidenceCaptured> {
        audit.log("EvidenceCaptured user=${it.userId} evidence=${it.evidenceId}")
    }

    val user = "u-001"

    bus.publish(EvidenceCaptured(user, "ev-1001"))
    bus.publish(ExportRequested(user, "export://ev-1001"))
    bus.publish(ConsentChanged(user, true))
    bus.publish(ExportRequested(user, "export://ev-1001"))
}
