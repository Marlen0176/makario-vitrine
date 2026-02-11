package demo

class ManagerGate(
    private val bus: EventBus,
    private val audit: AuditLogger
) {
    private val consent = mutableMapOf<String, Boolean>()

    fun install() {

        bus.on<ConsentChanged> {
            consent[it.userId] = it.granted
            audit.log("ConsentChanged user=${it.userId} granted=${it.granted}")
        }

        bus.on<ExportRequested> {
            val ok = consent[it.userId] == true
            if (ok) {
                audit.log("ExportAllowed user=${it.userId}")
                bus.publish(ExportAllowed(it.userId, it.payloadRef))
            } else {
                audit.log("ExportDenied user=${it.userId} reason=NO_CONSENT")
                bus.publish(ExportDenied(it.userId, it.payloadRef, "NO_CONSENT"))
            }
        }
    }
}
