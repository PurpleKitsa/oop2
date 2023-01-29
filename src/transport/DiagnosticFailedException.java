package transport;

public class DiagnosticFailedException extends Throwable {
    public DiagnosticFailedException() {
        super("Необходимо указать  тип прав");
    }
}
