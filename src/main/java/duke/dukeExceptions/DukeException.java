package duke.dukeExceptions;

public class DukeException extends Exception{
    public DukeException(String errorMsg) {
        super("OPS!!!! " + errorMsg);
    }
}
