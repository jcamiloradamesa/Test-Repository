/**
 * Represents a Container of Sequence Number generators.
 */
public interface MessageSequenceContainer {

    /**
     * Retrieves a sequence generator by its unique identifier and generates next sequence number by atomically
     * incrementing its current value.
     *
     * @param id the sequence generator identifier
     * @return the generated sequence number
     */
    long next(String id);

    /**
     * Retrieves the current value of a sequence generator by its unique identifier.
     *
     * @param id the sequence generator identifier
     * @return the last known sequence number
     */
    long last(String id);

}

